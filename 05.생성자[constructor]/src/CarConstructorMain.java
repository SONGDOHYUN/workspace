
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("****car1****");
		Car car1=new Car("34",15);
		car1.setIpChaData("1234", 12);
		car1.setOutTime(14);
		car1.calculateFee();
		car1.print();
		
		System.out.println("****car2****");
		Car car2=new Car("3434",15);
		car2.setOutTime(17);
		car2.calculateFee();
		car2.print();
	
		System.out.println("****오늘 주차장 이용 차량****");
		Car cara=new Car("1212",1,2,1000);
		Car carb=new Car("1213",3,4,5000);
		Car carc=new Car("1214",5,6,7000);
		cara.headPrint();
		cara.print();
		carb.print();
		carc.print();
		
		
		
		
		
		System.out.println();
		System.out.println("=====차량 한대====");
		Car carq=new Car("7777",4,5,1000);
		carq.headPrint();
		carq.print();
		
		
		System.out.println();
	}
	
	
	
	
}
