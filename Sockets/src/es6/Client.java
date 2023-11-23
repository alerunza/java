package es6;

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
            int scelta = 0, num1 = 0, num2 = 0;
            do{
                System.out.println("Scegli l'operazione:\n1 - Somma di due NUMERI\n2 - Quadrato di un NUMERO");
                scelta = input.nextInt();
            }while(scelta != 1 && scelta != 2);
            // invia scelta
            out.writeInt(scelta);

            if(scelta == 1){
                System.out.println("Inserisci una coppia di NUMERI");
                num1 = input.nextInt();
                num2 = input.nextInt();
                out.writeInt(num1);
                out.writeInt(num2);
                int somma = 0;
                somma = inp.readInt();
                System.out.println("Somma ricevuta dal Server: " + somma);
            }
            if(scelta == 2){
                System.out.println("Inserisci un NUMERO");
                num1 = input.nextInt();
                out.writeInt(num1);
                int quadrato = 0;
                quadrato = inp.readInt();
                System.out.println("Quadrato ricevuto dal Server: " + quadrato);
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
