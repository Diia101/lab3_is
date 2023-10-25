package org.example;

// Clasa frunză care implementează Componenta
class Ellipse implements Graphic {
    @Override
    public void draw() {
        System.out.println("Desenez o elipsă");
    }
}
