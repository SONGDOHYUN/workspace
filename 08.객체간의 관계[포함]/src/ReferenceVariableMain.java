
public class ReferenceVariableMain {

	public static void main(String[] args) {
		System.out.println("--기본형 변수--");
		int score1=80;
		int score2=90;
		System.out.println("score:"+score1);
		System.out.println("score:"+score2);
		
		int temp=score2;
		score2=score1;
		score1=temp;
		System.out.println(score1);
		
		System.out.println("--참조형 변수--");
		DuoMember member1=new DuoMember(1,"송");
		DuoMember member2=new DuoMember(2,"도");
		DuoMember member3=member1;
		
		System.out.println("--참조형 변수의 비교(==,!=)--");
		if(member1==member3) {
			System.out.println("주소값이 동일함:"+member1+member3);
		}
		if(member1!=member2) {
			System.out.println("주소값이 다름:"+member1+member2);
			
		}
		
		System.out.println("--참조변수 주소 swap--");
		DuoMember m1=new DuoMember(10, "김경호");
		DuoMember m2=new DuoMember(20, "김경수");
		m1.print();
		m2.print();
		
		DuoMember tempMem=m1;
		m1=m2;
		m2=tempMem;
		m1.print();
		m2.print();
		
		
		System.out.println("--기본형 변수의 초기값--");
		int tot=0;
		double avg=0.0;
		char c='\u0000';
		boolean marriage=false;
		System.out.println("--참조형 변수의 초기값--");
		DuoMember m3=null;
		
		/*
		 * null: 객체 주소 리터럴 값
		 * - 객체 주소값 초기화의 용도로 사용한다
		 * - null 주소 사용 시  NullpointException 발생
		 */
		
		if(m3==null) {
			
		}else {
			
		}
		
		
		
		
		
		
		
	}

}
