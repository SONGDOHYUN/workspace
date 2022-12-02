
public class EmployeePayPrintFinalMain {

	public static void main(String[] args) {
		
		Employee[] emps= {
			new SalaryEmployee(1, "KIM", 300),	
			new SalaryEmployee(2, "SIM", 400),	
			new SalaryEmployee(3, "RIM", 500),
			new HourlyEmployee(4, "TIM", 100, 600),
			new HourlyEmployee(5, "FIM", 200, 700),
		};
		
		for(Employee emp:emps) {
			emp.calculatePay();
			System.out.println("===="+emp.getName()+"님의 급여명세표====");
			emp.print();
			double incentive=emp.calculateIncentive();
			System.out.println("\t인센티브: "+incentive);
			System.out.println("===================================");
			System.out.println();
		}
		
		System.out.println("사원인센티브율: "+Employee.INCENTIVE_RATE);
		
	}

}
