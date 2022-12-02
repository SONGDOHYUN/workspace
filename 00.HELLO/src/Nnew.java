
public class Nnew {

	public static void main(String[] args) {
		//평점 계산
		
		int eng=70;
		char grade='*';
		if(eng>=90 && eng<=100) {
			
			grade='A';
		}else if(eng>=80 && eng<90){
			grade='B';
		}else if(eng>=70 && eng<80){
			grade='C';
		}else if(eng>=60 && eng<70){
			grade='D';
		}else {
			grade='F';
			
		}
		System.out.printf("학점 %c 두둥.\n",grade);
		
		char id='r';
		if((id>='a' && id<='z')||(id>='A' && id<='Z')) {
			System.out.printf("%c는 유효해.\n",id);
		}else {
			System.out.printf("%c는 유효하지 않을걸.\n",id);
			
		}
				
		int i=2;
		if(i%4==0 && i%3==0) {
			System.out.printf("%d는 3,4의 공배수일걸.\n", i);
		}else {
			System.out.printf("%d는 3,4의 공배수 아닐걸.\n", i);
			
		}
		
		int level=4;
		switch (level) {
		case 1:
			System.out.println("초급");
			break;
		case 2:
			System.out.println("중급");
			break;
		case 3:
			System.out.println("고급");
			break;

		default:
			System.out.println("분발해라");
			break;
		}
		
		int s=0;
		while(s<5) {
			int j=0;
			while(j<5) {
				System.out.print("★");				
				j++;
			}
			s++;
		}
		
		s=0;
		while(s<5) {
			int j=0;
			while(j<5) {
				if(s==j) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
				j++;
			}
			System.out.print("\n");
			s++;
		}
		
		
	}
}

