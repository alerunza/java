package CompitoTPSIT.es2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);
            System.out.println("Server ON");
            Socket client = server.accept();
            System.out.println("Client ON");
            server.close();

            DataInputStream inp = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());

            int sceltaCl = 0, operazione = 0;
            int num1 = 0, num2 = 0, num3 = 0;

            sceltaCl = inp.readInt();

            System.out.println("Numero di operazioni da svolgere: " + sceltaCl);

            for(int i = 0; i < sceltaCl; i++){
                num1 = inp.readInt();
                num2 = inp.readInt();
                num3 = inp.readInt();

                System.out.println("Numeri ricevuti dal CLIENT: " + num1 + ", " + num2 + ", " + num3);

                operazione = num1 * num2 * num3;
                System.out.println("Prodotto tra i 3 numeri: " + operazione);
                out.writeInt(operazione);
            }

            inp.close();
            out.close();
            client.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
