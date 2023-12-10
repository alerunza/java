package CompitoTPSIT.es2;

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

    public void communicate() {
        Scanner input = new Scanner(System.in);
        try {
            int sceltaOp = 0, operazioneSvolta = 0;
            int num1 = 0, num2 = 0, num3 = 0;
            do {
                System.out.println("Quante operazioni vuoi fare?");
                sceltaOp = input.nextInt();
                if (sceltaOp == 0) {
                    System.out.println("Numero non valido");
                } else {
                    out.writeInt(sceltaOp);
                }
            } while (sceltaOp == 0);

            for (int i = 0; i < sceltaOp; i++) {
                System.out.println("Inserisci 3 numeri");
                num1 = input.nextInt();
                num2 = input.nextInt();
                num3 = input.nextInt();
                out.writeInt(num1);
                out.writeInt(num2);
                out.writeInt(num3);

                operazioneSvolta = inp.readInt();
                System.out.println("Prodotto di: " + num1 + " * " + num2 + " * " + num3 + " = " + operazioneSvolta);
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
