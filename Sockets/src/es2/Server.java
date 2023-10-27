package es2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        // TODO Auto-generated method stub


        try {
            //creo il server
            ServerSocket server = new ServerSocket(9999);
            System.out.println("Server avviato");
            //il server è in attesa del client
            Socket client = server.accept();
            //chiudo il server (questo server accetta un solo client)
            System.out.println("Cliente arrivato");
            server.close();

            DataInputStream ins = new DataInputStream(client.getInputStream());
            DataOutputStream outs = new DataOutputStream(client.getOutputStream());

            //comunico

            int numTot = 0, numero, somma = 0;
            numTot = ins.readInt();
            //leggo la stringa inviata dal client
            for(int i = 0; i < numTot; i++){
                numero = ins.readInt();
                System.out.println("Ho ricevuto il numero: " + numero);
                somma += numero;
                outs.writeInt(somma);
            }

            //fine comunicazione - chiudo la connessione
            System.out.println("Chiudo la connessione...Ciao ciao");
            ins.close();
            outs.close();
            client.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}