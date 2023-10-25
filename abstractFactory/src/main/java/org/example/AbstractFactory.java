package org.example;

// Interfața pentru fabrica abstractă care creează produsele A și B
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}