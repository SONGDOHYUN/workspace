package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		/*
		 * String객체의 생성
		 * - 1. 생성자 호출(명시적 생성)
		 * - 2. ""로 호출(암시적 생성)
		 */
		
		String name1=new String("KIM");
		String name2=new String("KIM");
		String name3="KIM";
		String name4="KIM";
		
		System.out.println("--String객체 내용 비교는 equals매소드를 사용한다--");
		if(name1.equals(name2)) {
			System.out.println("name1객체의 문자열과 name2객체의 문자열이 동일함");
		}
		if(name1.equals(name3)) {
			System.out.println("name1객체의 문자열과 name3객체의 문자열이 동일함");
			
		}
		
		if(name3.equals(name4)) {
			System.out.println("name3객체의 문자열과 name4객체의 문자열이 동일함");
			
		}
	}

}
