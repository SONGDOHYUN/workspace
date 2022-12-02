
public class RuntimeExceptionThrowMain1 {

	public static void main(String[] args)throws RuntimeException {
		System.out.println("stmt1");
		String str=null;
		System.out.println("stmt2");
		/*예외 발생 코드
		
		*/
		
		int length=str.length();
		System.out.println(length);
		System.out.println("stmt3");
		
		int intArray[]=null;
		intArray=new int[3];
		System.out.println("stmt4");
		intArray[3]=9999;
		System.out.println("stmt5");
		
		
		
		
	}

}
