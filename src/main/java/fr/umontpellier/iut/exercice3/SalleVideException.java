package fr.umontpellier.iut.exercice3;

public class SalleVideException extends SalleCapaciteLimiteeException {
    public SalleVideException() {
        super("Cette salle est vide.");
    }
}
