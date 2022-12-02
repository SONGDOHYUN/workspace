
public class IfNested {

	public static void main(String[] args) {
		/*
		 * 평점계산(A,B,C,D,F)
		 */
		
		int kor=90;
		char rank='F';
		
		if(kor>=90 && kor<=100) {
			rank='A';
		}else {
			if(kor>=80 && kor<90) {
				rank='B';
			}else {
				if(kor>=70 && kor<80) {
					rank='C';
				}else {
					if(kor>=60 && kor<70) {
						rank='D';
					}else {
						rank='F';
					}
				}
			}
		}
		System.out.printf("1.학점은 %c 입니다.\n",rank);
		
		rank='F';
		if(kor>=90 && kor<=100) {
			rank='A';
		}else if(kor>=80 && kor<90){
			rank='B';
		}else if(kor>=70 && kor<80){
			rank='C';
		}else if(kor>=60 && kor<70){
			rank='D';
		}else {
			rank='F';
		}		
		System.out.printf("2.학점은 %c 입니다.\n",rank);
		
		
		
		
		
	}

}
