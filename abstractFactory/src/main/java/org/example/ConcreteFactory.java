package org.example;

// Clasa concretă pentru fabrica abstractă care creează produsele A1, A2 și B1, B2
class ConcreteFactory implements AbstractFactory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}