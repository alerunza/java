package es9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    Socket client;
    DataInputStream inp;
    DataOutputStream out;

    public void connect() {
        try {
            client = new Socket("localhost", 9999);
            inp = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());

            System.out.println("Server - Client ON");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void communicate(){
        Scanner input = new Scanner(System.in);
        try {
            String risposta = "", verificaDalServer = "";
            int num = 0, tentativi = 0;
            do{
                System.out.println("Sei pronto per giocare? digita: si");
                risposta = input.nextLine().toLowerCase();
                if(risposta.equals("si")){
                    out.writeUTF(risposta);
                } else{
                    System.out.println("Inserisci un comando valido");
                }
            }while(!risposta.equals("si"));

            System.out.println("E' iniziato il gioco!\nIndovina un NUMERO tra 1 e 30\nPer arrenderti digita 0");
            do {
                num = input.nextInt();
                tentativi++;
                out.writeInt(num);
                verificaDalServer = inp.readUTF();
                System.out.println("Server Status: " + verificaDalServer);
                if(verificaDalServer.equals("Errato")){
                    System.out.println("Non hai indovinato! Ritenta");
                }
                if(verificaDalServer.equals("Vittoria")){
                    System.out.println("Hai vinto! con " + tentativi + " tentativi, il NUMERO era: " + num);
                }
                if(verificaDalServer.equals("Arreso")){
                    System.out.println("Ti sei arreso!");
                }
            }while (!verificaDalServer.equals("Vittoria") && !verificaDalServer.equals("Arreso"));

            client.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.connect();
        client.communicate();
    }
}
