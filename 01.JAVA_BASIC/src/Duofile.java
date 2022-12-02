
public class Duofile {

	public static void main(String[] args) {
		int personalnumber;
		String name;
		String Number2;
		char gender;
		int marriaged;
		boolean smoke;
		double height;
		char score;
		char face1;
		char face2;
		char dashR;
		char dashL;
		
		personalnumber = 236514;
		name = "홍길동";
		Number2= "201212-3495039";
		gender= '남';
		marriaged= 0;
		smoke = true;
		height = 178.3;
		score= 'A';
		face1 = '상';
		face2 = '중';
		dashR = '(';
		dashL = ')';
		
		System.out.println("*************************");		
		System.out.println("회원번호: "+personalnumber);		
		System.out.println("이    름: "+name);
		System.out.println("주민번호: "+Number2);
		System.out.println("성    별: "+gender);
		System.out.println("결혼횟수: "+marriaged);
		System.out.println("흡연여부: "+smoke);
		System.out.println("키      : "+height);
		System.out.println("학    점: "+score);
		System.out.println("용    모: "+face1+dashR+face2+dashL);
		System.out.println("*************************");
	}

}
