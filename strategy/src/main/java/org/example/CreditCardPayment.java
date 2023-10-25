package org.example;

// Implementări ale interfeței PaymentStrategy
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Efectuare plată cu cardul de credit " + cardNumber + " în valoare de $" + amount);
    }
}