
public class Car {
	/*
	 * 차량의 전체 생산대수를 저장할 static(공용)변수
	 */
	public static int count;
	
	private int no;// 차량번호
	private String model;// 차량모델
	private String color;// 차량색
	
	public Car(int no, String model, String color) {
		this.no=no;
		this.model=model;
		this.color=color;
		Car.count=Car.count+1;
	}
	public static void headerprint() {
		System.out.println("----------------------");
		System.out.println("번호\t모델\t 색상");
		System.out.println("----------------------");
	}
	public void print() {
		System.out.println(no+"\t"+model+"\t"+color);
	}
	public int getNo() {
		return no;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
