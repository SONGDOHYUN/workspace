
public class ForGugugan {

	public static void main(String[] args) {
		/*
		 * 구구단 출력하기
		 */
		int i=1;
		
		for(i=1; i<=9; i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d*%d =%-2d\t",j,i,i*j);
			}
			System.out.print("\n");
		}
		
	}

}
