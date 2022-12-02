import java.io.IOException;
import java.net.Socket;

public class _Second {
	public void method2() throws NullPointerException,IOException{
		System.out.println("\t Second.method1()실행");
		/***************case 1(Runtime Exception)***************/
//		String str=null;
//		int length=str.length();
//		System.out.println(length);
		
		/***************case 2***************/
//		NullPointerException exception=new NullPointerException("예외객체");
//		boolean b=true;
//		if(b) {
//			throw exception;
//		}
		/***************case 3(Runtime Exception 아님)***************/
		Socket socket=new Socket("www.naver.com",70);
		System.out.println(socket);
		System.out.println("");
		return;
		
	
	
	
	
	}
	
	
}
