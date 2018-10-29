package classlabs;

import java.util.Scanner;

public class User {
	
	static String email;
	static String password;
	static int passLenght;
	static int atIndex;
	static Scanner scanEmail = new Scanner(System.in);
	static Scanner scanPass = new Scanner(System.in);
	
	public static void setPassword(){
		do {
			System.out.println("Please enter your password : ");
			password = scanPass.nextLine();
			passLenght = password.length();
		}
		while (passLenght < 6 || passLenght > 10 );
		
		
	}
	
	public static void getPassword(){
		System.out.println("Your password is : "+password);
	}
	
	public static void setEmail(){
		
		do {
			System.out.println("Please enter your Email : ");
			email = scanEmail.nextLine();
			atIndex = email.indexOf('@');
		}
		while (atIndex < 0);
		
	}
	
	public static void getEmail(){
		System.out.println("Your Email is : "+email);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Setting user's infos
		setEmail();
		setPassword();
		
		// Printing user's infos
		getEmail();
		getPassword();
		
	}

}
