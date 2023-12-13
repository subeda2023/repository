package fr.eni.Appli.Enchere.ihm;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
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
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/jsp_css/utilisateur.jsp");
		rd.forward(request, response);
	}
	
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
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		getServletContext().getRequestDispatcher("/jsp_css/ajoutOK.html").forward(request, response);
	}
       
}
