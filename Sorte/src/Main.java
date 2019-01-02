import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Client a= new Client(8001,"client name ","192.168.100.12");
		a.start();*/
		Url b= new Url();
		try {
			b.sendEmail();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
