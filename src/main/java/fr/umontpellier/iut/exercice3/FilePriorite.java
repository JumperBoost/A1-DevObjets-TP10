package fr.umontpellier.iut.exercice3;

import java.util.ArrayList;

public class FilePriorite<T extends ObjetPriorise> {
    private final ArrayList<T> liste;

    public FilePriorite() {
        liste = new ArrayList<>();
    }

    public void ajouter(T d) {
        if(d != null && !liste.contains(d))
            liste.add(d);
    }

    private int selectionnerSelonOrdre() {
        int index = 0;
        for(int i = 0; i < liste.size(); i++)
            if(liste.get(i).getPriorite() < liste.get(index).getPriorite())
                index = i;
        return index;
    }

    public T enlever() throws ArrayIndexOutOfBoundsException {
        if(liste.isEmpty())
            throw new ArrayIndexOutOfBoundsException("La liste est vide");
        return liste.remove(selectionnerSelonOrdre());
    }
}
