package org.example;

// Decorator abstract
abstract class CoffeeDecorator implements Coffee {
 //e protected ca sa nu l poata accesa orice clasa
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }

    @Override
    public String description() {
        return decoratedCoffee.description();
    }
}