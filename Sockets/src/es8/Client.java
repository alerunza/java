package es8;

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
            String scelta = "";
            do{
                System.out.println("Scegli il GESTORE per la ricarica:\nTIM\nVODAFONE\nWIND");
                scelta = input.nextLine().toUpperCase();
                switch (scelta){
                    case "TIM", "VODAFONE", "WIND":
                        out.writeUTF(scelta);
                        break;
                    default:
                        System.out.println("GESTORE non valido");
                        break;
                }
            }while(!scelta.equals("TIM") && !scelta.equals("VODAFONE") && !scelta.equals("WIND"));

            int sceltaTaglio = 0;
            boolean verificaDalServer = false;
            switch (scelta){
                case "TIM", "VODAFONE", "WIND":
                    do{
                        int tariffa1 = inp.readInt();
                        int tariffa2 = inp.readInt();
                        int tariffa3 = inp.readInt();
                        System.out.println("Tagli di Ricarica " + scelta + ": " + tariffa1 + ", " + tariffa2 + " e " + tariffa3 + " euro\nScegli il taglio:");
                        sceltaTaglio = input.nextInt();

                        out.writeInt(sceltaTaglio);
                        verificaDalServer = inp.readBoolean();
                        if(!verificaDalServer){
                            System.out.println("Taglio ERRATO, riprova");
                        } else{
                            System.out.println("Ricarica avvenuta con successo!\nHai effettuato una ricarica di: " + sceltaTaglio + " euro, con il Gestore: " + scelta);
                        }
                    }while (!verificaDalServer);
                    break;
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
