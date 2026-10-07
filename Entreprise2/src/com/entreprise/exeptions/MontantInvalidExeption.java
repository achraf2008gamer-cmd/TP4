package com.entreprise.exeptions;

@SuppressWarnings("serial")
public class MontantInvalidExeption extends Exception {

    private double valeur;
    public MontantInvalidExeption(String champ, double valeur) {
        super(champ + " invalide : " + valeur);
        this.valeur = valeur;
    }

    public double getValeur() {
        return valeur;
    }
}