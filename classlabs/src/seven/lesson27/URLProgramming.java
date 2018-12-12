package seven.lesson27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

public class URLProgramming {
	
	private String name;
	

	public URLProgramming(String name) {
		this.name = name;
	}

	public URLProgramming() {
	}

	public void transfert() throws IOException {
		
		try {
			URL url = new URL ("https://www.google.com/search?q=how-to-write-code");
			System.out.printf("URL\n Protocol: %1s \n "
					+ "Authority: %2s \n "
					+ "Host : %3s \n "
					+ "Path : %4s \n "
					+ "Port : %5d \n "
					+ "Query : %6s \n "
					+ "File Name : %7s \n "
					+ "Ref : %8s",
					url.getProtocol(), url.getAuthority(), url.getHost(), url.getPath(), 
					url.getDefaultPort(), url.getQuery(), url.getFile(), url.getRef());
			
			URLConnection connection = url.openConnection();
			if(connection instanceof HttpURLConnection) {
				HttpURLConnection httpConnection = (HttpURLConnection) connection;
				BufferedReader reader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
				
				// Read data from the url
				String data = "", content = "";
				while ((data = reader.readLine()) != null)
					content += data;
				System.out.println(content);
				reader.close();
				httpConnection.disconnect();
			}
			
		} catch (MalformedURLException mue) {
			mue.printStackTrace();
		}
	}

}
