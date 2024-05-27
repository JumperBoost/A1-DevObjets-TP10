package fr.umontpellier.iut.exercice3;

public class Voiture {
    private final String immatriculation;
    private final String marque;

    public Voiture(String immatriculation, String marque) {
        this.immatriculation = immatriculation;
        this.marque = marque;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    @Override
    public String toString() {
        return "Voiture " + marque + " immatriculée " + immatriculation;
    }
}
