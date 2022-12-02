
public class CarMemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 주차관리 프로그램
		 */
		
		/*
		 * 1. 차량번호 1234차량 12시 입차함
		 */
		
		Car car1;        //차객제의 주소값을 저장할 car타입 참조(주소)변수 선언
		car1= new Car(); //Car 클래스를 사용해서 차객체를 Heap메모리에 생성 후 
						 //차객체의 주소값이 car1 참조(주소)변수에 대입된다. 
		
		car1.num="1234"; //차객체(car1)의 멤버필드 num에 "1234"값을 대입한다.
		car1.inTime=12;  //차객체(car1)의 멤버필드 inTime에 "12"값을 대입한다.
		
		// 2. car1 차량의 출차시간은 16시
		/*
		 * 2-1. 출차시간 대입
		 */
		
		car1.outTime=16; //차객체(car1)의 멤버필드 outTime에 "16"값을 대입한다.
		
		
		// 2-2. 주차요금 계산
		car1.fee=(car1.outTime-car1.inTime)*1000; 
		//차객체(car1)의 멤버필드 fee에 차객체의 in/outTime 멤버필드를 사용해서 주차요금 계산 후 값을 대입한다.
		
		
		
		// 2-3. 주차요금 영수증 출력작업
		
			
		System.out.println("-------------------------------------");
		System.out.printf("%s %s %s %s\n", "차량번호", "입차시간", "출차시간", "주차요금");
		System.out.println("-------------------------------------");
		System.out.printf("%6s %7d %8d %9d", car1.num, car1.inTime, car1.outTime, car1.fee);
		
		
		
		
		
		
		
	}

}
