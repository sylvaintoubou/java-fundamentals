package seven.lesson18;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		/*
		JavaIO myIO = new JavaIO();
		myIO.byteStreams();
		*/
		
		//avaIO myIO = new JavaIO();
		
		//myIO1.charStream();
		//myIO1.getFile();
		
		/*
		try {
			User user1 = new User("Yvan", 12, "Male", 1.85d);
			myIO.serializeUser(user1);
			System.out.println("\n" + myIO.deserializeUser());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		FileInfo();
		ListFiles();
		
	}

	public static void FileInfo() throws IOException{
		
		Scanner scan = new Scanner(System.in);
		String fileName;
		
		System.out.println("Here is how to create a file!"
				+ "\nHmmm actually we are going to create 5 of them ;)"
				+ "\nFirst thing first!");
		
		for (int i = 1; i < 6 ; i ++) {
			System.out.println("\n\nWhat is the name of the file you wish to create ? ");
			fileName = scan.nextLine();
			CreateFile(fileName);
		}	
		
	}
	
	public static void CreateFile(String filename) throws IOException{
		
		File userDir = new File("user");
		File userFile = new File(userDir, filename);
		
		// Check if the file exists
		if(userFile.exists()) {
			System.out.println("\nFile already exist!!!");
			
		} else {
			
			userDir.mkdirs();
			System.out.print("Creating file ");
			
			for (int i = 1; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(".");
			}
			
			System.out.println("\nDone !");
			
			userFile.createNewFile();
			                            
			//FileReader fReader = new FileReader(filename);
			FileWriter fWriter = new FileWriter(userFile);
			fWriter.write(filename);
			fWriter.close();

		}
	
	}

	public static void ListFiles () {
		
		File dir = new File("user");
		
		System.out.println("\nList of files in the directory:");
		
		for(File myFile : dir.listFiles()) {
			
			System.out.println(myFile.getName());
			//System.out.println(myFile.listFiles());
			//System.out.println(mFile.isHidden() ? " -> Hidden" : " -> Visible");
		}
	}

}
