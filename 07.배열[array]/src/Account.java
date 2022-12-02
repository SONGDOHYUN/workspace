/*
 *  계좌객체를 생성하기위한 클래스(틀, 타입)
 */

public class Account {

	/*
	 * 1. 속성[멤버필드(변수)]
	 */
	private int no; 		//계좌번호
	private String owner;	//계좌주
	private int balance;	//계좌잔고
	private double iyul;	//이율
	
	public Account() {
		
	
	
	}
	
	
	
	
	
	/*
	 * 2. 기능[멤버 메쏘드]->계좌 객체가 가지고 있는 기능
	 */
	
	/*
	 * 계좌 데이터를 초기값으로 대입하는 메소드
	 */
	
	public Account(int no, String owner, int balance, double iyul) {
		super();
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

		String ownerCurrent=this.getOwner();
		



//	public Account(int no, String owner, int balance, double iyul) {
//		super();
//		this.no = no;
//		this.owner = owner;
//		this.balance = balance;
//		this.iyul = iyul;
//	}





	public void setAcountData(int no, String owner, int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
		
	}	
	
	/*
	 *  입금
	 */
	
	public void deposit(int money) {
		this.balance+=money;
	}
	
	/*
	 *  출금
	 */
	
	public void withdraw(int money) {
		this.balance-=money;
	}
	//계좌 헤더 출력
	public void headerprint() {
		System.out.println("---------------------");
		System.out.printf("%s %s %3s %2s \n", "번호", "이름", "잔고", "이율");
		System.out.println("---------------------");
	
	}	
	
	/*
	 * 계좌 객체의 정보 출력
	 */
	
	public void print() {
		System.out.printf("%d %2s %6d %.1f %n", this.no, this.owner, this.balance, this.iyul );
	}

	public int getNo() {
		return no;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public double getIyul() {
		return iyul;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setIyul(double iyul) {
		this.iyul = iyul;
	}





	public static void headerPrint() {
		// TODO Auto-generated method stub
		
	}

	



//	public int getNo() {
//		return no;
//	}
//
//	public String getOwner() {
//		return owner;
//	}
//
//	public int getBalance() {
//		return balance;
//	}
//
//	public double getIyul() {
//		return iyul;
//	}
//
//	public void setNo(int no) {
//		this.no = no;
//	}
//
//	public void setOwner(String owner) {
//		this.owner = owner;
//	}
//
//	public void setBalance(int balance) {
//		this.balance = balance;
//	}
//
//	public void setIyul(double iyul) {
//		this.iyul = iyul;
//	}
//	

		

	
	
	
	
	
	
	
}
