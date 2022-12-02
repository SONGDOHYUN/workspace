
public class CarFactoryStaticMain {

	public static void main(String[] args) {
//		Car.count=0;
		Car c1=new Car(1, "k3" ,"빨강");
//		Car.count++;
		
		Car c2=new Car(2, "k5" ,"초록");
//		Car.count++;
		
		Car c3=new Car(3, "k7" ,"검정");
//		Car.count++;
		
		System.out.println("차량 총 생산대수:"+Car.count);
		
		Car.headerprint();
		c1.print();
		c2.print();
		c3.print();
		
		
	}

}
