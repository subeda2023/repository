package fr.eni.Appli.Enchere.ihm;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.Aplli.Enchere.bll.bo.Utilisateur;
import fr.eni.Appli.Enchere.bll.UtilisateurManager;

/**
 * Servlet implementation class ModifierUtilisateur
 */
@WebServlet("/ModifierUtilisateur")
public class ModifierUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		int noUtilisateur = Integer.parseInt(request.getParameter("no_utilisateur"));
		try {
			//recherche de l'utilisateur à modifier
			request.setAttribute("utilisateur", UtilisateurManager.getInstance().findById(noUtilisateur));
			getServletContext().getRequestDispatcher("/WEB-INF/modifier.jsp").forward(request, response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur utilisateur;
		int noUtilisateur = Integer.parseInt(request.getParameter("no_utilisateur"));
		//String email = request.getParameter("email");
		try {
			//rechercher de l'utilisateur à modifier
			utilisateur = UtilisateurManager.getInstance().findById(noUtilisateur);
			
			//modification des champs nécessaires
			utilisateur.setPseudo(request.getParameter("pseudo"));
			utilisateur.setNom(request.getParameter("nom"));
			utilisateur.setPrenom(request.getParameter("prenom"));	
			utilisateur.setEmail(request.getParameter("email"));
			utilisateur.setTelephone(request.getParameter("telephone"));
			utilisateur.setRue(request.getParameter("rue"));
			utilisateur.setCodePostal(request.getParameter("code_postal"));
			utilisateur.setVille(request.getParameter("ville"));
			utilisateur.setMotDePasse(request.getParameter("mot_de_passe"));
			
			//mettre à jour l'utilisateur
			UtilisateurManager.getInstance().update(utilisateur);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
			// renvoyer vers la liste des utilisateurs
			response.sendRedirect("lister");
				
				
	}

}
