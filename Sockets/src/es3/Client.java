package es3;

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
        Scanner tastiera = new Scanner(System.in);
        try {
            int countdown = this.paperina.readInt();
            System.out.println("Countdown Ricevuto: " + countdown);
            boolean flag = true;
            for(int i = countdown; i > 0; i--) {
                if(flag){
                    topolino.writeInt(i);
                    flag = false;
                }
                try {
                    int secRimasti = this.paperina.readInt();
                    System.out.println("CLIENT | num: " + secRimasti);
                    if(secRimasti <= 0){
                        System.out.println("E' Scoppiata la bomba!!!");
                        break;
                    } else{
                        topolino.writeInt(secRimasti-1);
                    }
                } catch (IOException e){
                    System.out.println("Bomba scoppiata nel Server! Ti Sei Salvato!");
                    break;
                }
            }
            client.close();
        } catch (IOException e) {
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