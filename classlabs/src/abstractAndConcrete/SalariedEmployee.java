package abstractAndConcrete;

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;
	
	SalariedEmployee(String fname, String lname, int id, boolean active, double weeklySalary) {
		super(fname, lname, id, active);
		setWeeklySalary(weeklySalary);
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double salary) {
		if (salary >= 0.0d)
			weeklySalary = salary;
	}
	
	public double getWeeklySalary(double salary) {
		return weeklySalary >= 0.0d ? weeklySalary : 0.0d;
	}

	@Override
	public String toString() {
		return String.format("========== Salaried Employee ==========\n"
				+ "First Name: %s\n"
				+ "Last name: %s\n "
				+ "Employee ID: %d\n"
				+ "Employed: %b\n"
				+ "Earnings: %,.2f\n", getFirstName(),getLastName(), getEmployeeId(), getEmployed(), computeSalary());
	}
	
	@Override
	public double computeSalary() {
		return getWeeklySalary();
	}
	
	
}
