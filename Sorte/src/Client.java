import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Socket;

public class Client extends Thread {
	public int clientPort;
	public String clientName;
	private Socket clientSocket;
	public  String ipAdress;
	
	public void connect() {
		DataOutputStream dos = null;
		DataInputStream dis = null;
		try {
			clientSocket = new Socket(ipAdress,clientPort);
			print(clientName+ ": connected.");
			dos= new DataOutputStream(clientSocket.getOutputStream());
			dos.writeChars(clientName);
			dis = new DataInputStream(clientSocket.getInputStream());
			String response = dis.readLine();
			print(response);
			
		}catch(IOException e){
			e.printStackTrace();
			print(clientName+" : error connecting ");
		}finally {
			if(dis!=null) {
				try {
					dis.close();
					dos.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
				
			}
		}
		
	}

	private void print(String string) {
		System.out.println(string);
		
	}

	public Client(int clientPort, String clientName) {
		this.clientPort = clientPort;
		this.clientName = clientName;
	}

	@Override
	public void run() {
		connect() ;
	}

	public Client(int clientPort, String clientName, String ipAdress) {
		this.clientPort = clientPort;
		this.clientName = clientName;
		this.ipAdress = ipAdress;
	}
	
	
}
