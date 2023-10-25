package org.example;

// Clasa concretă care implementează Factory și creează produse de tipul ConcreteProduct
class ConcreteProductFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct();
    }
}