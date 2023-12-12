package fr.eni.Appli.Enchere.bll.bo;

import java.time.LocalDate;

public class Enchere {
	
	private LocalDate dateEnchere ;
	private Float montant_enchere ;
	

	//Les constructeurs
	
	public Enchere() {
	
	}
	
	public Enchere(LocalDate dateEnchere, Float montant_enchere) {
		this.dateEnchere = dateEnchere;
		this.montant_enchere = montant_enchere;
	}
	
	//Getters et Setters
	

	public LocalDate getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public Float getMontant_enchere() {
		return montant_enchere;
	}

	public void setMontant_enchere(Float montant_enchere) {
		this.montant_enchere = montant_enchere;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//toString

	@Override
	public String toString() {
		return "Enchere [dateEnchere=" + dateEnchere + ", montant_enchere=" + montant_enchere + ", getDateEnchere()="
				+ getDateEnchere() + ", getMontant_enchere()=" + getMontant_enchere() + "]";
	}


}
