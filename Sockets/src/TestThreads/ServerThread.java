package TestThreads;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ServerThread extends Thread {
	
	Socket client;
	DataInputStream ins;
	DataOutputStream outs;
	

	public ServerThread (Socket socket){ 
		    this.client = socket; 
		  } 
	
	public void run(){ 
		  try{
		    comunica();  
		  }catch (Exception e){ 
		    e.printStackTrace(System.out);  } 
		  } 
	
	public void comunica() {
		
		try {
			ins = new DataInputStream (client.getInputStream());
			outs = new DataOutputStream(client.getOutputStream());
			
		
			String stringa="";
			boolean stop = false;
			while(!stop) {
				stringa = ins.readUTF();
				if(stringa.equals("fine")) {
					stop=true;
				}else {
					System.out.println("Ho ricevuto la stringa: "+stringa);
					outs.writeUTF(stringa.toUpperCase());
				}
			}
			//fine comunicazione - chiudo la connessione
			System.out.println("Chiudo la connessione con " + client);
			ins.close();
			outs.close();
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
