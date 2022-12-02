
public class IfUse {

	public static void main(String[] args) {
		/*
		 * 짝수, 홀수 판별
		 */
		int no1=51;
		
		if(no1%2==0) {
			System.out.printf("%d 은 %s 입니다.\n",no1,"짝수");
		}else {
			System.out.printf("%d 은 %s 입니다.\n",no1,"홀수");
			
		}
		/*
		 * 4의 배수 판별
		 */
		int no2=4000;
		if(no2%4==0) {
			System.out.printf("%d는 4의 배수입니다.\n",no2);
		}else {
			System.out.printf("%d는 4의 배수가 아닙니다.\n",no2);
			
		}
		/*
		 * 점수의 유효성 체크
		 */
		int kor=-90;
		if(kor>=0 && kor<=100) {
			System.out.printf("%d는 유효한 점수입니다.\n",kor);
		}else {
			System.out.printf("%d는 유효한 점수가 아닙니다.\n",kor);
		}
		/*
		 * 윤년 여부 확인
		 */
		int year=2022;
		String msg="";
		if((year%4==0 && year%100!=0)|| year%400==0) {
			msg="윤년";
		}else {
			msg="평년";
			
		}
		System.out.printf("%d는 %s 입니다.\n",year,msg);
		/*
		 * 공배수
		 */
		int no3=45;
		if(no3%3==0 && no3%4==0) {
			System.out.printf("%10d는 3과 4의\t공배수 입니다.\n",no3);
		}else {
			System.out.printf("%10d는 3과 4의\t공배수가 아닙니다.\n",no3);
			
		}
		/*
		 * 문자판단
		 */
		char c='X';
		
		if(c>='A' && c<='Z') {
			System.out.printf("%c는 알파벳 대문자입니다.\n",c);
		}else {
			System.out.printf("%c는 알파벳 대문자가 아닙니다.\n",c);
			
		}
		c='9';
		if(c>='0' && c<='9') {
			System.out.printf("%c는 숫자형태의 문자입니다.\n",c);
		}else {
			System.out.printf("%c는 숫자형태의 문자가 아닙니다.\n",c);
			
		}
		/*
		 * Quiz->다음문자는 아이디의 첫글자
		 	->첫글자가 유효한지 확인,아이디 첫글자는 대문자나 소문자이다 
		 */
		char id='*';
		
		if((id>='A' && id<='Z')||(id>='a' && id<='z')) {
			System.out.printf("%c는 유효합니다.\n",id);
		}else {
			System.out.printf("%c는 유효하지 않습니다.\n",id);
				
			}
		
		
		
		
		
		
		
	}

}
