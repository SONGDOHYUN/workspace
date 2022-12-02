import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NoRuntimeExceptionCatchMain1 {

	public static void main(String[] args) {
		try {
		System.out.println("stmt1");
		/*
		 * 예외 발생 코드 [IOException]
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
	}catch(IOException e) {
		System.out.println("IOException: "+e.getMessage());
	}catch(ClassNotFoundException e) {
		System.out.println("ClassNotFoundException: "+e.getMessage());
		
	}catch(SQLException e) {
		System.out.println("SQLException: "+e.getMessage());
	}catch(Exception e) {
		System.out.println("Exception: "+e.getMessage());
		//가장 상위를 밑에다 두기
	}
		System.out.println("main end return");
	}

}
