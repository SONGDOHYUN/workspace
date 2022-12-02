
public class PrintOverLoadingMain {

	public static void main(String[] args) {
		Print p=new Print();
		p.print(1);
		p.print(1, 2);
		p.print(1, 2, 3);
		p.print(false);
		p.print("냠");
		p.print('a');
		p.print(12345);
		
		
		
	}

}
