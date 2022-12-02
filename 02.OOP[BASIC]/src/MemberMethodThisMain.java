
public class MemberMethodThisMain {

	public static void main(String[] args) {
		
		MemberMethodThis mmt1= new MemberMethodThis();
		
		/*
		mmt1.memberfield1=99;
		mmt1.memberfield2='A';
		mmt1.memberfield3=95.4;
		*/
		
		mmt1.setMemberField(1, 'A', 95.4);
		
		/*
		 * MemberMethodThis 객체 내용 출력
		 
		System.out.println(mmt1.memberfield1
				+"\t"+mmt1.memberfield2
				+"\t"+mmt1.memberfield3);
		
		*/
		/*
		 * MemberMethodThis 객체 내용 출력 메소드 호출
		 */
		System.out.println("mmt1의 주소값:"+mmt1);
		mmt1.print();
	}
		
	
		MemberMethodThis mmt2= new MemberMethodThis();
		/*
		mmt2.memberfield1=99;
		mmt2.memberfield2='A';
		mmt2.memberfield3=95.4;
		*/
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	

}
