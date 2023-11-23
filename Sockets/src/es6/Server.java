package es6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);
            System.out.println("Server ON");
            Socket client = server.accept();
            System.out.println("Client ON");
            server.close();

            DataInputStream inp = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());


            int sceltaClient = 0, num1 = 0, num2 = 0, somma = 0, quadrato = 0;
            sceltaClient = inp.readInt();
            System.out.println("Comando Ricevuto: " + sceltaClient);

            if(sceltaClient == 1){
                num1 = inp.readInt();
                num2 = inp.readInt();
                somma = num1 + num2;
                System.out.println("Somma: " + num1 + " + " + num2 + " = " + somma);
                out.writeInt(somma);
            }

            if(sceltaClient == 2){
                num1 = inp.readInt();
                quadrato = num1 * num1;
                System.out.println("Quadrato: " + num1 + "^2 = " + quadrato);
                out.writeInt(quadrato);
            }

            inp.close();
            out.close();
            client.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
