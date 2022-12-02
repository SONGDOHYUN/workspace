
public class MemberFieldMain {

	public static void main(String[] args) {
		System.out.println("---main start---");
		/*
		 * MemberField-> 사용자가 직접 정의한 타입 객체의 주소값을 저장할 변수 선언(참조변수)
		 */
		MemberField mf1;
		/*
		 * MemberField 클래스(틀)로 객체를 성한 후 객체의 참조변수 mf1에 생성된 객체의 주소 값이 대입된다.
		 */
		mf1= new MemberField();
		
		/*
		 * mf1(#100) 주소에 있는 객체의 int 타입인 멤버 변수(member1)에 77값이 대입됨
		 * mf1(#100) 주소에 있는 객체의 double 타입인 멤버 변수(member2)에 3.14159값이 대입됨
		 * mf1(#100) 주소에 있는 객체의 char 타입인 멤버 변수(member3)에 A값이 대입됨
		 * mf1(#100) 주소에 있는 객체의 String 타입인 멤버 변수(member4)에 김수한무거북이값이 대입됨
		 */
		
		/*
		 * 객체의 참조(주소)변수가 가지고 있는 객체의 주소값 #100을 사용해서 멤버필드에 데이터를 대입한다.
		 * 객체의 멤버필드 접근 방법
		 * -> 참조(주소)변수. 멤버필드 이름=값;
		 * -> mf1.member1=77;
		 * 
		 *  1. System.out.println(mf1.member1);
		 *  2. int tempmember=mf1.member1;
		 *  3. System.out.println(tempmember1);
		 *  
		 *  	
		 */
		mf1.member1= 77;
		mf1.member2= 3.14159;
		mf1.member3= 'A';
		mf1.member4= "김수한무거북이";
		
		
		/*
		 * mf 객체의 멤버변수[member1]의 값을 출력한다.
		 */
		
		System.out.println("mf1의 주소값: "+mf1);
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
		
		MemberField mf2=new MemberField();
		mf2.member1=88;
		mf2.member2=1.14;
		mf2.member3='S';
		mf2.member4="ㅎㅎ";
		
		System.out.println();
		System.out.println("---두번째---");
		
		System.out.println(mf2.member1);
		System.out.println(mf2.member2);
		System.out.println(mf2.member3);
		System.out.println(mf2.member4);
		
		
		
		System.out.println("---main end---");
		
		
	}

}
