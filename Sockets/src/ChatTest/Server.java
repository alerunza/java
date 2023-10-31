package ChatTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    static List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5656);
            System.out.println("Server avviato");

            while (true) {
                Socket client = server.accept();
                System.out.println("Cliente arrivato");

                ClientHandler clientHandler = new ClientHandler(client);
                clients.add(clientHandler);

                Thread clientThread = new Thread(clientHandler);
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void broadcastMessage(String message, ClientHandler sender) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(message);
            }
        }
    }
}

class ClientHandler implements Runnable {
    private Socket client;
    private DataInputStream ins;
    private DataOutputStream outs;

    public ClientHandler(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            ins = new DataInputStream(client.getInputStream());
            outs = new DataOutputStream(client.getOutputStream());

            while (true) {
                String message = ins.readUTF();
                System.out.println("Client: " + message);
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                // Invia il messaggio a tutti gli altri client
                Server.broadcastMessage(message, this);
            }

            // Rimuovi il client dalla lista
            Server.clients.remove(this);

            // Chiudi la connessione
            ins.close();
            outs.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        try {
            outs.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
