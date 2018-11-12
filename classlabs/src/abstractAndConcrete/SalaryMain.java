package abstractAndConcrete;

public class SalaryMain {

	public static void main(String[] args) {
		
		SalariedEmployee employee1 = new SalariedEmployee("Yvan", "Ndeme", 001, true, 8_000);
		System.out.println(employee1);
		
		HourlyEmployee employee2 = new HourlyEmployee("Roland", "Tchoumi", 002, true, 2_000, 20);
		System.out.println(employee2);
		
		CommissionEmployee employee3 = new CommissionEmployee("Patou", "Wandji", 003, true, 2_000, 500, 2_000);
		System.out.println(employee3);
		
		CommissionEmployee employee4 = new BasePlusCommissionEmployee("Thierry", "Leutou", 004, true, 1_000, 1_000, 2_000, 80_000);
		System.out.println(employee4);
		
	}

}
