package fr.eni.Aplli.Enchere.bll.bo;

public class Retrait {
	
	private String rue ;
	private String codePostal ;
	private String ville ;
	
	//Les constructeurs
	
	public Retrait() {
	}
	
	public Retrait(String rue, String codePostal, String ville) {
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	//Getters et Setters

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//toString
	
	@Override
	public String toString() {
		return "Retrait [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + ", getRue()=" + getRue()
				+ ", getCodePostal()=" + getCodePostal() + ", getVille()=" + getVille() + "]";
	}
	
	

}
