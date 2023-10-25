package org.example;

public class Main {
    public static void main(String[] args) {
        // Creăm un subiect
        Subject subject = new Subject();

        // Creăm doi observatori
        Observer observer1 = new ConcreteObserver("Observator 1");
        Observer observer2 = new ConcreteObserver("Observator 2");

        // Înregistrăm observatorii la subiect
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        // Subiectul efectuează o acțiune și notifică observatorii
        subject.doSomething();

        // Dezactivăm un observator
        subject.removeObserver(observer1);

        // Subiectul efectuează o altă acțiune și notifică observatorul rămas
        subject.doSomething();
    }
}