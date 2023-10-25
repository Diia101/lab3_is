package org.example;
import java.util.ArrayList;
import java.util.List;

// Clasa Subiect (Subject)
class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void doSomething() {
        System.out.println("Subiectul face ceva.");
        notifyObservers("Subiectul a efectuat o acțiune.");
    }
}






