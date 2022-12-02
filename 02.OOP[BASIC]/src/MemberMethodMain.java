
public class MemberMethodMain {

	public static void main(String[] args) {
		
		System.out.println("main stmt1");
		
		
		MemberMethod mm1= new MemberMethod();
		/*
		 * 멤버method 실행(호출)
		 * ->형식: 참조변수, method이름[식별자]();
		 * ->main 실행흐름을 mm1 주소에 있는 객체의
		 * method1이라는 이름의 method(실행흐름블록)으로 보낸다.
		 */
		mm1.method1();
		System.out.println("main stmt2");
		mm1.method2();
		System.out.println("main stmt3");
		System.out.println("*****매개변수가 있는 method의 호출*****");
		mm1.method3(3);
		System.out.println("main stmt4");
		mm1.method3(5);
		System.out.println("main stmt5");
		mm1.method4("김경호님","누구세요",3);
		
		
		System.out.println();
		System.out.println("main end");
		return;
	}

		
	
	
}
