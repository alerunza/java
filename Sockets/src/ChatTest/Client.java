package ChatTest;

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

            System.out.println("Connesso al server. Scrivi 'exit' per uscire dalla chat.");

            Thread receiveThread = new Thread(new ReceiveMessages(ins));
            receiveThread.start();

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String message = scanner.nextLine();
                outs.writeUTF(message);
                if (message.equalsIgnoreCase("exit")) {
                    break;
                }
            }

            receiveThread.join(); // Attendere che il thread di ricezione termini
            client.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class ReceiveMessages implements Runnable {
        private DataInputStream ins;

        public ReceiveMessages(DataInputStream ins) {
            this.ins = ins;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String message = ins.readUTF();
                    System.out.println("Server: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
