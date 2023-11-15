package es5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
    Socket client;

    DataInputStream paperina;
    DataOutputStream topolino;


    public void connetti() {
        try {
            client = new Socket("localhost", 9999);
            //client = new Socket("192.168.71.218", 9999);

            paperina = new DataInputStream(client.getInputStream());
            topolino = new DataOutputStream(client.getOutputStream());

            System.out.println ("Connessione Stabilita");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void comunica() {
        //comunico con il server
        Scanner tastiera = new Scanner(System.in);
        try {
            int num1 = 0, num2 = 0;
            String risposta = "";
            System.out.println("Quale area vuoi calcolare?\nQ - Quadrato\nR - Rettangolo");
            risposta = tastiera.nextLine().toLowerCase();
            topolino.writeUTF(risposta);
            if(risposta.equals("q")){
                System.out.println("Inserisci il LATO del tuo Quadrato:");
                num1 = tastiera.nextInt();
                topolino.writeInt(num1);
                int numServer = this.paperina.readInt();
                System.out.println("dal SERVER, ecco la tua area del Quadrato: " + numServer);
            }
            if(risposta.equals("r")){
                System.out.println("Inserisci BASE e ALTEZZA del tuo Rettangolo:");
                num1 = tastiera.nextInt();
                num2 = tastiera.nextInt();
                topolino.writeInt(num1);
                topolino.writeInt(num2);
                int numServer = this.paperina.readInt();
                System.out.println("dal SERVER, ecco la tua area del Rettangolo: " + numServer);
            }

            System.out.println("Passo e chiudo");
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Client client = new Client();
        client.connetti();
        client.comunica();
    }

}