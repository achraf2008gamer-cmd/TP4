package com.entreprise.compta;

public class Facture implements Payable {
	private String numero;
	private String fournisseur;
	private double montant;
	
	public Facture(String numero, String fournisseur, double montant) {
		this.numero = numero;
		this.fournisseur = fournisseur;
		this.montant = montant;
	}

	public double getMontantPayer() {
		return montant;
	}
	
	public String toString() {
		return "Facture F-"+numero+" ("+fournisseur+") "+ montant; 
	}
	

}
