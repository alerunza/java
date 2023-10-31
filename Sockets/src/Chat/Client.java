package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 9999);
            DataInputStream ins = new DataInputStream(client.getInputStream());
            DataOutputStream outs = new DataOutputStream(client.getOutputStream());

            System.out.println("Connesso al server. Scrivi 'exit' per disconnetterti");

            Thread receiveThread = new Thread(new riceviMess(ins));
            receiveThread.start();
            Scanner tastiera = new Scanner(System.in);

            System.out.println("Inserisci il tuo NOME Utente");

            String nickname = tastiera.nextLine();
            outs.writeUTF(nickname);
            //tastiera.nextLine();

            System.out.println("Inserisci un messaggio:");
            while (true) {
                String messaggio = tastiera.nextLine();
                if(!messaggio.trim().isEmpty()){
                    outs.writeUTF(messaggio);
                }
                if (messaggio.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            receiveThread.join();
            client.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class riceviMess implements Runnable {
        private DataInputStream ins;

        public riceviMess(DataInputStream ins) {
            this.ins = ins;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String messaggio = ins.readUTF();
                    System.out.println(messaggio);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
