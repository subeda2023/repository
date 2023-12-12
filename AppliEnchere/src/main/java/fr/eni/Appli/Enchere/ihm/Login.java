package fr.eni.Appli.Enchere.ihm;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.Appli.Enchere.bll.UtilisateurManager;
import fr.eni.Appli.Enchere.bll.bo.Utilisateur;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Récupère les paramètres du formulaire du login
		String email;
		String motDePasse;
		Utilisateur utilisateur = null;
		HttpSession sess;
		
		email=request.getParameter("email");
		motDePasse=request.getParameter("motDePasse");
		
		//Appelle la méthode login
		
		try {
			utilisateur=UtilisateurManager.getInstance().login(email, motDePasse);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(utilisateur!=null)
		{
			//Si l'utilisateur trouvé, crée la session ou récupère la session
			sess=request.getSession();
			//Enregistre l'utilisateur trouvé dans la session
			sess.setAttribute("userConnected", utilisateur);
			//Crée un cookie pour stocker le dernier login
			Cookie C;
			C=new Cookie("lastLogin",utilisateur.getEmail());
			C.setMaxAge(60*24*60*60);
			response.addCookie(C);
			response.sendRedirect("Page d'acceuil");
		}
		else
		{
			//Si l'utilisateur n'est pas trouvé redirige vers la page login
			response.sendRedirect("login");
		}
	}

}