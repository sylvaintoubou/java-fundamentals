package abstractAndConcrete;

public class HourlyEmployee extends Employee {
	
	private double hourlyPay;
	private int hoursWorked;

	public HourlyEmployee(String fname, String lname, int id, boolean active, double pay, int hours) {
		super(fname, lname, id, active);
		setHourlyPay(pay);
		setHoursWorked(hours);
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getSalary() {
		double hourlyPay = getHourlyPay();
		int hoursWorked = getHoursWorked();
		int overTime = getOverTime();
		
		return (hoursWorked * hourlyPay) + (overTime * 1.5 * hourlyPay);
	}
	
	public int getOverTime() {
		return hoursWorked - 40 > 0 ? hoursWorked - 40 : 0;
	}
	
	@Override
	public String toString() {
		return String.format("========== Hourly Employee ==========\n"
				+ "First Name: %s\n"
				+ "Last name: %s\n "
				+ "Employee ID: %d\n"
				+ "Employed: %b\n"
				+ "Hourly Pay: %,.2f\n"
				+ "Hours Worked: %d\n"
				+ "Earnings: %,.2f\n"
				+ "", getFirstName(),getLastName(), getEmployeeId(), getEmployed(),getHourlyPay(), getHoursWorked(), computeSalary());
	}

	@Override
	public double computeSalary() {
		return getSalary();
	}

}
