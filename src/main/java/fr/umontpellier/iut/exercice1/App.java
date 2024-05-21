package fr.umontpellier.iut.exercice1;

public class App {
    public static void main(String[] args) {
        SalleAttente salle = new SalleAttente();
        Personne p1 = new Personne("Alex");
        Personne p2 = new Personne("Max");
        salle.entrer(p1, 4);
        salle.entrer(p2, 3);
        salle.sortir();
        salle.sortir();
    }
}
