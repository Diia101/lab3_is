package org.example;

public class Main {
    public static void main(String[] args) {
        // Creăm o instanță a fabricii abstracte
        AbstractFactory factory = new ConcreteFactory();

        // Folosim fabrica pentru a crea produsele A și B
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();

        // Apelăm metodele de afișare a informațiilor despre produse
        productA.displayInfo();
        productB.showInfo();
    }
}