import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;


import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

public class Url {

	public static void url() {
		// TODO Auto-generated method stub
		try {
			URL url=new
			URL("https://www.google.com/search?q=how+to+write+code");
			System.out.printf("URL\n Protocol: %1s \n Authority : %2s \n Host : %3s "
					+ "\n Path: %4s\n Port %5d\n Query:%6s"
					+ "\n File Name : %7s \n Ref: %8s", url.getProtocol(),url.getAuthority(),url.getHost(),url.getPath(),url.getDefaultPort(),url.getQuery(),url.getFile(),url.getRef());
			URLConnection connection = url.openConnection();
			if (connection instanceof HttpURLConnection) {
				HttpURLConnection httpConnection = (HttpURLConnection) connection;
				BufferedReader reader = new BufferedReader ( new InputStreamReader(httpConnection.getInputStream()));
				String data = " ";String content = "";
				while((data = reader.readLine())!=null){
					content +=data;
					System.out.println(content);
					reader.close();
					httpConnection.disconnect();
				}
			}
		}catch(MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void sendEmail() throws IOException {
		Email from = new Email("ndemefreelance1@gmail.com");
	    String subject = "Sending with SendGrid is Fun";
	    Email to = new Email("ndemeyvan@gmail.com");
	    Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
	    Mail mail = new Mail(from, subject, to, content);

	    SendGrid sg = new SendGrid("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");
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
