package es7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
            int numStringhe = 0;
            String Str = "";
            System.out.println("Quante Stringhe vuoi elaborare?");
            numStringhe = input.nextInt();
            out.writeInt(numStringhe);
            input.nextLine();
            for(int i = 0; i < numStringhe; i++){
                System.out.println("Inserisci la Stringa n." + (i+1));
                Str = input.nextLine();
                out.writeUTF(Str);
                String StrConvertita = "";
                StrConvertita = inp.readUTF();
                System.out.println("Stringa Elaborata dal Server: " + StrConvertita);
            }

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
