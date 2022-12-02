
public class Examplee {
//	String name;
//	
//	name="나나나";
		String name1="나나나";
		String name2="나나나";
		
		
		
		String no;
		int Speed;
			
	public static void main(String[] args) {
		
		Examplee e1=new Examplee();
		e1.name1="가가가";
		e1.no="1111";
		
		System.out.println("e1의 주소값: "+e1);
		System.out.println("e1의 name 값: "+e1.name1);
		System.out.println("e1의 no 값: "+e1.no);
		
		//NullpointerException?-> 변수가 참조하는 객체가 없음
		
		//int[] Scores(int타입의 배열변수라는 뜻)={10,20,30(이라는 주소값을 힙 영역에 저장해놓고 있음)};
		
		/*
		 * String(클래스) name=new String();->객체 생성 in heap영역 /new 연산자 사용
		 * -ex) Car c1=new Car();
		 * -괄호안에 매개값(차모델, 차속도) 넣고 싶으면 생성자, 매개변수 선언하기
		 * ->Car(String model, int Speed){}
		   ->Car c1=new Car("제네시스", "3000"); 
		 * 
		 */
		
		String name3="김경호";
		String name4="김경호";
		System.out.println("name3의 주소값: "+name3+"=name4의 주소값: "+name4);
		String name5=new String("김경호");
		String name6=new String("김경호");
		System.out.println(name5+name6);
		//내부 문자열을 비교하고 싶을때는 "equals"를 사용한다.
		//boolean result=원본 문자열.equals(비교 문자열/매개값);
		
		String hobby="카페가기";
		hobby=null;
		System.out.println("hobby의 값은: "+hobby);//->쓰레기 객체돼서 자동으로 버려진다.
		
		//변수는 1개 당 1개의 데이터만 저장 가능함
		int score1=90;
		int score2=85;
		int score3=70;
		int sum=score1+score2+score3;
		double avg= (double)sum/3;
		System.out.printf("소수점이하 2자리까지 구한 평균값: %.2f",avg);
		
		
		
		
		
		
	}

}
