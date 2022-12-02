
public class CarMemberMethodMain {

	public static void main(String[] args) {
		Car car1= new Car();
		//car1.num="1234";
		//car1.inTime=12;
		
		car1.setIpChaData("1234", 12);
		
		//car1.outTime=16;
		car1.setOutTime(16);
		
		//car1.fee=(car1.outTime-car1.inTime)*1000;
		car1.calculateFee();
		
		
		car1.print();
		
	}

}
 