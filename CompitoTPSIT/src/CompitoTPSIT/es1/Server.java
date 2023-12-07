package CompitoTPSIT.es1;

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

            String strCl = "";
            int sceltaCl = 0;

            do {
                sceltaCl = inp.readInt();
                System.out.println("Comando ricevuto dal CLIENT: " + sceltaCl);

                strCl = inp.readUTF();
                System.out.println("Stringa ricevuta dal CLIENT: " + strCl);
                if(sceltaCl == 1){
                    out.writeUTF(strCl.toUpperCase());
                }
                if(sceltaCl == 2){
                    out.writeUTF(strCl.toLowerCase());
                }
            }while(!strCl.equals("stop"));

            inp.close();
            out.close();
            client.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
