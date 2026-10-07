package com.entreprise.exeptions;

@SuppressWarnings("serial")
public class EquipeCompleteExeption extends RuntimeException {

    public EquipeCompleteExeption(int capacite) {
        super("équipe complète (capacité : " + capacite + ")");
    }
}