package com.entreprise.app;

import com.entreprise.compta.Facture;

public class DecouverteExeptions {

    private static Facture f;

	public static void main(String[] args) {

        try {
            double[] primes = new double[3];
            primes[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    e.getClass().getSimpleName()
                    + " : " + e.getMessage()
            );
        }

        try {
        } catch (NumberFormatException e) {
            System.out.println(
                    e.getClass().getSimpleName()
                    + " : " + e.getMessage()
            );
        }

        try {
            f = null;
            f.getMontantPayer();
        } catch (NullPointerException e) {
            System.out.println(
                    e.getClass().getSimpleName()
                    + " : " + e.getMessage()
            );
        }

        try {
        } catch (ArithmeticException e) {
            System.out.println(
                    e.getClass().getSimpleName()
                    + " : " + e.getMessage()
            );
        } finally {
            System.out.println("Fin des essais");
        }
    }
}