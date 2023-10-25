package org.example;

public class Main {
    public static void main(String[] args) {
        // Creăm câteva obiecte grafice
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();

        // Creăm un obiect grafic compozit și adăugăm elipsele în el
        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(ellipse1);
        compositeGraphic.add(ellipse2);
        compositeGraphic.add(ellipse3);

        // Apelăm metoda de desenare a obiectului compozit
        compositeGraphic.draw();
    }
}