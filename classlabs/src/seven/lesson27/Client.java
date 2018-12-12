package seven.lesson27;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Socket;

public class Client extends Thread{

	private Socket clientSocket;
	private int clientPort;
	private String clientName;
	private String ipAddress;
	
	
	
	public Client(int port, String name, String ipAddress) {
		super();
		this.clientPort = port;
		this.clientName = name;
		this.ipAddress = ipAddress;
	}

	public Client(int port, String name) {
		super();
		this.clientPort = port;
		this.clientName = name;
	}

	public void print(String str) {
		System.out.println(str);
	}
	
	public void connect() {
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			clientSocket = new Socket(ipAddress, clientPort);
			print(clientName + " : Connected. ");
			// Send name to server socket
			dos = new DataOutputStream(clientSocket.getOutputStream());
			dos.writeChars(clientName);
			
			// Receive response
			dis = new DataInputStream(clientSocket.getInputStream());
			String response = dis.readLine();
			print(response);
		} catch (IOException ioe) {
			ioe.printStackTrace();
			print(clientName + " : Error connecting!!!");
		} finally {
			if(dis != null)
				try {
					dis.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			if(dos != null)
				try {
					dos.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
		}
	}

	@Override
	public void run() {
		connect();
	}
	
	
}
