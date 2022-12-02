package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 * Math 클래스
		 * - 수학함수를 가지고 있는 클래스
		 * - 모든 메소드 static
		 * - 객체 생성이 불가능하다[생성자의 접근제한자가 private이기 때문에]
		 */
		
		double r=Math.abs(-123.789);
		System.out.println(r);
		System.out.println(Math.max(1212, 34));
		System.out.println(Math.min(1212, 34));
		System.out.println(Math.round(35.5555));
		
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println("1-10사이의 정수 5개 랜덤 생성");
		System.out.println();
		//(int)(Math.random()*n)+start no
		
		
		
	}

}
