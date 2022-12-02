
public class InterfaceABImplMain {

	public static void main(String[] args) {
		
		System.out.println("--InterfaceABImpl--");
		InterfaceABImpl abImpl=new InterfaceABImpl();
		abImpl.method1();
		abImpl.method2();
		abImpl.method3();
		abImpl.method4();
		
		System.out.println("--InterfaceA--");
		InterfaceA ia=abImpl;//상위로 캐스팅한다.
		
		ia.method1();
		ia.method2();
//		ia.method3(); -> 접근 불가
//		ia.method4();
		
		System.out.println("--InterfaceB--");
		InterfaceB ib=abImpl;
		ib.method3();
		ib.method4();
		
		System.out.println("--InterfaceA<->InterfaceB 서로 캐스팅?->강제형변환--");
		InterfaceA ia2=new InterfaceABImpl();
		ia2.method1();
		ia2.method2();
		InterfaceB ib2=(InterfaceB)ia2;
//		ib2.method1();
//		ib2.method2();
		ib2.method3();
		ib2.method4();
		
		System.out.println("--object--");
		Object o3=new InterfaceABImpl();
		
		
	}

}
