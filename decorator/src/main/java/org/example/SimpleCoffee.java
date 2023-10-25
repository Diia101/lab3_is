package org.example;

// Clasa de bază (concrete component)
class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Cafea simplă";
    }
}
