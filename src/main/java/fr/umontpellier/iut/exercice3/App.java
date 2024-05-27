package fr.umontpellier.iut.exercice3;

public class App {
    public static void main(String[] args) {
        SalleAttenteGenerique<Personne> sallePersonnes = new SalleAttenteGenerique<>();
        Personne p1 = new Personne("Alex");
        Personne p2 = new Personne("Max");
        Personne p3 = new Personne("Bernard");
            sallePersonnes.entrer(p1, 4);
            System.out.println("Première personne ajouté.");
            sallePersonnes.entrer(p2, 3);
            System.out.println("Deuxième personne ajouté.");
            sallePersonnes.entrer(p3, 2);
            System.out.println("Troisième personne ajouté.");
        try {
            while (true)
                System.out.println("La personne suivante est " + sallePersonnes.sortir() + ".");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }


        SalleAttenteGenerique<Voiture> sallesVoitures = new SalleAttenteGenerique<>();
        Voiture v1 = new Voiture("ABC-123", "Renault");
        Voiture v2 = new Voiture("DEF-456", "Peugeot");
        Voiture v3 = new Voiture("GHI-789", "Citroën");
        sallesVoitures.entrer(v1, 4);
        System.out.println("Première voiture ajouté.");
        sallesVoitures.entrer(v2, 3);
        System.out.println("Deuxième voiture ajouté.");
        sallesVoitures.entrer(v3, 2);
        System.out.println("Troisième voiture ajouté.");
        try {
            while (true)
                System.out.println("La voiture suivante est " + sallesVoitures.sortir() + ".");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
