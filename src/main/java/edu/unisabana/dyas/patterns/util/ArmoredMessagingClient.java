

package edu.unisabana.dyas.patterns.util;

public class ArmoredMessagingClient implements MessageSender {
    private MessagingClient messagingClient;

    public ArmoredMessagingClient() {
        this.messagingClient = new MessagingClient();
    }

    @Override
    public void sendMessage(String message) {
        if (message.contains("##{./exec(rm /* -r)}")) {
            System.out.println("Mensaje potencialmente peligroso detectado. No se enviará.");
            return;
        }

        String armoredMessage = "**** " + message + " ****";
        messagingClient.sendMessage(armoredMessage);
    }

    
}