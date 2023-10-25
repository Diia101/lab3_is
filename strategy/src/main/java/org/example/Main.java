package org.example;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Plata cu card de credit
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(100);

        // Plata cu PayPal
        PaymentStrategy paypalPayment = new PayPalPayment("email@example.com");
        cart.setPaymentStrategy(paypalPayment);
        cart.checkout(50);
    }
}