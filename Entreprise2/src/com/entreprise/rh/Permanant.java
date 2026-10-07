package com.entreprise.rh;

import com.entreprise.exeptions.MontantInvalidExeption;

public class Permanant extends Employee implements Augmentable {
    private double salaireMensuel;

    public Permanant(String nom, double salaire) throws MontantInvalidExeption {
        super(nom);
        if (salaire <= 0) {
            throw new MontantInvalidExeption("salaire", salaire);
        }
        this.salaireMensuel = salaire;
    }

    public Permanant(String nom, double salaire, String agence) throws MontantInvalidExeption {
        super(nom, agence);
        if (salaire <= 0) {
            throw new MontantInvalidExeption("salaire", salaire);
        }
        this.salaireMensuel = salaire;
    }

    @Override
    public String getPoste() {
        return "Permanent";
    }

    @Override
    public double getSalaire() {
        return salaireMensuel;
    }

    @Override
    public void augmenter(double taux) throws MontantInvalidExeption {
        if (taux <= 0 || taux > tauxMax) {
            throw new MontantInvalidExeption("taux", taux);
        }
        salaireMensuel += salaireMensuel * taux;
    }

    @Override
    public String toString() {
        return getPoste() + "| "
                + super.toString()
                + ", salaire=" + getSalaire();
    }
}
