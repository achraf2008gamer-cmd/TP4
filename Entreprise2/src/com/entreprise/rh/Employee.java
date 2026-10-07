package com.entreprise.rh;

import com.entreprise.compta.Payable;

public abstract class Employee implements Payable, Comparable {

    protected String matricule;
    protected String nom;
    protected String agence;
    private static int nbEmployes = 0;

    public Employee(String nom, String agence) {
        nbEmployes++;
        this.matricule = "E" + nbEmployes;
        this.nom = nom;
        this.agence = agence;
    }

    public Employee(String nom) {
        this(nom, "Casablanca");
    }

    public abstract String getPoste();
    public abstract double getSalaire();

    @Override
    public double getMontantPayer() {
        return getSalaire();
    }

    @Override
    public int compareTo(Employee autre) {
        return Double.compare(this.getSalaire(), autre.getSalaire());
    }

    public boolean estMieuxPayeQue(Employee autre) {
        return compareTo(autre) > 0;
    }

    public static int getNbEmployes() {
        return nbEmployes;
    }

    @Override
    public String toString() {
        return "matricule=" + matricule
                + ", nom=" + nom
                + ", agence=" + agence;
    }
}
	
