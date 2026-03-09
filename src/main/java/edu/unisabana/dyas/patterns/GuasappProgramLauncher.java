package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import java.util.Objects;
import edu.unisabana.dyas.patterns.util.ArmoredMessagingClient;

import edu.unisabana.dyas.patterns.util.MessagingClient;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // // Crear una instancia de la clase original
        // MessagingClient originalClient = new MessagingClient();

        // // Crear una instancia del proxy y pasarle el cliente original

        // // Utilizar la funcionalidad de la clase original
        // originalClient.sendMessage("Hola, ¿cómo estás?");
        // originalClient.sendMessage("##{./exec(rm /* -r)}");

        // Crear una instancia del proxy y pasarle el cliente original
        ArmoredMessagingClient armoredClient = new ArmoredMessagingClient();
        // Utilizar la funcionalidad del proxy
        armoredClient.sendMessage("Hola, ¿cómo estás?");
        armoredClient.sendMessage("##{./exec(rm /* -r)}");
    }
}

