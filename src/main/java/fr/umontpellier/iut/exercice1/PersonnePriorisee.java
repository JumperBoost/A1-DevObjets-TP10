package fr.umontpellier.iut.exercice1;

public class PersonnePriorisee {
    private final Personne personne;
    private final int priorite;

    public PersonnePriorisee(Personne personne, int priorite) {
        this.personne = personne;
        this.priorite = priorite;
    }

    public Personne getPersonne() {
        return personne;
    }

    public int getPriorite() {
        return priorite;
    }

    @Override
    public String toString() {
        return personne + " est de priorité " + priorite;
    }
}
