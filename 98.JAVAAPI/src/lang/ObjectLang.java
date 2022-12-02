package lang;

public class ObjectLang {

	public static void main(String[] args) {
		
		Object o1=new Object();
		Object o2=new Object();
		Object o3=o1;
		
		String str1=o1.toString();
		System.out.println(str1);
		System.out.println(o2);
		
		if(o1.equals(o2)) {
			System.out.println("o1과 o2 주소가 동일하다[equals]");
		}else {
			System.out.println("o1과 o2 주소가 동일하지않다");
			System.out.println();
			System.out.println("ghkrdls");
		}
		
		/*
		 *  Account에 재정의된 toString메소드
		 */
		
	}

}
