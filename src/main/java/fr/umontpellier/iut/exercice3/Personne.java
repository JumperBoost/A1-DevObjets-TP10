package fr.umontpellier.iut.exercice3;

public class Personne {
    private final String nom;

    public Personne(String s) {
        nom = s;
    }

    @Override
    public String toString() {
        return nom;
    }
}