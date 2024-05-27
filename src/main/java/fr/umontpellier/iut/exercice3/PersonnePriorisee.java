package fr.umontpellier.iut.exercice3;

public class PersonnePriorisee extends ObjetPriorise<PersonnePriorisee>{
    private final Personne personne;
    private final int priorite;

    public PersonnePriorisee(Personne personne, int priorite) {
        super(priorite);
        setObjet(this);
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
