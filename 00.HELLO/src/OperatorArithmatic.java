
public class OperatorArithmatic {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int result=0;
		
		result = a+b;
		System.out.println("a+b-->"+result);
		result= a-b;
		System.out.println("a-b-->"+result);
		result = a*b;
		System.out.println("a*b-->"+result);
		result = a/b;//?
		System.out.println("a/b-->"+result);
		double result1 = (double)a/b;
		System.out.println("double dresult = a/b-->" +result1);
		
		/*
		 * 나머지 연산자
		 * %
		 */
		
		result=a%b;
		System.out.println("a%b-->"+result);
		
		int year=2022;
		result=year%4;//0,1,2,3
		System.out.println("2022%4-->"+result);
		result=year%100;//0~99
		System.out.println("2022%100-->"+result);
		result=year%400;//0-399
		
		System.out.println("result변수의 값이 0이면 4의 배수:"+result);
		System.out.println("문자연산");
		
		/*
		 * 비트연산자
		 * <<,>>
		 * int d=1;         ==>
		 * result=d << 1;   ==>
		 */
		
		int d=1;
		System.out.println(d);
		result=d << 1;
		System.out.println(result);
		result=d << 2;
		System.out.println(result);
		result=d << 3;
		System.out.println(result);
		result=d << 4;
		System.out.println(result);
		
		d=128;
		System.out.println(d);
		result= d >> 1;
		System.out.println(result);
		result= d >> 2;
		System.out.println(result);
		result= d >> 3;
		System.out.println(result);
		result= d >> 4;
		System.out.println(result);
		System.out.println("---문자연산---");
		
		char ca='A';
		char cz='Z';
		int numOfAlphabet =cz-ca+1;
		System.out.println("알파벳 대문자수" +numOfAlphabet);
		char c='a';
		System.out.println(c);
		c='a'+1;
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		
		
	}

}
