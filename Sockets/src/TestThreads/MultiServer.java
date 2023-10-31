package TestThreads;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
 
	public void avviaServer() {
		try {
			ServerSocket server = new ServerSocket(9999);
			for(;;) {
				System.out.println("Server in attesa...");
				Socket socket = server.accept();
				System.out.println("Server socket  " + socket); 
		        ServerThread serverThread = new ServerThread(socket); 
		        serverThread.start(); 
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		    System.out.println("Errore durante l'istanza del server !");
		    System.exit(1);
		}
	}
	
	 public static void main (String[] args){ 
	     MultiServer multiServer = new MultiServer(); 
	     multiServer.avviaServer(); 
	   } 
}
