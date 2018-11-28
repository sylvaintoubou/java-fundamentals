/**
 * 
 * Lesson 6
 * An assignment on Classes, Objects and Methods
 */
/**
 * @author mas73rs
 *
 */

package lesson6Assignments;

public class User {
	
	
	int age;
	float height;
	String gender, name;
	
	public String getName(){ // returns name as a string type
		return name;
	} 
	
	public void setName(String name) {}
	
	public void setAge(int age) {}
	
	public int getAge() { // returns age as an int type
		return age;
	} 
	
	public User() {
		this.name = "Osaka";
		this.age = 30;
		this.height = 1.78f;
		this.gender = "Male";
		
	}
	
	public User(String name, int age, float height, String gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating objects
		User user1 = new User();
		User user2 = new User("Josey",30,1.60f,"Female");
		
		// Printing their fields
		
		/*
		System.out.println("Name : "+user1.name+" Age : "+user1.age+" Height : "+user1.height+" Sex : "+user1.gender);
		System.out.println("Name : "+user2.name+" Age : "+user2.age+" Height : "+user2.height+" Sex : "+user2.gender);
		*/
		
		System.out.println("\tUser 1"+"\tUser 2\n");
		System.out.println("Name\t"+user1.name+"\t"+user2.name);
		System.out.println("Age\t"+user1.age+"\t"+user2.age);
		System.out.println("Height\t"+user1.height+"\t"+user2.height);
		System.out.println("Gender\t"+user1.gender+"\t"+user2.gender);
		
		
		// Comparing the 2 objects
		System.out.println("\nAre they the same ? "+user1.equals(user2)); 
		
		// Hashcodes
		System.out.println("\nUser 1 hashcode : "+user1.hashCode());
		System.out.println("User 2 hashcode : "+user2.hashCode());

	}

}
