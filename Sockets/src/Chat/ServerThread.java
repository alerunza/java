package Chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerThread extends Thread {
	private Socket client;
	private DataInputStream ins;
	private DataOutputStream outs;

	public ServerThread(Socket socket) {
		this.client = socket;
	}

	public void run() {
		try {
			MultiServer.addClientThread(this);
			comunica();
		} catch (Exception e) {
			e.printStackTrace(System.out);
		} finally {
			MultiServer.removeClientThread(this);
		}
	}


	public void comunica() {
		try {
			ins = new DataInputStream(client.getInputStream());
			outs = new DataOutputStream(client.getOutputStream());

			String messaggio = "", username = "";
			username = ins.readUTF();
			boolean stop = false;
			while (!stop) {
				messaggio = ins.readUTF();
				if (messaggio.equals("exit")) {
					stop = true;
				} else {
					System.out.println("SERVER | " + username + ": " + messaggio);
					mandaMess(messaggio, username);
				}
			}

			System.out.println("Chiudo la connessione con " + client);
			ins.close();
			outs.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void mandaMess(String message, String username) {
		for (ServerThread clientThread : MultiServer.clientThreads) {
			if (clientThread != this) {
				try {
					clientThread.outs.writeUTF(username + ": " + message);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
