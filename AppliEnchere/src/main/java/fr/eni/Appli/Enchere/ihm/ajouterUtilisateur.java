package fr.eni.Appli.Enchere.ihm;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Appli.Enchere.bll.UtilisateurManager;
import fr.eni.Appli.Enchere.bll.bo.Utilisateur;

/**
 * Servlet implementation class ajouterUtilisateur
 */
@WebServlet("/ajouterUtilisateur")
public class ajouterUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur utilisateur=new Utilisateur(
				request.getParameter("pseudo"),
				request.getParameter("nom"),
				request.getParameter("prenom"),
				request.getParameter("email"),
				request.getParameter("telephone"),
				request.getParameter("rue"),
				request.getParameter("code_postal"),
				request.getParameter("ville"),
				request.getParameter("mot_de_passe"));
		try {
			UtilisateurManager.getInstance().insert(utilisateur);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("ajoutOK.html");
	}
       
}
