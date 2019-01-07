package server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class AppClient extends Thread {

	private Socket socket;
	String host;
	int port;
	private DataOutputStream dos;
	private BufferedReader br;
	
	public AppClient(String host, int port) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Enter your client name :");
		String client = inputScanner.nextLine();
		this.host = host;
		this.port = port;
		try {
			socket = new Socket(host, port);
		    br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			dos = new DataOutputStream(socket.getOutputStream());
			dos.writeBytes(client);
			dos.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while(true) {
			try {
				//wait(2000);
				dos.writeUTF("I am connected");
				System.out.println("Client\n"+br.readLine());
				dos.writeUTF("1,0");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	
}
