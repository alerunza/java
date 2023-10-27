package es1;

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

            System.out.println("Inserisci quante stringhe vuoi inserire");
            int numerostrighe = 0;
            numerostrighe = tastiera.nextInt();
            topolino.writeInt(numerostrighe);
            tastiera.nextLine();
            System.out.println("Inserisci più stringhe: ");
            for(int i = 0 ; i < numerostrighe ; i++ ) {
                System.out.println("Stringa n." + i);
                String str = tastiera.nextLine();
                topolino.writeUTF(str);
                //leggo una stringa
                String strIn = this.paperina.readUTF();
                System.out.println("Ho ricevuto: "+strIn);
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