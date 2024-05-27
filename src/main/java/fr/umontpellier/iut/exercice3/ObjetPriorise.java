package fr.umontpellier.iut.exercice3;

public class ObjetPriorise<T> {
    private T objet;
    private final int priorite;

    public ObjetPriorise(T objet, int priorite) {
        this.objet = objet;
        this.priorite = priorite;
    }

    public ObjetPriorise(int priorite) {
        this.priorite = priorite;
    }

    public T getObjet() {
        return objet;
    }

    public void setObjet(T objet) {
        this.objet = objet;
    }

    public int getPriorite() {
        return priorite;
    }

    @Override
    public String toString() {
        return objet + " est de priorité " + priorite;
    }
}
