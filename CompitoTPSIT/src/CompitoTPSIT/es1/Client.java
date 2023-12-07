package CompitoTPSIT.es1;

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
            String str = "", strElaborata = "";
            int sceltaEl = 0;
            System.out.println("Inserisci più stringhe da elaborare, una volta finito, digita 'stop'");
            do{
                do {
                    System.out.println("Scegli il tipo di elaborazione: \n1 - Maiuscole\n2 - Minuscole");
                    sceltaEl = input.nextInt();
                    if(sceltaEl == 1 || sceltaEl == 2){
                        out.writeInt(sceltaEl);
                    } else {
                        System.out.println("Inserisci un comando valido");
                    }
                } while (sceltaEl != 1 && sceltaEl != 2);
                input.nextLine();
                System.out.println("Inserisci la stringa, digita 'stop' per terminare");
                str = input.nextLine();
                out.writeUTF(str);
                strElaborata = inp.readUTF();
                System.out.println("Stringa elaborata dal SERVER: " + strElaborata);
            } while (!str.equals("stop"));
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
