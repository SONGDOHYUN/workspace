import com.itwill.shop.ShopService;
//import com.itwill.shop.member.Member;
//import com.itwill.shop.member.MemberService;->line 4번이랑 같은 뜻
import com.itwill.shop.member.*;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;

//패키지를 제외한 클래스 이름이 동일한 클래스는 둘다 import 불가능함!!!

public class PackageImportMain {

	public static void main(String[] args) {
		/*
		 * 자동 import 단축키: control+shift+o
		 */
		ShopService shopService=new ShopService();
		System.out.println(shopService);
		
		Member m1=new Member();
		System.out.println(m1);
		
		MemberService memberService=new MemberService();
		System.out.println(memberService);
		
		System.out.println("------com.itwill.shop.product.Product,com.itwill.shop.product.ProductService----------");
		Product product=new Product();
		System.out.println(product);
		ProductService productService=new ProductService();
		System.out.println(productService);
		System.out.println("------com.itwill.shop.admin.Product,com.itwill.shop.admin.ProductService----------");
		
		
		com.itwill.shop.admin.Product adminProduct=new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		com.itwill.shop.admin.ProductService adminProductService=new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);
		//줄여쓸 수 없음->풀네임으로 써야함
		
	}

}
