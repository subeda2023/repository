package fr.eni.Appli.Enchere.bll.bo;

import java.time.LocalDate;

public class ArticleVendu {
	
	private int noArticle ;
	private String nomArticle ;
	private String description ;
	private LocalDate dateDebutEncheres ;
	private LocalDate dateFinEncheres ;
	private float miseAPrix ;
	private float prixDeVente ;
	private Boolean etatVente ;
	
	//Les constructeurs
	
	public ArticleVendu() {

	}
	

	public ArticleVendu(int noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, float miseAPrix, float prixDeVente, Boolean etatVente) {
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.miseAPrix = miseAPrix;
		this.prixDeVente = prixDeVente;
		this.etatVente = etatVente;
	}
	
	//Getters et Setters

	

	public int getNoArticle() {
		return noArticle;
	}


	public void setNoArticle(int noArticle) {
		this.noArticle = noArticle;
	}


	public String getNomArticle() {
		return nomArticle;
	}


	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}


	public void setDateDebutEnchere(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}


	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}


	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}


	public float getMiseAPrix() {
		return miseAPrix;
	}


	public void setMiseAPrix(float miseAPrix) {
		this.miseAPrix = miseAPrix;
	}


	public float getPrixDeVente() {
		return prixDeVente;
	}


	public void setPrixDeVente(float prixDeVente) {
		this.prixDeVente = prixDeVente;
	}


	public Boolean getEtatVente() {
		return etatVente;
	}


	public void setEtatVente(Boolean etatVente) {
		this.etatVente = etatVente;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	//toString
	
	@Override
	public String toString() {
		return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEncheres="  + dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres + ", miseAPrix="
				+ miseAPrix + ", prixDeVente=" + prixDeVente + ", etatVente=" + etatVente + ", getNoArticle()="
				+ getNoArticle() + ", getNomArticle()=" + getNomArticle() + ", getDescription()=" + getDescription()
				+ ", getDateDebutEncheres()=" + getDateDebutEncheres() + ", getDateFinEncheres()=" + getDateFinEncheres()
				+ ", getMiseAPrix()=" + getMiseAPrix() + ", getPrixDeVente()=" + getPrixDeVente() + ", getEtatVente()="
				+ getEtatVente() + "]";
	}
	
	
	}
	
	
	


