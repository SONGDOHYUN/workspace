
public class Example {

	public static void main(String[] args) {

		int score1 = 90;
		int score2 = 80;

		System.out.println("score1: " + score1);
		System.out.println("score2: " + score2);

		int temp = score1;
		score1 = score2;
		score2 = temp;
		System.out.println("score1: " + score1);

		System.out.println("==연습==");
		DuoMember m1 = new DuoMember(1, "김");
		DuoMember m2 = new DuoMember(2, "박");
		DuoMember m3 = m1;

		DuoMember temp1 = m1;
		m1 = m2;
		m2 = temp1;
		System.out.println("m2값 " + m2);
		System.out.println("m3의 주소값: " + m3);

		DuoMember m4 = null;
		if (m4 == null) {
			m4 = new DuoMember(1111, "기기");
			m4.print();
		}
		m4.print();

		if (m1 == m3) {
			System.out.println(m1 + "\t" + m3);
		}
		if (m1 != m3) {

		}
		System.out.println(m1 + "\t" + m3);

		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("1~" + "중 3의 배수의 총합은 " + sum);

		for (int x = 1; x <= 10; x++) {
			
			for (int y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println("방정식의 해는=> " + "(" + x + "," + y + ")");
				}
			}
		}

//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				if(i<j) {
//					System.out.print(" ");
//				}else if(i) {
//					
//				})
//				System.out.print("*");
//			}
//			System.out.println();

//		for(int i1=1;i1<5;i++) {
//			for(int i2=1;i2<5;i2++) {
//				if() {
//					
//				}
//			}
//		

	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
		 System.out.print("*");
			}System.out.println();
			
	}
		
	System.out.println();
	
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			if(i>=j) {
				System.out.print("*");//i>=j일 때만 별 찍고
			}System.out.print("");//i<j일때는 공백 찍고
		}System.out.println();//한타임 돌고 개행
	}	
	
		System.out.println();
		
	for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			if((i+j)<=2) {
				System.out.print(" ");//0.0/0.1/0.2/1.0/1.1/2.0->합이 2임
			}else if((i+j)>=3) {
				System.out.print("*");//합이 3 이상이면 별 채우기
			}	
		}System.out.println();//한번 다 돌면 한 줄 띄우기
	}
	
		
		
		/*
		 * 트리....
		----*----(0.4)
		---***---(1.3)(1.4)(1.5)
		--*****--(2.2)(2.3)(2.4)(2.5)(2.6)
		-*******-(3.1)~(3.7)
		*********(4.0)~(4.8)
		->한줄에 9자리...0부터 생각
		->
		 */
		System.out.println();
		
	  for(int i=0; i<5 ;i++) {
		  for(int j=0;j<9;j++) {
			  if((i+j)>=4) {
				  System.out.print("*");
			  }else if((i+j)<4 ) {
				  System.out.print("-");
			  }
		  }System.out.println();
				  
	  }
	  //->뒤에 어떻게 지우지...
//	  ->(j-i)<=-4~4...?->5..?
	
	
	System.out.println();
	
	  for(int i=0; i<5 ;i++) {
		  for(int j=0;j<9;j++) {
			  if((i+j)>=4 && (j-i)<=4) {
				  System.out.print("*");
			  }else System.out.print("-");
		  }System.out.println();
			  }
				  
	  }
	
		
		
		
		
	}	
	
	
	
