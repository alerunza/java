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
            do{
                do {
                    System.out.println("Quale area vuoi calcolare?\nQ - Quadrato\nR - Rettangolo");
                    risposta = tastiera.nextLine().toLowerCase();
                    if (!risposta.equals("q") && !risposta.equals("r")) {
                        System.out.println("Comando errato, inserisci Q/R");
                    } else{
                        topolino.writeUTF(risposta);
                    }
                } while (!risposta.equals("q") && !risposta.equals("r"));
                if(risposta.equals("q")){
                    tastiera.nextLine();
                    System.out.println("Inserisci il LATO del tuo Quadrato:");
                    num1 = tastiera.nextInt();
                    topolino.writeInt(num1);
                    int numServer = this.paperina.readInt();
                    System.out.println("dal SERVER, ecco la tua area del Quadrato: " + numServer);
                }
                if(risposta.equals("r")){
                    tastiera.nextLine();
                    System.out.println("Inserisci BASE e ALTEZZA del tuo Rettangolo:");
                    num1 = tastiera.nextInt();
                    num2 = tastiera.nextInt();
                    topolino.writeInt(num1);
                    topolino.writeInt(num2);
                    int numServer = this.paperina.readInt();
                    System.out.println("dal SERVER, ecco la tua area del Rettangolo: " + numServer);
                }
                tastiera.nextLine();
                do {
                    System.out.println("Vuoi continuare a calcolare? si/no");
                    risposta = tastiera.nextLine().toLowerCase();
                    if (!risposta.equals("si") && !risposta.equals("no")) {
                        System.out.println("Comando errato, inserisci si/no");
                    }
                } while (!risposta.equals("si") && !risposta.equals("no"));
            }while(risposta.equals("si"));

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