package server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class AppServer extends Thread {

	private String host;
	private int port;
	private ServerSocket server;
	private Socket socket;
	private DataOutputStream dos;
	private BufferedReader bReader;
	
	public AppServer(String host, int port) {
		this.host = host;
		this.port = port;
		try {
			//create a new server socket
			server = new ServerSocket(port, 5, InetAddress.getLocalHost());
			server.setSoTimeout(60000);
			print(InetAddress.getLocalHost()+"\nWaiting for connection. Listening on port "+port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getHost() throws UnknownHostException {
		return InetAddress.getLocalHost().getHostAddress();
	}

	private void print(String string) {
		System.out.println(string);
		
	}

	@Override
	public void run() {
		//execute commands/communication
		try {
			socket = server.accept();
			print(socket.getInetAddress()+" Connected!");
			bReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		    dos = new DataOutputStream(socket.getOutputStream());
		    String name = bReader.readLine();
		    print("Server\nWelcome! "+name);
		    do {
		    	dos.writeChars("Your turn "+name);
		    	Thread.sleep(5000);
		    	System.out.println("Server\nClient Sends : "+bReader.readLine());
		    }while(true);
		    	
		    
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
