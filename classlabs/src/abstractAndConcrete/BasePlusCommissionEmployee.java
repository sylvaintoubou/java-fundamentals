package abstractAndConcrete;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;

	public BasePlusCommissionEmployee(String fname, String lname, int id, boolean active, int sales, float commission,
			int limit, double baseSalary) {
		super(fname, lname, id, active, sales, commission, limit);
		setBaseSalary(baseSalary);
	}
	
	

	public BasePlusCommissionEmployee(String fname, String lname, int id, boolean active, int sales, 
			double baseSalary) {
		super(fname, lname, id, active, sales);
		setBaseSalary(baseSalary);;
	}

	public BasePlusCommissionEmployee() {
		super();
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double computeSalary() {
		return getBaseSalary() + super.computeSalary();
	}
	
	@Override
	public String toString() {
		return String.format("========== Base Plus Commission Employee ==========\n"
				+ "First Name: %s\n"
				+ "Base Salary: %,.2f"
				+ "", super.toString(), getBaseSalary());
	}

}
