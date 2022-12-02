/*
 * 1. 주차장에서 차 객체를 생성할 클래스(틀->객체 생성 가능)
 * 2. car 객체의 주소를 저장할 수 있는 타입(선언 가능)
 */
public class Car {
	/* 
	 * 클래스의 구성 요소
	 * 1. 멤버필드(변수[속성]): 차객체의 속성데이터를 저장할 변수
	 * 2. 멤버 method[기능]: 차객체가 외부에 제공하는 기능
	 */
	
	
	/*
	 * 멤버필드 속성
	 */
	private String num;  // 차량번호
	private int inTime;  // 입차시간
	private int outTime; // 출차시간
	private int fee;     // 주차요금
	
	/*
	 * 멤버메소드[기능]
	 */
	
	/*
	 * 입차시 데이터(번호, 시간)대입
	 */
	public void setIpChaData(String num, int inTime) {
		this.num=num;
		this.inTime=inTime;
		
	}
	/*
	 * 출차시간 멤버필드 outTime에 출차시간 데이터 대입[set]
	 */
	public void setOutTime(int outTime) {
		this.outTime=outTime;
		
	}
	/*
	 * 주차요금 계산
	 */
	public void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000;
	}
	
	/*
	 * 차량정보출력
	 */
	public void print() {
		System.out.println("-------------------------------------");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-------------------------------------");
		System.out.printf("%6s %7d %8d %9d\n", this.num, this.inTime, this.outTime, this.fee);
	}
	/*
	 * getter, setter 매소드 자동생성 단축키
	 * -> alt+shift+S->R 누르기
	 */
	
	public String getNum() {
		return num;
	}
	public int getInTime() {
		return inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public int getFee() {
		return fee;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
	
	//setter, getter
	
}
