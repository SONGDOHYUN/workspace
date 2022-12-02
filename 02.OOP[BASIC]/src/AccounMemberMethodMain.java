
public class AccounMemberMethodMain {

	public static void main(String[] args) {
		//계좌 객체 생성
		Account account1= new Account();
		
		//계좌 데이터 대입
		account1.setAcountData(1111, "철수", 70000, 3.4);
		
		//8000원 입금
		System.out.println("--입금 전--");
		account1.print();
		account1.deposit(8000);
		System.out.println("--입금 후--");
		account1.print();

		//3000원 출금
		
		account1.withdraw(3000);
		account1.headerprint();
		account1.print();
		
		//1. 은행모든 계좌에 잔고 50원 증가
		
		//1-1. 전체계좌 생성
		
		Account acc1=new Account();
		Account acc2=new Account();
		Account acc3=new Account();
		
		acc1.setAcountData(1111, "가가", 1000, 1.0);
		acc2.setAcountData(2222, "나나", 2000, 2.0);
		acc3.setAcountData(3333, "다다", 3000, 3.0);
		
	    
	    //1-2. 잔고 50원 증가
	    
	    acc1.deposit(50);
	    acc2.deposit(50);
	    acc3.deposit(50);
		
	    acc1.print();
	    acc2.print();
	    acc3.print();
		
		//2. 은행계좌 전체 정보 출력
	    
	}

}
