package seven.lesson18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class JavaIO {

	void byteStreams() {
	
		int streamByte = 0;
		try {
			FileInputStream fileInput = new FileInputStream("input.txt");
			FileOutputStream fileOutput = new FileOutputStream("output.txt");
			while((streamByte = fileInput.read()) != -1) {
				fileOutput.write(streamByte);
			}
			fileInput.close();
			fileOutput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();	
		}
		
	}
	
	public void charStream() {
		
		try {
			FileReader fReader = new FileReader("input.txt");
			FileWriter fWriter = new FileWriter("output.txt");
			int ch;
			while((ch = fReader.read()) != -1) {
				fWriter.write(ch);
			}
			fReader.close();
			fWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public File getFile(String filename) throws IOException{
		
		File file = new File(filename);
		
		// Check if the file exists
		if(file.exists()) {
			System.out.println("\nFile Found!!!");
			for(File mFile : file.listFiles()) {
				System.out.println(mFile.getName());
				System.out.println(mFile.isHidden() ? " -> Hidden" : " -> Visible");
			}
		} else {
			System.out.println("No such file or directory : "+file.getAbsolutePath());
			
			file.mkdirs();
			file.createNewFile();                              

		}
		
		return file;
	}

	public void serializeUser(User user) throws IOException, ClassNotFoundException, InterruptedException {
		
		File myFile = new File("input.ser");
		if(!(myFile.exists())) {
			myFile.createNewFile();
		}
		
		FileOutputStream fos = new FileOutputStream(myFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(user);
		oos.flush();
		oos.close();
		fos.close();
		
		for (int i = 1; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.println(i);
		}
		
		System.out.println(user + "\nHas been SUCCESSFULLY serialized!");
	}
	
	public User deserializeUser() throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(getFile("input.ser"));
		ObjectInputStream ois = new ObjectInputStream(fis);
		User myUser = (User) ois.readObject();
		ois.close();
		fis.close();
		
		return myUser;
		
	}
}
