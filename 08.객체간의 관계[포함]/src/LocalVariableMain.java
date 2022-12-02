
public class LocalVariableMain {

	public static void main(String[] args) {
		/*
		 * 지역변수(local variable)
		 * 			-메소드 블록 안에서 선언되는 변수(매개변수 포함)
		 * 멤버변수(필드)
		 * 			-클래스 블록 안에서 선언된 변수(자동으로 초기화 이루어짐)
		 */
		/*
		 * 로컬변수(기본형 변수)
		 */
		
		int a=9;
		int b=10;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		/*
		 * local 변수의 초기화
		 * ->모든 변수는 반드시 초기화해서 사용한다.
		 */
		
		int tot=0;
		boolean condition=true;
		if(condition) {
			tot=0;
		System.out.println("tot:"+tot);
		}
		
		/*
		 * local 변수(참조형 변수)
		 */
		
		/*
		 * 참조형 변수 초기화 시 기본값
		 	-null(참조변수 리터럴 값): "주소 없음"
		 */
		
		
		return;
		
	}

}
