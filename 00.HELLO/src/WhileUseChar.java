
public class WhileUseChar {

	public static void main(String[] args) {
		 /*
		  * 문자 출력
		  */
		
		char c1=0;
		while(c1<65535) {
			System.out.print(c1+" ");
			c1++;
			if(c1%100==0) {
				System.out.println();
			}
		}
		System.out.println();
		/*
		 * - 영문 소문자 출력
		 */
		char c2='a';
		while(c2<='z') {
			System.out.print(c2);
			System.out.print(",");
			c2++;
		}
		System.out.println();
		
		
		char c3='a';
		int lettercount=0;
		while(c3<='z') {
			System.out.print(c3);
			lettercount++;
			if(c3 !='z'&& lettercount%5!=0) {
				System.out.print(",");
			}
			if(lettercount%5==0) {
				System.out.println();
			}
			c3++;
		}
		System.out.println();
		char c4='A';
		while(c4<='Z') {
			System.out.print(c4+" ");
			if((c4-'A'+1)%5==0) {
				System.out.print("\n");
			}
			c4++;
		}
		
		char han='가';
		while(han<='힣') {
			System.out.print(han);
			if((han-'가'+1)%20==0) {
				System.out.print("\n");
			}
			han++;
		}
		
		
		
		
		
		
	}
		
		
}		
		
		
		
		
	


