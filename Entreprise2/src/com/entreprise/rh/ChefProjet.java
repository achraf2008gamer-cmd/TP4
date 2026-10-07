package com.entreprise.rh;

import com.entreprise.exeptions.MontantInvalidExeption;

public class ChefProjet extends Permanant {

    public ChefProjet(String nom,
                      double salaire,
                      String agence)
            throws MontantInvalidExeption {

        super(nom, salaire, agence);
    }

    public double getPrime() {
        return 500;
    }

    @Override
    public String getPoste() {
        return "ChefProjet";
    }

    @Override
    public double getSalaire() {
        return super.getSalaire() + getPrime();
    }
}