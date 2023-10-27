package es2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMich {



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

            int numero = 0;
            int somma = 0;
            int numeronumeri = ins.readInt();
            //leggo la stringa inviata dal client
            for(int i = 0; i < numeronumeri; i++){
                numero = ins.readInt();
                System.out.println("Ho ricevuto la stringa: " + numero);
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