
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr=new MemberMethodReturn();
		int returnData1= mmr.method1();
		System.out.println("main block->returnData1:"+returnData1);
		
		boolean returnData2=mmr.method2();
		System.out.println("main block->returnData2:"+returnData2);
		
		int returnData3=mmr.add(212, 3333);
		System.out.println("main block->returnData3:"+returnData3);
		
		System.out.println("main block->returnData4:" +mmr.add(11, 22));
		
		//returnmessage1->김경호님 안녕하세요!!
		
		String name="김경호";
		String returnMessage1 = mmr.hello(name);
		System.out.println("main block->returnMessage1:" +returnMessage1);
		System.out.println("main block->returnMessage2:" +mmr.hello("철수"));
		
		System.out.println("--main block memberfield값 사용(출력)--");
		mmr.setMemberField1(1111);		
		mmr.setMemberField2(2222);		
		mmr.setMemberField3(3333);		

		
		/*
		 * int memberField1=mmr.memberfield1;
		 * System.out.println("memberField1:"+memberField1);
		 */
		
		int returnMemberField1=mmr.getMemberField1();
		System.out.println("returnMemberField1:"+returnMemberField1);
		System.out.println("returnMemberField1:"+mmr.getMemberField2());
		System.out.println("returnMemberField1:"+mmr.getMemberField3());
		
		
		
		
		
		
		
		
	}

}
