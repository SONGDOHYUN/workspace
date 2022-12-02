
public class MemberMethodReturn {
	/*
	 * 멤버필드
	 ->멤버필드 선언시 값을 대입할 수 있다.
	 */
	int memberfield1=10;
	int memberfield2=20;
	int memberfield3=30;
	
	/*
	 * setter method
	 */
	void setMemberField1(int memberField1) {
		this.memberfield1=memberField1;
	}
	int getMemberfield1() {
		return memberfield1;
	}
	void setMemberfield1(int memberfield1) {
		this.memberfield1 = memberfield1;
	}
	int getMemberfield2() {
		return memberfield2;
	}
	void setMemberfield2(int memberfield2) {
		this.memberfield2 = memberfield2;
	}
	int getMemberfield3() {
		return memberfield3;
	}
	void setMemberfield3(int memberfield3) {
		this.memberfield3 = memberfield3;
	}
	void setMemberField2(int memberField2) {
		this.memberfield2=memberField2;
	}
	void setMemberField3(int memberField3) {
		this.memberfield3=memberField3;
	}
	
	
	/*
	 * getter method
	 */
	
	int getMemberField1() {
		return memberfield1;
	}
	int getMemberField2() {
		return memberfield2;
	}
	int getMemberField3() {
		return memberfield3;
	}
	
	
	/*
	 * 
	 */
	
	/*
	 * 멤버메소드
	 */
	
	int method1() {
		System.out.println("\t---int method1()실행---");
		int result =10+200;
		System.out.println("\t---int method1()실행 종료 후 int 데이터 반환---");
	/*
	* return >>> 호출한 클래스(객체)에게 반환할 값(변수/리터럴/연산의 결과)
		-호출한 곳으로 실행흐름을 반환
		-호출한 곳으로 데이터 반환
		-반환할 데이터가 없는 경우(void) return문 생략 가능
		-반환할 데이터가 있는 경우(int...등등)return문 반드시 기술해야함
	*/
		return result;
	}
	boolean method2() {
		System.out.println("\t--boolean method2() 실행---");
		boolean isMarried=false;
		System.out.println("\t--boolean method2() 실행 종료 후 boolean 반환---");
		return isMarried;
	}
	/*
	 * 두 개의 정수를 파라메타로 받아서 더한 결과(정수)를 반환하는 메소드
	 */
	
	
	
	int add(int a, int b) {
		int result=a+b;
		return result;
	}
		String hello(String name) {
			System.out.println("\t--string hello(string name)실행--");
		String msg="";
		msg=name+"님 안녕하세요!";
		System.out.println("\t--string hello(string name)실행종료--");
		return msg;
	}
	
	
	
	
	
	
	
	
}
