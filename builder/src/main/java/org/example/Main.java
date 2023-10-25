package org.example;

public class Main {
    public static void main(String[] args) {
        // Creăm un obiect Product folosind Builder Pattern
        Product product = new Product.ProductBuilder("Produs1", 100)
                .setDescription("Descriere produs 1")
                .build();

        // Accesăm atributele obiectului Product
        System.out.println("Nume: " + product.getName());
        System.out.println("Preț: " + product.getPrice());
        System.out.println("Descriere: " + product.getDescription());
    }
}