import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter your password");
		String password= input.nextLine();
		System.out.println(" " + setPassword(password));
		System.out.println("your password is "+ password);
		System.out.println("enter your email");
		String email= input.nextLine();
		System.out.println(setEmail(email));
		System.out.println("enteremail is " + email);
		
	}
	
	private String email;
	private int Password;
	
	public static String setPassword(String password) {
		if(password.length()<=6) {
			System.out.println("your password don't have 6 caracters or more");
		}else if (password.length()>=10) {
			System.out.println("your password have more than 10 caracters");
		}
		return password;
		
	}
	
	
	public int getPassword() 
	
	{
		return Password;
		
	}
	public static String setEmail(String email) 
	
	{
		if(email.endsWith(".com")) {
			
			System.out.println(" not good email");
		}
		return email;
	}
	
	public String getEmail() 
	
	{
		return email;
	}
	
	
	

}
