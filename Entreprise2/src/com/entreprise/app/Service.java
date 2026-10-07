package com.entreprise.app;

import com.entreprise.rh.Employee;
import com.entreprise.exeptions.EquipeCompleteExeption;

import java.util.Arrays;

public class Service {

    private Employee[] employes;
    private int nb;

    public Service(int capacite) {
        employes = new Employee[capacite];
        nb = 0;
    }

    public void ajouter(Employee e) {

        if (nb >= employes.length) {
            throw new EquipeCompleteExeption(employes.length);
        }

        employes[nb] = e;
        nb++;
    }

    public Employee getEmploye(int i) {
        if (i < 0 || i >= nb) {
            throw new IllegalArgumentException(
                    "indice invalide : " + i
            );
        }
        return employes[i];
    }

    public int getNb() {
        return nb;
    }

    public double getMasseSalariale() {
        double total = 0;
        for (int i = 0; i < nb; i++) {
            total += employes[i].getSalaire();
        }
        return total;
    }

    public void trier() {
        Arrays.sort(employes, 0, nb);
    }

    public void afficher() {
        for (int i = 0; i < nb; i++) {
            System.out.println(i + " : " + employes[i]);
        }
    }
}