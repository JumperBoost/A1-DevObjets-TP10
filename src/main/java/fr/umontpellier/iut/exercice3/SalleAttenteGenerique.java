package fr.umontpellier.iut.exercice3;

public class SalleAttenteGenerique<T> {
    private final FilePriorite<ObjetPriorise<T>> file;

    public SalleAttenteGenerique() {
        file = new FilePriorite<>();
    }

    public void entrer(T objet, int priorite) {
        file.ajouter(new ObjetPriorise<>(objet, priorite));
    }

    public T sortir() throws ArrayIndexOutOfBoundsException {
        return file.enlever().getObjet();
    }
}
