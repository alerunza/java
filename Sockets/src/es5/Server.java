package es5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
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
            int num1 = 0, num2 = 0, operazione = 0;
            String strRicevuta = "";
            strRicevuta = ins.readUTF();
            System.out.println("Comando Ricevuto: " + strRicevuta);
            if (strRicevuta.equals("q")) {
                num1 = ins.readInt();
                operazione = num1 * num1;
                System.out.println("Area Quadrato: " + num1 + " * " + num1 + " = " + operazione);
                outs.writeInt(operazione);
            }
            if (strRicevuta.equals("r")) {
                num1 = ins.readInt();
                num2 = ins.readInt();
                operazione = num1 * num2;
                System.out.println("Area Rettangolo: " + num1 + " * " + num2 + " = " + operazione);
                outs.writeInt(operazione);
            }

            //fine comunicazione - chiudo la connessione
            System.out.println("Chiudo la connessione... Ciao ciao");
            ins.close();
            outs.close();
            client.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}