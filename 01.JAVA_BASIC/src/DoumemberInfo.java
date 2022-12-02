
public class DoumemberInfo {

	public static void main(String[] args) {
			/*
			 *************************
			회원번호 : 236514   
이    름 : 홍길동   
주민번호 : 201212-3495039   
성    별 : 남   
결혼횟수 : 0   
흡연여부 : true   
키       : 178.3   
학    점 : A   
용    모 : 상(중)   
************************** 
			 */
		
		System.out.println("*************************");
		String pnum="회원번호";
		int i1,i2,i3,i4;
		i1=236514;
		i2=201212;
		i3=3495039;
		i4=0;
		String name="홍길동";
		String num="주민번호";
		String namee="이름";
		String sex="성별";
		String marriged="결혼횟수";
		String smoke="흡연여부";
		String scores="학점";
		String face="용모";
		String faces="상";
		String facess="중";
		char height='키';
		char gender='남';
		char score='A';
		char right='(';
		char left=')';
		char dash='-';
		char colon=':';
		boolean bool1;
		bool1=true;
		double heightt=178.3;
		
		String info1= pnum+" "+colon+" "+i1;
		String info2= namee+" "+colon+" "+name;
		String info3= num+" "+colon+" "+i2+" "+dash+" "+i3;
		String info4= sex+" "+colon+" "+gender;
		String info5= marriged+" "+colon+" "+i4;
		String info6= smoke+" "+colon+" "+bool1;
		String info7= height+" "+colon+" "+heightt;
		String info8= scores+" "+colon+" "+score;
		String info9= face+" "+colon+" "+faces+right+facess+left;
		System.out.println(info1);
		System.out.println(info2);
		System.out.println(info3);
		System.out.println(info4);
		System.out.println(info5);
		System.out.println(info6);
		System.out.println(info7);
		System.out.println(info8);
		System.out.println(info9);
		
		
		System.out.println("*************************");
		
		
		
	}

}
