import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;



public class Client_1 {
    Socket client;

    DataInputStream paperina;
    DataOutputStream topolino;


    public void connetti() {
        try {
            client = new Socket("localhost", 9999);

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
        int c=0;

        Scanner tastiera = new Scanner(System.in);
        try {


            System.out.println("Inserisci una stringa: ");
            String str= tastiera.nextLine();
            //invio una stringa
            topolino.writeUTF(str);

            //leggo una stringa
            String strIn = this.paperina.readUTF();
            System.out.println("Ho ricevuto: "+strIn);
            System.out.println("Passo e chiudo");
            client.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Client_1 client = new Client_1();
        client.connetti();
        client.comunica();

    }

}