package es4;

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

            int num1 = 0, num2 = 0, somma = 0;
            String strRicevuta = "";
            while(!strRicevuta.equals("no")){
                num1 = ins.readInt();
                num2 = ins.readInt();
                System.out.println("Coppia di Numeri: " + num1 + " + " + num2);
                somma = num1 + num2;
                outs.writeInt(somma);
                strRicevuta = ins.readUTF();
                System.out.println("Comando ricevuto: " + strRicevuta);
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