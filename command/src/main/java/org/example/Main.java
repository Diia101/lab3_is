package org.example;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOnCommand = new TurnOnLightCommand(light);
        Command turnOffCommand = new TurnOffLightCommand(light);

        RemoteControl remote = new RemoteControl();

        // Setăm comanda și o executăm
        remote.setCommand(turnOnCommand);
        remote.pressButton();

        // Setăm o altă comandă și o executăm
        remote.setCommand(turnOffCommand);
        remote.pressButton();
    }
}