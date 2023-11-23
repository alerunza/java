package es8;

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

            String sceltaClient = "";
            sceltaClient = inp.readUTF();
            System.out.println("Server: " + sceltaClient);


            int taglioClient = 0;

            switch (sceltaClient){
                case "TIM":
                    do{
                        // invio al client delle tariffe
                        out.writeInt(5);
                        out.writeInt(10);
                        out.writeInt(20);

                        taglioClient = inp.readInt();
                        if(taglioClient == 5){
                            System.out.println("Taglio confermato: " + taglioClient);
                            out.writeBoolean(true);
                        } else if(taglioClient == 10){
                            System.out.println("Taglio confermato: " + taglioClient);
                            out.writeBoolean(true);
                        } else if(taglioClient == 20){
                            System.out.println("Taglio confermato: " + taglioClient);
                            out.writeBoolean(true);
                        } else{
                            System.out.println("Taglio errato: " + taglioClient);
                            out.writeBoolean(false);
                        }
                    }while (taglioClient != 5 && taglioClient != 10 && taglioClient != 20);
                    break;
                case "VODAFONE":
                    do{
                        // invio al client delle tariffe
                        out.writeInt(10);
                        out.writeInt(20);
                        out.writeInt(30);

                        taglioClient = inp.readInt();
                        if(taglioClient == 10){
                            System.out.println("Taglio confermato: " + taglioClient);
                            out.writeBoolean(true);
                        } else if(taglioClient == 20){
                            System.out.println("Taglio confermato: " + taglioClient);
                            out.writeBoolean(true);
                        } else if(taglioClient == 30){
                            System.out.println("Taglio confermato: " + taglioClient);
                            out.writeBoolean(true);
                        } else{
                            System.out.println("Taglio errato: " + taglioClient);
                            out.writeBoolean(false);
                        }
                    }while (taglioClient != 10 && taglioClient != 20 && taglioClient != 30);
                    break;
                case "WIND":
                    do{
                        // invio al client delle tariffe
                        out.writeInt(5);
                        out.writeInt(15);
                        out.writeInt(25);

                        taglioClient = inp.readInt();
                        if(taglioClient == 5){
                            System.out.println("Taglio confermato: " + taglioClient);
                            out.writeBoolean(true);
                        } else if(taglioClient == 15){
                            System.out.println("Taglio confermato: " + taglioClient);
                            out.writeBoolean(true);
                        } else if(taglioClient == 25){
                            System.out.println("Taglio confermato: " + taglioClient);
                            out.writeBoolean(true);
                        } else{
                            System.out.println("Taglio errato: " + taglioClient);
                            out.writeBoolean(false);
                        }
                    }while (taglioClient != 5 && taglioClient != 15 && taglioClient != 25);
                    break;
            }

            inp.close();
            out.close();
            client.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
