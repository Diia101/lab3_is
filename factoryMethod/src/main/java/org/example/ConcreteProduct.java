package org.example;

// Clasa concretă care implementează interfața Product
class ConcreteProduct implements Product {
    @Override
    public void printInfo() {
        System.out.println("Acesta este un produs de tipul ConcreteProduct.");
    }
}