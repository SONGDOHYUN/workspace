import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NoRuntimeExceptionThrowMain1 {

	public static void main(String[] args) throws Exception{
		
		//throws IOException, ClassNotFoundException, SQLException, Exception->이렇게 써도 관계없음
		//안쓰면 "unhandled" 나옴 
		
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
		
		
	}

}
