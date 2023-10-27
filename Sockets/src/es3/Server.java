package es3;

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

            int randomNum = (int) (Math.random() * 11);
            System.out.println("NUMERO Generato: " + randomNum);
            outs.writeInt(randomNum);
            for(int i = randomNum; i > 0; i--){
                int numCl = ins.readInt();
                System.out.println("SERVER | num: " + numCl);
                if(numCl <= 0){
                    break;
                }
                outs.writeInt(numCl-1);
            }

            //fine comunicazione - chiudo la connessione
            System.out.println("Chiudo la connessione... è scoppiata la bomba");
            ins.close();
            outs.close();
            client.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}