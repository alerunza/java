package es2;

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

            System.out.println("Inserisci quanti NUMERI vuoi inserire");
            int numTot = 0;
            numTot = tastiera.nextInt();
            topolino.writeInt(numTot);
            //tastiera.nextInt();
            System.out.println("Inserisci più di un NUMERO:");
            for(int i = 0 ; i < numTot ; i++ ) {
                System.out.println("Numero n." + i);
                int num = tastiera.nextInt();
                topolino.writeInt(num);
                int numServer = this.paperina.readInt();
                System.out.println("Ho ricevuto: " + numServer);
            }
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