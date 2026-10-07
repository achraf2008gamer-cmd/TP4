package com.entreprise.rh;

import com.entreprise.exeptions.MontantInvalidExeption;

public interface Augmentable {
	public double tauxMax = 0.20;
	
	public void augmenter(double taux) throws MontantInvalidExeption;
	public default void augmenterStandard() throws MontantInvalidExeption {
		augmenter(0.05);
	}

}
