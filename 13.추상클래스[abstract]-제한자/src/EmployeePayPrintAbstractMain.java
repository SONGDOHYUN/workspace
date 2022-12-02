
public class EmployeePayPrintAbstractMain {

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
			System.out.println("===================================");
			System.out.println();
		}
		
		
		
	}

}
