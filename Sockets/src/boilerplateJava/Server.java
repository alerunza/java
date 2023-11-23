package boilerplateJava;

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

            System.out.println("Server - " + inp.readInt());

            inp.close();
            out.close();
            client.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
