
public class AccountEncapsulationMain {

	public static void main(String[] args) {
		Account account1=new Account();
		account1.setAcountData(1111, "철수", 8000, 1.5);
		/*
		 * 8000원 입금
		 */
		account1.deposit(8000);
		account1.print();
		
		/*
		 * 500원 출금
		 */
		account1.withdraw(500);
		account1.print();
		
		/*
		 * 이율 변경
		 */
		account1.setIyul(3.6);
		
		/*
		 * 잔고 얻기
		 */
		int account1Balance=account1.getBalance();
		System.out.println("accout1의 잔고:" +account1Balance);
		account1.headerprint();
		account1.print();
		
		Account ac1=new Account();
		Account ac2=new Account();
		Account ac3=new Account();
		
		ac1.setAcountData(1000, "송", 6000, 1.5);
		ac2.setAcountData(2000, "도", 7000, 2.5);
		ac3.setAcountData(3000, "현", 8000, 3.5);
		
		Account accc=new Account();
		accc.setAcountData(10, "가", 10, 10.0);
		accc.headerprint();
		accc.print();
		
		accc.deposit(50000);
		accc.headerprint();
		accc.print();
		
		accc.withdraw(1000);
		accc.headerprint();
		accc.print();
		
		/*
		 * 잔고 50원씩 증가시키기
		 */
		ac1.deposit(50);
		ac2.deposit(50);
		ac3.deposit(50);
		
		ac1.headerprint();
		ac1.print();
		ac2.print();
		ac3.print();
		/*
		 * 은행 총 잔고(get)
		 */
//		int totBalance=ac1.balance+ac2.balance+ac3.balance;
		
		int totBalance=ac1.getBalance()+ac2.getBalance()+ac3.getBalance();
		System.out.println("은행 총 잔고:"+ totBalance);
		
		Account bb=new Account();
		bb.setAcountData(1234, "s", 10, 1);
		bb.headerprint();
		bb.print();
		bb.deposit(500);
		bb.headerprint();
		bb.print();
		bb.withdraw(35);
		bb.headerprint();
		bb.print();
		
		
		
	}

}
