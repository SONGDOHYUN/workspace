import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;

//import java.lang.*;->java.lang package에 있는 클래스는 import 구문 생략 가능하다.


public class javaClassImportMain {

	public static void main(String[] args) {
		System.out.println("--java.lang package--");
		java.lang.String str1="임포트";
		String str2="김경호";
		System.out.println(Math.random());
		
		InputStream in;
		OutputStream out;
		Socket socket;
		
		ShopService shopService;
		Member member;
		
	}

}
