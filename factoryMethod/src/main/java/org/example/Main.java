package org.example;

public class Main {
    public static void main(String[] args) {
        // Creăm o instanță a fabricii de produse
        ProductFactory factory = new ConcreteProductFactory();

        // Folosim fabrica pentru a crea un produs
        Product product = factory.createProduct();

        // Apelăm metoda produsului pentru a obține informații despre produs
        product.printInfo();
    }
}