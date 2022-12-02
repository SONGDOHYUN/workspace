
public class AbstractParentChildMain {

	public static void main(String[] args) {
		//AbstractClassParent acp=new AbstractClassParent();
	//Cannot instantiate the type AbstractClassParent
		AbstractClassChild acc1=new AbstractClassChild();
		acc1.method1();
		acc1.method2();
		
		AbstractClassParent acc2=new AbstractClassChild();
		acc2.method1();
		acc2.method2();
			
	}

}
