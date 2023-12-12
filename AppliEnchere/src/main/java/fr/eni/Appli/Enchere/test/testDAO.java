package fr.eni.Appli.Enchere.test;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Appli.Enchere.bll.bo.Utilisateur;
import fr.eni.Appli.Enchere.dal.UtilisateurDAO;

/**
 * Servlet implementation class testDAO
 */
@WebServlet("/test/testDAO")
public class testDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static void main(String[] args) {
		UtilisateurDAO utilisateurDAO=new UtilisateurDAO();
		try {
			utilisateurDAO.deleteById(18);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
		
				
			
		
		
		
		
		
		/*try {
			
			utilisateur.setPseudo("tatajs");
			utilisateur.setNom("Tutu");
			utilisateur.setPrenom("Lou");
			utilisateur.setEmail("mail@mail2.fr");
			utilisateur.setTelephone("010203040506");
			utilisateur.setRue("5 rue Poularde");
			utilisateur.setCodePostal("95400");
			utilisateur.setVille("Prout");
			utilisateur.setMotDePasse("123456");
			utilisateur.setCredit(400);
			utilisateur.setAdministrateur(false);
			
			//testLogin();//test ok
			//testdeleteByEmail("email4@email.com"); //test ok
			//utilisateurDAO.save(utilisateur);//test ok
			//testFindByEmail("email4@mail.fr");// test ok
			utilisateurDAO.insert(utilisateur);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}*/
		
		
	
		//TODO à mettre ds dao
		public static Utilisateur testFindByEmail(String email) throws ClassNotFoundException, SQLException {
			UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
			  // Vérifiez que l'utilisateur existe
			  Utilisateur utilisateur = utilisateurDAO.findByEmail(email);
			  if (utilisateur == null) {
			    System.out.println("Utilisateur introuvable");
			    return utilisateur;
			  }
			  else {
				  System.out.println("utilisateur trouvé :");
				  System.out.println(utilisateur);
				  return utilisateur;
			  }
		}
		//TODO à intégrer dao
		public static void testdeleteByEmail(String email) throws ClassNotFoundException, SQLException{
			UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
			String mail = "email4@email.com";
			try {
					Utilisateur utilisateur = utilisateurDAO.findByEmail(mail);
				
				if (utilisateur == null) {
					System.out.println("Utilisateur introuvable");
				}
				if (utilisateur != null) {
					 // Supprimez l'utilisateur
					 utilisateurDAO.deleteByEmail(email);
				}
			}
			catch (SQLException e)  {
				e.printStackTrace();
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
				
		}


		public static void testLogin() throws SQLException, ClassNotFoundException {

			  // Créez un objet UtilisateurDAO
			  UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
			  Utilisateur utilisateur = new Utilisateur();

			  // Entrez les informations de connexion
			  String email = "email4@email.com";
			  String motDePasse = "mdp@1";
			  
			  utilisateur = utilisateurDAO.login(email, motDePasse);
			  
			  // Vérifiez si l'utilisateur existe et si son mot de passe est correct
			  if (utilisateur != null && utilisateur.getMotDePasse().equals(motDePasse)) {
			    System.out.println("Connexion réussie");
			  } else {
			    System.out.println("Connexion échouée");
			  }
		}
}
