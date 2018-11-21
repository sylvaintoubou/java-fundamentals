package seven.lesson18;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2695480573402180855L;
	private int age;
	private String name, gender;
	private transient double height;
	
	public User(String name, int age, String gender, double height) {

		this.age = age;
		this.name = name;
		this.gender = gender;
		this.height = height;
	}

	
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	
	@Override
	public String toString() {
		return "User Informations \n======================="
				+ "\nName : " + name 
				+ "\nAge : " + age 
				+ "\nGender : " + gender
				+ "\nHeight : " + height + "m" 
				+ "\n";
	}


}
