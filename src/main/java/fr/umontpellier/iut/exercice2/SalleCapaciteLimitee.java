package fr.umontpellier.iut.exercice2;

import fr.umontpellier.iut.exercice2.exceptions.CapaciteMaximaleAtteinteException;
import fr.umontpellier.iut.exercice2.exceptions.SalleVideException;

public class SalleCapaciteLimitee {
    private final SalleAttente salleAttente;
    private final int capacite;
    private int nbPersonnes;

    public SalleCapaciteLimitee(int capacite) {
        this.salleAttente = new SalleAttente();
        this.capacite = capacite;
        nbPersonnes = 0;
    }

    public void entrer(Personne p, int priorite) throws CapaciteMaximaleAtteinteException {
        if(nbPersonnes == capacite)
            throw new CapaciteMaximaleAtteinteException(capacite);
        salleAttente.entrer(p, priorite);
        nbPersonnes++;
    }

    public Personne personneSuivante() throws SalleVideException {
        try {
            return salleAttente.sortir();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new SalleVideException();
        }
    }
}
