package abstractAndConcrete;

public abstract class Employee {
	
	public String firstName;
	public String lastName;
	public int employeeId;
	public boolean isEmployed;
	
	// Initial 4 parameters constructor to initialize the general fields of the class
	Employee(String fname, String lname, int id, boolean active){ 
		firstName = fname;
		lastName = lname;
		employeeId = id;
		isEmployed = active;
	}
	
	Employee(){
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public boolean getEmployed() {
		return isEmployed;
	}

	public void setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	
	// General abstract salary
	public abstract double computeSalary();
	
}
