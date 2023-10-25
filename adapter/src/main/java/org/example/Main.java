package org.example;


public class Main {
    public static void main(String[] args) {
        // Creăm o instanță a sistemului vechi
        OldSystem oldSystem = new OldSystem();

        // Creăm un adaptator pentru sistemul vechi
        NewSystem adapter = new Adapter(oldSystem);

        // Apelăm metoda request a sistemului nou, care este de fapt adaptat de sistemul vechi
        adapter.request();
    }
}