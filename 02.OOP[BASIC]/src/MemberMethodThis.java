
public class MemberMethodThis {
	/*
	 * 멤버필드[속성]
	 */
	
	int memberfield1;
	char memberfield2;
	double memberfield3;
	
	/*
	 * 멤버매소드[기능]
	 */
	
	/*
	 * 1. 객체의 멤버필드에 데이터를 대입
	 */
	void setMemberField(int memberField1, char memberField2, double memberField3) {
		this.memberfield1=memberField1;
		this.memberfield2=memberField2;
		this.memberfield3=memberField3;
	}
	
	
	/*
	 * 2. 객체의 멤버필드의 내용을 출력하는 메소드
	 */
	
	
	//자기자신의 멤버데이터 출력
	void print() {
		/*
		 * this:
		 * - self 참조 변수
		 * - void print() 메소드가 실행될 때의 객체의 주소값
		 * - this는 생략가능하다
		 */
		System.out.println("mmt1.print()메소드 안에서 this:"+this);
		System.out.println(this.memberfield1+"\t"
				+this.memberfield2+"\t"
				+this.memberfield3);
		
		
	}
	
	
}
