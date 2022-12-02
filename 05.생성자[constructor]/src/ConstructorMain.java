
public class ConstructorMain {

	public static void main(String[] args) {
		/*
		 * new constructor();
		 * ->1. constructor 클래스(틀)로 객체 생성 
		 * ->2. 생성자매소드(블록) 호출
		 * ->3. 생성된 객체의 주소 반환
		 */
		
		System.out.println("---c1---");
		Constructor c1=new Constructor();
		System.out.println("c1:" +c1);
		c1.print();
		
		System.out.println();
		
	}

}
