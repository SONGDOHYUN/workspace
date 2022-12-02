
public class MemberMethod {
	int memeber1;
	
	void method1(){
		System.out.println("\t--void method1()실행 start--");
		System.out.println("\t method1 stmt1");
		System.out.println("\t method1 stmt2");
		System.out.println("\t--void method1()실행 end--");
		
		/*
		 * << return >>
		   - 모든 메쏘드블록의 마지막에는 항상 실행 흐름을 호출한 곳으로 반환하여야한다.
		   - 실행흐름을 반환하는 문장이 return문이다.
		   - return 문을 만나면 실행 흐름이 호출한 곳으로 반환된다.
		   - return type이 void 인 경우에는 생략이 가능하다.
		   - return문이 생략된 경우에는 컴파일러가 자동으로 return문을 삽입하여준다.
		 */
		return;
		
	}
	 void method2() {
		 System.out.println("\t----void method2()----실행");
		 System.out.println("\tmethod2 stmt1");
		 System.out.println("\tmethod2 stmt2");
		 System.out.println("\t----void method2()----실행종료");
		 return;
	 }
	 
	 /*********매개변수가 있는 method정의*************/
	 
	 void method3(int count) {
		 System.out.println("\t----void method3(int count)----실행");
		 int localVar=111;
		 System.out.println(
				 "\tmethod3 메소드 블록 안에서 선언된 local 변수:" +localVar);
		 for(int i=0;i<count;i++) {
		 System.out.println(
				 "\tmethod3 void method3(int count)실행: parameter(매개변수) count값->" +count);
		 }
		 System.out.println("\tmethod3 stmt2");
		 System.out.println("\t----void method2(int count)----실행종료 후 반환");
		 return;
	 }
		
	 
	 
	public void method4(String name,String msg, int count) {
		for(int i=0; i<count; i++) {
			System.out.printf("\t%s %s!", name, msg);
			
		}
		
	}	 
	
	 
	 
	 
	 
	
}
