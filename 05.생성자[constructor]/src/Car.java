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
/**
 * 
 * 차객체를 생성하기 위한 클래스 
 * @author KIM
 * @version 1.0
 */
	
	/*
	 * 멤버필드 속성
	 */
	private String num;  // 차량번호
	private int inTime;  // 입차시간
	private int outTime; // 출차시간
	private int fee;     // 주차요금
	
	/*
	 * 생성자 매소드[초기화]
	 */
	/*
	 * 멤버필드의 기본값을 가진 차 객체가 생성 
	 */
	/**
	 * 기본 초기값을 가진 차객체를 생성한다.
	 * 
	 */
	
	public Car() {
		
	}
	// 차량 번호, 입차시간을 인자로 받음->멤버필드의 값을 가진 차객체 생성
	/**
	 * 입차데이터로 초기화된 차량객체 생성
	 * @param num 차량번호
	 * 
	 * 
	 * 
	 * @param inTime 입차시간
	 */
	public Car(String num,int inTime) {
		this.num=num;
		this.inTime=inTime;
	}
	
	//차량 멤버 데이터를 인자로 받음->멤버필드의 값을 가진 차객체 생성
	/**
	 * 매개변수로 초기화된 차량객체생성
	 * @param num 차량번호
	 * @param inTime 입차시간
	 * @param outTime 출차시간
	 * @param fee 주차요금
	 */
	public Car(String num, int inTime, int outTime, int fee) {
		this.num=num;
		this.inTime=inTime;
		this.outTime=outTime;
		this.fee=fee;
		
		
	}
	
	
	
	
	/*
	 * 멤버메소드[기능]
	 */
	
	/*
	 * 입차시 데이터(번호, 시간)대입
	 */
	/**
	 * 입차시 입차데이터 대입메소드
	 * @param num 차량번호
	 * @param inTime 입차시간
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
	/**
	 * 주차요금계산 
	 */
	public void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000;
	}
	// 헤더 정보 출력
	public void headPrint() {
		
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
	
	/**
	 * 
	 * @return 주차요금
	 */
	
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
