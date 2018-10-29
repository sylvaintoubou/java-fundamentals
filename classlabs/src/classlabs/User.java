package classlabs;

public class User {
	
	 String email;
	 String password;
	 String errorMessage = "";
	
	public void setPassword(String password){
		int length = password.length();
		if(length >= 6 || length <= 10 ) {
			this.password = password;
		}else {
			errorMessage +=  "Wrong password. Password must have 6 characters or up to 10 characters.";
		}
		
	}
	
	public void getPassword(){
		System.out.println("Your password is : "+password);
	}
	
	public void setEmail(String email){
		if(email.matches("[a-zA-Z@a-zA-Z]+.[a-zA-Z]+")){
				this.email = email;
		}else {
				errorMessage += " Invalid email. Email must be a valid email.";
			}
	}
	
	public void getEmail(){
		System.out.println("Your Email is : "+email);
	}

}
