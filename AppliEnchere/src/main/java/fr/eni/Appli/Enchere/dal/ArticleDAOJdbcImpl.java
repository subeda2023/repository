package fr.eni.Appli.Enchere.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fr.eni.Appli.Enchere.bll.bo.ArticleVendu;
import fr.eni.Appli.Enchere.bll.bo.Utilisateur;


public class ArticleDAOJdbcImpl implements ArticleDAO {

	private static final String SELECT_ALL = "SELECT * from articles_vendus";
	private static final String INSERT_ARTICLE="INSERT into articles_vendus(nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial) values(?,?,?,?,?)";

	
		
		
		//lancer la connection		
		private static Connection ConnectionBDD() throws ClassNotFoundException, SQLException {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;database=AppliEnchere;encrypt=false;trustservercertificate=true"; // fabriquer l'url de connexion																											
			Connection cnx = DriverManager.getConnection(url, "sa", "Pa$$w0rd"); // lance la connexion
			return cnx;
		}	
	
	


	@Override
	public void insert(ArticleVendu article) throws BusinessException {
		if(article == null) {
			//lever les erreurs d'insertion null
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatArticleDAO.INSERT_OBJET_NULL);
			throw businessException;
		}
		try (Connection cnx = new ConnectionBDD() ){
			try {
				cnx.setAutoCommit(false);
				PreparedStatement pstmt = cnx.prepareStatement(INSERT_ARTICLE, PreparedStatement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, article.getNomArticle());
				pstmt.setString(2, article.getDescription());
				pstmt.setDate(3, java.sql.Date.valueOf(article.getDateDebutEncheres()));
				pstmt.setDate(4, java.sql.Date.valueOf(article.getDateFinEncheres()));
				pstmt.setFloat(5, article.getMiseAPrix());
				pstmt.executeUpdate();
				
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					article.setNoArticle(rs.getInt(1));
				}
				rs.close();
				pstmt.close();
				
			}
			catch (Exception e) {
				e.printStackTrace();
				cnx.rollback();
				throw e;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatArticleDAO.INSERT_OBJET_ECHEC);
			throw businessException;
		}
		
	}

	@Override
	public void deleteById(ArticleVendu article) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ArticleVendu> findAll() {
		List<ArticleVendu> listeArticle = new ArrayList<>();
		try(Connection cnx = new ConnectionBDD()){
			PreparedStatement pstmt = cnx.prepareStatement(SELECT_ALL);
			ResultSet rs = pstmt.executeQuery();
			ArticleVendu articleCourant = new ArticleVendu();
			while(rs.next()) {
				if(rs.getInt("noArticle")!=articleCourant.getNoArticle()) {
					articleCourant.setNomArticle(rs.getString("nom_article"));
					articleCourant.setDescription(rs.getString("description"));
					articleCourant.setDateDebutEncheres(rs.getDate("date_debut_encheres"));
					articleCourant.setDateFinEncheres(rs.getDate("date_debut_encheres"));
					articleCourant.setMiseAPrix(rs.getFloat("prix_initial"));
					
				
					listeArticle.add(articleCourant) ;
				}
				cnx.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return listeArticle;
	}

	@Override
	public void modifierArticle(ArticleVendu article) {
		// TODO Auto-generated method stub
		
	}


	
}
