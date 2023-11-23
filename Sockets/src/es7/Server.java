package es7;

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

            int numStrClient = 0;
            numStrClient = inp.readInt();
            System.out.println("Stringhe da elaborare: " + numStrClient);

            String StrClient = "";
            for(int i = 0; i < numStrClient; i++){
                StrClient = inp.readUTF();
                System.out.println("Stringa ricevuta dal Client: " + StrClient);

                out.writeUTF(StrClient.toUpperCase());
            }

            inp.close();
            out.close();
            client.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
