package fr.eni.Appli.Enchere.bll.bo;

public class Categorie {
	
	private int noCategorie ;
	private String libelle ;
	
	//Les constructeurs
	
	public Categorie() {
	}

	public Categorie(int noCategorie, String libelle) {
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}

	//Getters et Setters
	
	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//toString

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + ", getNoCategorie()="
				+ getNoCategorie() + ", getLibelle()=" + getLibelle() + "]";
	}
	
	

}
