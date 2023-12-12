package fr.eni.Appli.Enchere.ihm;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.Appli.Enchere.bll.UtilisateurManager;
import fr.eni.Appli.Enchere.bll.bo.Utilisateur;

@WebServlet("/listerUtilisateur")
public class ListerUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		{
			HttpSession sess;
			sess =request.getSession();
			Utilisateur utilisateur;
			utilisateur=(Utilisateur)sess.getAttribute("userConnected");
			if(utilisateur!=null)
			{
				List<Utilisateur> lst = null;
				
					try {
						lst=UtilisateurManager.getInstance().findAll();
					     } 
					catch (ClassNotFoundException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
				    } 
					catch (SQLException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				request.setAttribute("liste", lst);
				getServletContext().getRequestDispatcher("/WEB-INF/listeUtilisateur.jsp").forward(request, response);
			}
			else
			{
			}
			
		}
		
	}
	

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
