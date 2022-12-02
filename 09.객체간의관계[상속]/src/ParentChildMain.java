
public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println("==child 1==");
		Child1 child11=new Child1();
		child11.member1=1;
		child11.member2=2;
		child11.member3=3;
		child11.member4=4;
		child11.method1();
		child11.method2();
		child11.method3();
		child11.method4();
		System.out.println("==child11 주소: "+child11);
		
		System.out.println("==child2==");
		Child2 child21=new Child2();
		child21.member1=1;
		child21.member2=1;
		child21.member5=5;
		child21.method1();
		child21.method2();
		child21.method5();
		
		System.out.println("==parent==");
		Parent p=new Parent();
		p.member1=11;
		p.member2=22;
		p.method1();		
		p.method2();		
		
		
	}

}
