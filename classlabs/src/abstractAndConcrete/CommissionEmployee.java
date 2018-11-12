package abstractAndConcrete;

public class CommissionEmployee extends Employee {

	private int sales;
	private float commission;
	private final int SALES_LIMIT;
	
	
	public CommissionEmployee(String fname, String lname, int id, boolean active, int sales, float commission, int limit) {
		
		super(fname, lname, id, active);
		SALES_LIMIT = limit;
		setSales(sales);
		setCommission(commission);
	}
	
	
	
	public CommissionEmployee(String fname, String lname, int id, boolean active, int sales) {
		super(fname, lname, id, active);
		SALES_LIMIT = 10_000;
	}

	public CommissionEmployee() {
		SALES_LIMIT = 10_000;
	}

	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

	@Override
	public String toString() {
		return String.format("========== Commission Employee ==========\n"
				+ "First Name: %s\n"
				+ "Last name: %s\n "
				+ "Employee ID: %d\n"
				+ "Employed: %b\n"
				+ "Commission: %,.2f\n"
				+ "Sales: %d\n"
				+ "Earnings: %,.2f\n"
				+ "", getFirstName(),getLastName(), getEmployeeId(), getEmployed(),getCommission(), getSales(), computeSalary());
	}

}
