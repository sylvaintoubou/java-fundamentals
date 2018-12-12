package seven.lesson27;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer extends Thread {

	private String serverName;
	private Socket serverSocket;
	private int serverPort;
	private ServerSocket connectionSocket;
	
	public SocketServer(String name, int port) {
		super();
		this.serverName = name;
		this.serverPort = port;
		
		try {
			connectionSocket = new ServerSocket(serverPort);
			connectionSocket.setSoTimeout(10000);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	
	public void print(String str) {
		System.out.println(str);
	}
	
	@Override
	public void run() {
		
		// Start the server
		try {
			print(serverName + " : Starting >>>");
			
			print(serverName + " : Started. Waiting for connections on port " + connectionSocket.getLocalPort());
			serverSocket = connectionSocket.accept();
			printSocket(serverSocket);
			
			// Send greetings to client socket
			DataOutputStream dos = new DataOutputStream(serverSocket.getOutputStream());
			dos.writeChars(serverName + " : Welcome! You are now connected. ");
			dos.writeChars("What should I call you? \n");
			dos.flush();
			
			// Receive response
			BufferedReader bReader = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
			String response = bReader.readLine();
			print(serverName + " : welcome! " + response);
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}


	private void printSocket(Socket name) {
		System.out.println();
		
	}
	

	
}
