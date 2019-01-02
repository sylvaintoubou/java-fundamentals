import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer extends Thread{
	private String serverName;
	private Socket serverSocket;
	private int serverPort;
	private ServerSocket connectionSocket;
	
	public SocketServer(String name, int port) {
		serverName=name;
		serverPort= port;
		try {
			connectionSocket= new ServerSocket(serverPort);
			connectionSocket.setSoTimeout(10000);
		}catch(IOException  e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public synchronized void run() {
		try {
				print(serverName + ":Starting ...");
				print(serverName+ ": Started.waiting for connections on port " + connectionSocket.getLocalPort());
				serverSocket=connectionSocket.accept();
				printSocket(serverSocket);
				DataOutputStream dos=new DataOutputStream(serverSocket.getOutputStream());
				dos.writeChars(serverName+": welcome you are connected ");
				dos.writeChars("what should i call you ? \n");
				dos.flush();
				BufferedReader breader = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));
				String response =breader.readLine();
				print(serverName+": welcomme !" + response);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	private void printSocket(Socket serverSocket2) {
	System.out.println(serverSocket2);
	}

	private void print(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}
}
