
public class OperatiorUnary {

	public static void main(String[] args) {
			int a=1;
			int b=2;
			
			int ar= -a;
			int br= +b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(ar);
			System.out.println(br);
					
			boolean isPlay=true;
			System.out.println(isPlay);
			isPlay= !isPlay;
			System.out.println(isPlay);
			
			int kor=90;
			boolean isValidScore= kor>=0 && kor<=100;
			System.out.println(isValidScore);
			boolean isInValidScore= !isValidScore;
			System.out.println(isInValidScore);
			
			System.out.println();
			
			
			/*
			 * 증가, 감소 연산자
			 * -항은 반드시 변수이여야 한다.
			 * -형태:++,--
			 * -항변수의 값을 정수 1만큼 증가 혹은 1감소 시킨다->항변수에 재대입
			 */
			
			int i=5;
		    int j=5;
		    ++i;// i=i+1;
		    --j;// j=j-1;
		    System.out.println(i);
		    System.out.println(j);
		    
		    i=5;
		    j=5;
		    i++;
		    j--;
			System.out.println(i);
			System.out.println(j);
			
		
	}

}
