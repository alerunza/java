package Chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MultiServer {
	static List<ServerThread> clientThreads = new ArrayList<>();

	public void avviaServer() {
		try {
			ServerSocket server = new ServerSocket(9999);
			for (;;) {
				System.out.println("Server in attesa...");
				Socket socket = server.accept();
				System.out.println("Server socket: " + socket);
				ServerThread serverThread = new ServerThread(socket);
				addClientThread(serverThread);
				serverThread.start();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println("Errore durante l'istanza del server!");
			System.exit(1);
		}
	}

	public static void removeClientThread(ServerThread clientThread) {
		clientThreads.remove(clientThread);
	}

	public static void addClientThread(ServerThread clientThread) {
		clientThreads.add(clientThread);
	}

	public static void main(String[] args) {
		MultiServer multiServer = new MultiServer();
		multiServer.avviaServer();
	}
}
