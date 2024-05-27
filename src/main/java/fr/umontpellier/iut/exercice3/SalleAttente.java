package fr.umontpellier.iut.exercice3;

public class SalleAttente {
    private final FilePriorite<PersonnePriorisee> file;

    public SalleAttente() {
        file = new FilePriorite();
    }

    public void entrer(Personne p, int priorite) {
        file.ajouter(new PersonnePriorisee(p, priorite));
    }

    public Personne sortir() throws ArrayIndexOutOfBoundsException {
        return (file.enlever()).getPersonne();
    }
}
