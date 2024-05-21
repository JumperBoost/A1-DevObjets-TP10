package fr.umontpellier.iut.exercice2;

import fr.umontpellier.iut.exercice2.exceptions.CapaciteMaximaleAtteinteException;
import fr.umontpellier.iut.exercice2.exceptions.SalleVideException;

public class App {
    public static void main(String[] args) {
        SalleCapaciteLimitee salle = new SalleCapaciteLimitee(2);
        Personne p1 = new Personne("Alex");
        Personne p2 = new Personne("Max");
        Personne p3 = new Personne("Bernard");
        try {
            salle.entrer(p1, 4);
            System.out.println("Première personne ajouté.");
            salle.entrer(p2, 3);
            System.out.println("Deuxième personne ajouté.");
            salle.entrer(p3, 2);
            System.out.println("Troisième personne ajouté.");
        } catch (CapaciteMaximaleAtteinteException e) {
            System.err.println(e.getMessage());
        }

        try {
            while (true)
                System.out.println("La personne suivante est " + salle.personneSuivante() + ".");
        } catch (SalleVideException e) {
            System.err.println(e.getMessage());
        }
    }
}
