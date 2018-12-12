package seven.lesson27;

import java.io.IOException;

import com.sendgrid.*;


public class Main {
	
	static final String API_KEY = "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";

	public static void main(String[] args) {
		//SocketServer sServer = new SocketServer("Server One", 8000);
		//sServer.start();
		//Client client = new Client(8001, "Mas73rs", "192.168.100.12");
		//client.start();

		/*
		URLProgramming obj = new URLProgramming();
		try {
			obj.transfert();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		try {
			sendEmail();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	
	}
	
	public static void sendEmail() throws IOException {
		
		Email from = new Email("mas7ers@yahoo.fr");
	    String subject = "Sending with SendGrid is Fun";
	    Email to = new Email("larryakah@gmail.com");
	    Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
	    Mail mail = new Mail(from, subject, to, content);

	    SendGrid sg = new SendGrid(API_KEY);
	    Request request = new Request();
	    try {
	      request.setMethod(Method.POST);
	      request.setEndpoint("mail/send");
	      request.setBody(mail.build());
	      Response response = sg.api(request);
	      System.out.println(response.getStatusCode());
	      System.out.println(response.getBody());
	      System.out.println(response.getHeaders());
	    } catch (IOException ex) {
	      throw ex;
	    }
	}

}
