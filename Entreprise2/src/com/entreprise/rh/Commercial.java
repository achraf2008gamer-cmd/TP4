package com.entreprise.rh;

import com.entreprise.exeptions.MontantInvalidExeption;

	public class Commercial extends Employee implements Augmentable {
	    private double fixe;
	    private double chiffreAffaires;

	    public Commercial(String nom,double fixe,double chiffreAffaires,String agence)
	            throws MontantInvalidExeption {
	        super(nom, agence);
	        if (fixe <= 0) {
	            throw new MontantInvalidExeption("fixe", fixe);
	        }
	        if (chiffreAffaires < 0) {
	            throw new MontantInvalidExeption(
	                    "chiffreAffaires",
	                    chiffreAffaires
	            );
	        }
	        this.fixe = fixe;
	        this.chiffreAffaires = chiffreAffaires;
	    }

	    @Override
	    public String getPoste() {
	        return "Commercial";
	    }

	    @Override
	    public double getSalaire() {
	        return fixe + chiffreAffaires * 5 / 100;
	    }

	    @Override
	    public void augmenter(double taux) throws MontantInvalidExeption {
	        if (taux <= 0 || taux > tauxMax) {
	            throw new MontantInvalidExeption("taux", taux);
	        }
	        fixe += fixe * taux;
	    }

	    @Override
	    public String toString() {
	        return getPoste() + "(" + super.toString() + ", fixe=" + fixe
	                + ", chiffreAffaires=" + chiffreAffaires+ ")";
	    }
	}

