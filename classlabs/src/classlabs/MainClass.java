package classlabs;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		User myUser = new User();
		Scanner inputScanner = new Scanner(System.in);
		do {
			System.out.println("Hello Please enter your email : ");
			String email = inputScanner.nextLine();
			myUser.setEmail(email);
			System.out.println("\nEnter your password : " );
			String password = inputScanner.nextLine();
			myUser.setPassword(password);
			System.out.println(myUser.errorMessage);
		}while(myUser.password == null || myUser.email == null);
		
	}

}
