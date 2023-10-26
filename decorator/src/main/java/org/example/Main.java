package org.example;

public class Main {
    public static void main(String[] args) {
        // Creăm o cafea simplă
        Coffee coffee = new SimpleCoffee();
        System.out.println("Café simplă: " + coffee.description() + ", Cost: $" + coffee.cost());

        // Adăugăm lapte la cafea
        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cafea cu lapte: " + milkCoffee.description() + ", Cost: $" + milkCoffee.cost());

        // Adăugăm zahăr la cafea
        Coffee sweetCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cafea cu zahăr: " + sweetCoffee.description() + ", Cost: $" + sweetCoffee.cost());
    }
}