package fr.eni.Appli.Enchere.bll;

import java.sql.SQLException;
import java.util.List;

import fr.eni.Appli.Enchere.bll.bo.Utilisateur;
import fr.eni.Appli.Enchere.dal.DAOFactory;
import fr.eni.Appli.Enchere.dal.UtilisateurDAO;

public class UtilisateurManager {
	
	private static UtilisateurManager instance = null;
	private UtilisateurDAO utilisateurDAO;
	
	public UtilisateurManager(UtilisateurDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}
	
	
	public static UtilisateurManager getInstance() {

		if (instance == null) {
			instance = new UtilisateurManager(DAOFactory.getInstance());
		}
		return instance;

	}
	public Utilisateur login(String email, String motDePasse) throws ClassNotFoundException, SQLException {
		return utilisateurDAO.login(email, motDePasse);
	}

	public Utilisateur findByEmail( String email) throws ClassNotFoundException, SQLException {
		return utilisateurDAO.findByEmail(email);
	}
 
	public void insert(Utilisateur utilisateur) throws ClassNotFoundException, SQLException {
		utilisateur.setNom(utilisateur.getNom().toUpperCase());
		utilisateurDAO.insert(utilisateur);
	}
	
	public void deleteByMail(String email) throws ClassNotFoundException, SQLException {
		utilisateurDAO.deleteByEmail(email);
	}
	
	public void deleteById(int noUtilisateur) throws ClassNotFoundException, SQLException {
		utilisateurDAO.deleteById(noUtilisateur);
	}

	public void update(Utilisateur utilisateur) throws ClassNotFoundException, SQLException {
		utilisateurDAO.update();
	}
	
	public List<Utilisateur> findAll() throws ClassNotFoundException, SQLException{
		return utilisateurDAO.findAll();
	}
	
	public Utilisateur findById(int noUtilisateur) throws ClassNotFoundException, SQLException {
		return utilisateurDAO.findById(noUtilisateur);
	}
	
	public boolean verificationEmail(String email) {
		if(email.contains("@")) {
			return true;
		}
		return false;
	}
	
	public boolean verificationMotDePasse(String motDePasse) {
		char mdp;
		boolean nombreOk = false;
		boolean lettreOk = false;
		
		for(int i = 0; i<motDePasse.length(); i++) {
			mdp = motDePasse.charAt(i);
			if(Character.isLetter(mdp)) {
				lettreOk=true;
			}
			else if(Character.isDigit(mdp)) {
				nombreOk=true;
			}
		}
		return nombreOk && lettreOk;
	}
}
