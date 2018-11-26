package lesson8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ResumeGame {

	public void saveGame(User user) throws IOExceptionity" {
			
			File userFile = new File ("src/lesson8/save.ser");
			if( !(userFile.exists())) {
				userFile.createNewFile();
				System.out.print("\nSaving ");
			}
			
			FileOutputStream fos = new FileOutputStream(userFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(user);
			oos.flush();
			oos.close();
			fos.close();
			
			for(int i = 5; i > 0; i--) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(".");
			}
			
			System.out.println("\nGame SUCCESSFULLY saved!");
		}
}
