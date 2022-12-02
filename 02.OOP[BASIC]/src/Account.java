/*
 *  계좌객체를 생성하기위한 클래스(틀, 타입)
 */

public class Account {

	/*
	 * 1. 속성[멤버필드(변수)]
	 */
	int no; 		//계좌번호
	String owner;	//계좌주
	int balance;	//계좌잔고
	double iyul;	//이율
	
	
	/*
	 * 2. 기능[멤버 메쏘드]->계좌 객체가 가지고 있는 기능
	 */
	
	/*
	 * 계좌 데이터를 초기값으로 대입하는 메소드
	 */
	
	void setAcountData(int no, String owner, int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
		
	}	
	
	/*
	 *  입금
	 */
	
	void deposit(int money) {
		this.balance+=money;
	}
	
	/*
	 *  출금
	 */
	
	void withdraw(int money) {
		this.balance-=money;
	}
	//계좌 헤더 출력
	void headerprint() {
		System.out.println("---------------------");
		System.out.printf("%s %s %3s %2s \n", "번호", "이름", "잔고", "이율");
		System.out.println("---------------------");
	
	}	
	
	/*
	 * 계좌 객체의 정보 출력
	 */
	
	void print() {
		System.out.printf("%d %2s %6d %.1f %n", this.no, this.owner, this.balance, this.iyul );
	}
	

	
	
	
	
	
	
	
	
}
