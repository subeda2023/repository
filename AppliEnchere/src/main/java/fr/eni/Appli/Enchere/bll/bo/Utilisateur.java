package fr.eni.Appli.Enchere.bll.bo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utilisateur {
	
	
	private int noUtilisateur ;
	private String pseudo ;
	private String nom ;
	private String prenom ;
	private String email ;
	private String telephone ;
	private String rue ;
	private String codePostal ;
	private String ville ;
	private String motDePasse ;
	private int credit ;
	private boolean administrateur ;
	
	//Les constructeurs
	
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = HashPwd(motDePasse);
		this.credit = credit;
		this.administrateur = administrateur;
	}
	private String HashPwd(String motDePasse) {
		
		MessageDigest md=null;
		try {
			md = MessageDigest.getInstance("SHA-256");
		
		} catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}
		md.update(motDePasse.getBytes());
        byte byteData[] = md.digest();
 
	        //convertir le tableau  en chaine
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
 
	       return sb.toString();

	}

	public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		super();
		
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = HashPwd(motDePasse);
		this.credit = credit;
		this.administrateur = administrateur;
	}
	
	//Getters et Setters
	
	/**
	 * @return the noUtilisateur
	 */
	public int getNoUtilisateur() {
		return noUtilisateur;
	}



	/**
	 * @param noUtilisateur the noUtilisateur to set
	 */
	public void setNoUtilisateur(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}



	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}



	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}



	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}



	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}



	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}



	/**
	 * @return the codePostal
	 */
	public String getCodePostal() {
		return codePostal;
	}



	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}



	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}



	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}



	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}



	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = HashPwd(motDePasse);
	}



	/**
	 * @return the credit
	 */
	public int getCredit() {
		return credit;
	}



	/**
	 * @param credit the credit to set
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}



	/**
	 * @return the administrateur
	 */
	public boolean isAdministrateur() {
		return administrateur;
	}



	/**
	 * @param administrateur the administrateur to set
	 */
	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	}

	//toString

	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit=" + credit
				+ ", administrateur=" + administrateur + ", getNoUtilisateur()=" + getNoUtilisateur() + ", getPseudo()="
				+ getPseudo() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom() + ", getEmail()=" + getEmail()
				+ ", getTelephone()=" + getTelephone() + ", getRue()=" + getRue() + ", getCodePostal()="
				+ getCodePostal() + ", getVille()=" + getVille() + ", getMotDePasse()=" + getMotDePasse()
				+ ", getCredit()=" + getCredit() + ", isAdministrateur()=" + isAdministrateur() + "]";
	}

	public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}

	
	
	

}
