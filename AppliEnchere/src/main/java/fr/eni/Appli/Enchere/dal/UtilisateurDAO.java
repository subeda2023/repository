package fr.eni.Appli.Enchere.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.Appli.Enchere.bll.bo.Utilisateur;

public class UtilisateurDAO {

	
	public static Utilisateur utilisateur ;
	public UtilisateurDAO() {

	}

	

	public void insert(Utilisateur utilisateur) throws ClassNotFoundException, SQLException {
		Connection cnx = ConnectionBDD();
		try {
			PreparedStatement pstmt = cnx.prepareStatement(
					"INSERT INTO Utilisateurs (pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur) values(?,?,?,?,?,?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setString(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setString(7, utilisateur.getCodePostal());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMotDePasse());
			pstmt.setInt(10, utilisateur.getCredit());
			pstmt.setBoolean(11, utilisateur.isAdministrateur());
			
			int nbRows = pstmt.executeUpdate();
			
			if (nbRows == 1) {
				ResultSet res = pstmt.getGeneratedKeys();
				if(res.next()) {
					utilisateur.setNoUtilisateur(res.getInt(1));
				}
			}
			cnx.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public void deleteById(Integer noUtilisateur) throws ClassNotFoundException, SQLException {
		Connection cnx = ConnectionBDD();
		System.out.println(noUtilisateur);
		
		try {
			//recherche de l'utilisateur
				Utilisateur utilisateur = this.findById(noUtilisateur);
			
			if (utilisateur== null) {
				System.out.println("Utilisateur introuvable");
			}
			else {
			// si l'utilisateur existe 
			PreparedStatement pstmt = cnx.prepareStatement(
					"DELETE FROM Utilisateurs WHERE no_utilisateur=?");
			pstmt.setInt(1,noUtilisateur);
			pstmt.executeUpdate();
			cnx.close();
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public List <Utilisateur> findAll() throws ClassNotFoundException, SQLException {
		List <Utilisateur> utilisateurs = new ArrayList<Utilisateur>() ;
		Connection cnx = ConnectionBDD();
		try {
			PreparedStatement pstmt = cnx.prepareStatement(
					"SELECT * FROM Utilisateurs");
			ResultSet res=pstmt.executeQuery();
		while (res.next()) {
			Utilisateur utilisateur =new Utilisateur() ;
			utilisateur.setPseudo(res.getString("pseudo")) ;
			utilisateur.setNom(res.getString("nom")) ;
			utilisateur.setPrenom(res.getString("prenom")) ;
			utilisateur.setEmail(res.getString("email")) ;
			utilisateur.setTelephone(res.getString("telephone")) ;
			utilisateur.setRue(res.getString("rue")) ;
			utilisateur.setCodePostal(res.getString("code_postal")) ;
			utilisateur.setVille(res.getString("ville")) ;
			utilisateur.setMotDePasse(res.getString("mot_de_passe")) ;
			utilisateur.setCredit(res.getInt("Credit")) ;
			utilisateur.setAdministrateur(res.getBoolean("administrateur")) ;
		
			utilisateurs.add(utilisateur) ;
			
		}
		
			cnx.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return utilisateurs ;
	}
	
	
	public void deleteByEmail (String email ) throws ClassNotFoundException, SQLException {
		Connection cnx = ConnectionBDD();
		try {
			PreparedStatement pstmt = cnx.prepareStatement(
					"DELETE FROM Utilisateurs WHERE email=? ");
			pstmt.setString(1, utilisateur.getEmail());
			pstmt.executeUpdate();
			cnx.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public Utilisateur findByEmail(String email) throws ClassNotFoundException, SQLException {
		Connection cnx = ConnectionBDD();
		try {
			PreparedStatement pstmt = cnx.prepareStatement("SELECT * FROM Utilisateurs WHERE email=?");
			pstmt.setString(1, email);
			ResultSet res = pstmt.executeQuery();
			if (res.next()) {
				utilisateur = new Utilisateur();
				utilisateur.setPseudo(res.getString("pseudo"));
				utilisateur.setNom(res.getString("nom"));
				utilisateur.setPrenom(res.getString("prenom"));
				utilisateur.setEmail(res.getString("email"));
				utilisateur.setTelephone(res.getString("telephone"));
				utilisateur.setRue(res.getString("rue"));
				utilisateur.setCodePostal(res.getString("code_postal"));
				utilisateur.setVille(res.getString("ville"));
				utilisateur.setMotDePasse(res.getString("mot_de_passe"));
				utilisateur.setCredit(res.getInt("credit"));
				utilisateur.setAdministrateur(res.getBoolean("administrateur"));
			}
			cnx.close();	
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
		
	}
	
	public void update() throws ClassNotFoundException, SQLException {
		Connection cnx = ConnectionBDD();
		try {
			PreparedStatement pstmt = cnx.prepareStatement("UPDATE Utilisateurs SET pseudo =?, nom=?, prenom=?, email=?,telephone=?, rue=?,code_postal=?,ville=?,mot_de_passe=?,credit=?,administrateur=?  WHERE email=?");
			pstmt.setString(1, utilisateur.getPseudo());
			pstmt.setString(2, utilisateur.getNom());
			pstmt.setString(3, utilisateur.getPrenom());
			pstmt.setString(4, utilisateur.getEmail());
			pstmt.setString(5, utilisateur.getTelephone());
			pstmt.setString(6, utilisateur.getRue());
			pstmt.setString(7, utilisateur.getCodePostal());
			pstmt.setString(8, utilisateur.getVille());
			pstmt.setString(9, utilisateur.getMotDePasse());
			pstmt.setInt(10, utilisateur.getCredit());
			pstmt.setBoolean(11, utilisateur.isAdministrateur());
			pstmt.executeUpdate();
			cnx.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Utilisateur login (String email, String motDePasse) throws ClassNotFoundException, SQLException {
		Connection cnx = ConnectionBDD();
		Utilisateur utilisateur=null;
		try {
			PreparedStatement pstmt = cnx.prepareStatement("SELECT * FROM Utilisateurs WHERE email=? and mot_de_passe=?");
			pstmt.setString(1, email);
			pstmt.setString(2, motDePasse);
			ResultSet res = pstmt.executeQuery();
			if (res.next()) {
				utilisateur = new Utilisateur();
				utilisateur.setPseudo(res.getString("pseudo"));
				utilisateur.setNom(res.getString("nom"));
				utilisateur.setPrenom(res.getString("prenom"));
				utilisateur.setEmail(res.getString("email"));
				utilisateur.setTelephone(res.getString("telephone"));
				utilisateur.setRue(res.getString("rue"));
				utilisateur.setCodePostal(res.getString("code_postal"));
				utilisateur.setVille(res.getString("ville"));
				utilisateur.setMotDePasse(res.getString("mot_de_passe"));
				utilisateur.setCredit(res.getInt("credit"));
				utilisateur.setAdministrateur(res.getBoolean("administrateur"));
			}
			cnx.close();	
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
	}
	
	
	

	
	
	public Utilisateur findById(int noUtilisateur) throws ClassNotFoundException, SQLException {
		Connection cnx = ConnectionBDD();
		try {
			PreparedStatement pstmt = cnx.prepareStatement("SELECT * FROM Utilisateurs WHERE no_utilisateur=?");
			pstmt.setInt(1, noUtilisateur);
			ResultSet res = pstmt.executeQuery();
			if (res.next()) {
				utilisateur = new Utilisateur();
				utilisateur.setPseudo(res.getString("pseudo"));
				utilisateur.setNom(res.getString("nom"));
				utilisateur.setPrenom(res.getString("prenom"));
				utilisateur.setEmail(res.getString("email"));
				utilisateur.setTelephone(res.getString("telephone"));
				utilisateur.setRue(res.getString("rue"));
				utilisateur.setCodePostal(res.getString("code_postal"));
				utilisateur.setVille(res.getString("ville"));
				utilisateur.setMotDePasse(res.getString("mot_de_passe"));
				utilisateur.setCredit(res.getInt("credit"));
				utilisateur.setAdministrateur(res.getBoolean("administrateur"));
			}
			cnx.close();	
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return utilisateur;
		
	}
	private static Connection ConnectionBDD() throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url = "jdbc:sqlserver://localhost:1433;database=AppliEnchere;encrypt=false;trustservercertificate=true"; // fabriquer l'url de connexion																											
		Connection con = DriverManager.getConnection(url, "sa", "Pa$$w0rd"); // lance la connexion
		return con;
	}
}
	
