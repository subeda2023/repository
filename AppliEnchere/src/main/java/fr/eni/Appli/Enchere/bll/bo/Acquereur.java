package fr.eni.Appli.Enchere.bll.bo;

public class Acquereur extends Utilisateur {
	
	//Les constructeurs

	public Acquereur() {
	
	}

	public Acquereur(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		super(noUtilisateur, pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse, credit,
				administrateur);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
