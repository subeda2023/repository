package fr.eni.Appli.Enchere.dal;

public class DAOFactory {
	
	
	
	public static UtilisateurDAO getInstance() {
		UtilisateurDAO instance = null;
			if (instance == null) {
				instance = new UtilisateurDAO();
			}
			return instance;

		}
	
	public static UtilisateurDAO getUtilisateurDAO() {
		UtilisateurDAO utilisateurDAO=null;
		try {
			utilisateurDAO=(UtilisateurDAO) Class.forName("fr.eni.Appli.Enchere.dal.UtilisateurDAO").newInstance();
		}
		catch (InstantiationException e) {
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		return utilisateurDAO;
	}

}
