package es4;

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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    public void comunica() {
        //comunico con il server
        int c=0;

        Scanner tastiera = new Scanner(System.in);
        try {

            int num1 = 0, num2 = 0;
            String risposta = "";
            //tastiera.nextInt();
            do{
                System.out.println("Inserisci una coppia di NUMERI:");
                num1 = tastiera.nextInt();
                num2 = tastiera.nextInt();
                topolino.writeInt(num1);
                topolino.writeInt(num2);
                int numServer = this.paperina.readInt();
                System.out.println("Ho ricevuto: " + numServer);
                tastiera.nextLine();
                do {
                    System.out.println("Vuoi continuare? (si/no)");
                    risposta = tastiera.nextLine().toLowerCase();
                    if (!risposta.equals("si") && !risposta.equals("no")) {
                        System.out.println("Comando errato, inserisci si/no");
                    }
                } while (!risposta.equals("si") && !risposta.equals("no"));
                topolino.writeUTF(risposta);
            }while(risposta.equals("si"));

            System.out.println("Passo e chiudo");
            client.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Client client = new Client();
        client.connetti();
        client.comunica();

    }

}