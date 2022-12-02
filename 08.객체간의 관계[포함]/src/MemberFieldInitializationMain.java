
public class MemberFieldInitializationMain {

	public static void main(String[] args) {
 		 MemberField mf1= new MemberField();
		 System.out.println(mf1.member1);
		 System.out.println(mf1.member2);
		 System.out.println(mf1.member3);
		 System.out.println(mf1.member4);
		 System.out.println(mf1.member5);
		 System.out.println(mf1.member6);
		
		System.out.println(mf1.member11);
		System.out.println(mf1.member22);
		System.out.println(mf1.member33);
		System.out.println(mf1.member44);
		System.out.println(mf1.member55);
		System.out.println(mf1.member66);
		
		DuoMember paramember=new DuoMember(1,"일번");
		MemberField mf2=new MemberField(11,1.2, '가', true, "가가가", paramember);
		
		
	}

}
