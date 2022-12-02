import java.net.Socket;
import java.sql.DriverManager;

public class NoRuntimeExceptionCatchMain2 {

	public static void main(String[] args) {
		try {
		System.out.println("stmt1");
		/*
		 * IOException
		 */
		Socket Socket=new Socket("www.daum.net",80);
		
		System.out.println("stmt2");
		/*
		 * 예외 발생 코드 [ClassNotFoundException]
		 */
		Class.forName("AClass");
		System.out.println("stmt3");
		
		/*
		 * 예외 발생 코드[SQL Exception]
		 */
		DriverManager.getConnection("");
		
		/*
		 * 예외 발생 코드[RuntimeException]
		 */
		int result=3/0;
	}catch(Exception e) {
		//가장 상위버전
		System.err.println("모든 예외를 한 곳에서 처리->MSG: "+e.getMessage());
		System.out.println("고객님 죄송합니다");
		System.out.println("--print stack trace--");
		e.printStackTrace();
	}
		System.out.println("main end return");
	}

}
