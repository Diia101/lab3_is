package org.example;

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Efectuare plată PayPal pentru " + email + " în valoare de $" + amount);
    }
}