package lang;

public class StringUseMain {

	public static void main(String[] args) {
		String str1="Have a nice day";
		String str2="오늘은 불금! String class를 공부해요";
		System.out.println("--length--");
		
		
		int length1=str1.length();
		int length2=str2.length();
		int length3="자바가 재밌다".length();
		String emptyStr="";
		//공백 넣으면 안됨
		
		int length4=emptyStr.length();
		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);
		System.out.println(length4);
		
		System.out.println("--null--");
		String id=null;
//		String id="";
		if(id==null || id.equals("")) {
			System.out.println("아이디를 입력해");
		}
		System.out.println();
		System.out.println("--subString--");
		System.out.println("Have a nice day".substring(7,15));
		System.out.println("오늘은 불금! String class를 공부해요".substring(0, 8));
		
		System.out.println();
		System.out.println("--charAt--");
		String userId="Eeeee";
		char firstChar=userId.charAt(0);
		System.out.println("아이디의 첫 글자는 영문 대(소)문자여야함: ");
		
		if((firstChar>='a'&& firstChar<='z')||(firstChar>='A' && firstChar<='Z')) {
			System.out.println(firstChar+" 는 아이디 첫글자로 유효합니다.");
		}else{
			System.out.println(firstChar+" 는 아이디 첫글자로 유효하지 않습니다.");
		}
		for(int i=0; i<userId.length();i++) {
			char tempChar=userId.charAt(i);
			System.out.println(tempChar+":"+(int)tempChar);
		}
		
		System.out.println("--split--");
		String cardNo="123-456";
		String[] cardNoArray=cardNo.split("-");
		for(String tempNo: cardNoArray) {
			System.out.println(tempNo);
		}
		
		System.out.println("--replace--");
		String str3="자바(은)는 객체지향언어이다. 자바 공부하세요.";
		String result3=str3.replace('자', '뭘');
		System.out.println(result3);
		System.out.println(str3.replace("자바", "파이썬"));
		System.out.println(str3);
		
		System.out.println();
		System.out.println("--toUpperCase,toLowerCase--");
		System.out.println("jAvA".toUpperCase());
		System.out.println("jAvA".toLowerCase());
		
		System.out.println();
		System.out.println("--startsWith,endsWith--");
		String name="송도현";
		if(name.startsWith("송")) {
			System.out.println("송씨인 사람: "+name);
			
		System.out.println();
		System.out.println("--친구들--");
		String[] names= {"정경호","김미숙","김은희"};
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("김")){
				System.out.println(names[i]);
				
		System.out.println("--endswith--");		
		String fileName="a.jpg";
		if(fileName.endsWith(".jpg") || fileName.endsWith(".gif")) {
			System.out.println("이미지 파일입니다: "+fileName);
		
			
		}
			
		System.out.println("--trim--");
		String id2="guar d";
		System.out.println(id2.length());
		System.out.println(id2.trim().length());
		String chatMessage="     ";
		if(chatMessage.trim().length()==0) {
			System.out.println("전송안함");
		}
		if(chatMessage.trim().equals("")) {
			System.out.println("전송");
		}
		
		
		}
		}
		
		/*
		 * Quiz->김씨를 새로운 배열에 담아보세요
		 */
		String[] kimArray=null; 
		
		
		
		
		
		
			
		}
		
		
		
		
	}

}
