
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 * 짝수 및 홀수 판별하기
		 */
		
		int num=23;
		switch (num%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
			
					
			
		}
		char direction='A';
		switch (direction) {
		case 'A':
			System.out.println("move left~");
			break;
		case 'a':
			System.out.println("move left~");
			break;
		case 'D':
			System.out.println("move right~");
			break;
		case 'W':
			System.out.println("move up~");
			break;
		case 'X':
			System.out.println("move down~");
			break;
		case 'S':
			System.out.println("move rotate~");
			break;

		default:
			System.out.println("don't move~");
			break;
		}
		/*
		 * Quiz: 대소문자 구분 없이 X,x 실행하도록?
		 */
		
		
		
		
		
	}

}
