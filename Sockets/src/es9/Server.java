package es9;

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

            int randomNumber = 0, rispClient = 0;
            String cmdClient = "";
            cmdClient = inp.readUTF();
            System.out.println("COMANDO ricevuto: " + cmdClient);

            if(cmdClient.equals("si")){
                randomNumber = (int) (Math.random() * 31);
                System.out.println("NUMERO generato: " + randomNumber);
            }

            do{
                rispClient = inp.readInt();
                System.out.println("NUMERO ricevuto dal client: " + rispClient);
                if(rispClient != randomNumber){
                    System.out.println("Il Client ha sbagliato!");
                    out.writeUTF("Errato");
                }
                if(rispClient == randomNumber){
                    System.out.println("Il Client ha vinto! Il NUMERO era: " + randomNumber);
                    out.writeUTF("Vittoria");
                }
                if(rispClient == 0){
                    System.out.println("Il Client si è arreso!");
                    out.writeUTF("Arreso");
                }
            }while (rispClient != randomNumber);

            System.out.println("Fuori");

            inp.close();
            out.close();
            client.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
