/*
	for문
	     -형식:
	       	       
	       for(1;2;3){
	       	//1.반복변수(선언,초기화가능)
	       	//2.반복변수의 조건검사(논리형데이타)
	       	//3.반복변수증,감(++,--)
	       }
	       
	       ex>
	       for(int i=0;i<10;i++){
	       	 stmt1;
	       }
	       ex>무한루프
	       for(;;){
	       	
	       }
	
	*/
public class ForTest {

	public static void main(String[] args) {
		System.out.println("---while---");
		int k=0;// 1. 변수 선언 및 초기화 작업
		while(k<10) {// 2. 반복 변수 비교(반복 조건 기술)
			//3. 반복문 작성
			System.out.println("k="+k);
			k++;// 4. 반복 변수 증가 또는 감소
			
		}
		System.out.println("---for i 증가---");
		for(int i=0;i<10;i++) {
			System.out.println("i="+i);
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i="+i);
		}
		
		System.out.println("---for 감소---");
		for(int i=10;i>0;i--) {
			System.out.println("i="+i);
			
		}
		System.out.println("---홀수 출력[1-100]---");
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.print(i+" "); 
			}
		}
		System.out.println();
		System.out.println("---짝수 출력[1-100] continue---");
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				/*
				 * - 홀수 조건을 만족하면 continue 문이 시행된다.
				 * - 현재 실행중인 for 블록을 실행하지 않고 다음횟수의 블록을 시행한다. 
				 */
				continue;
				/*
				 * 1. continue문 이후의 for블록 코드를 실행하지 않는다.
				 * 2. 다음 반복을 계속[continue]실행한다.
				 * - 반복 블록에서만 사용 가능하다.
				 */
			}
			/*
			 * 짝수 출력
			 */
			
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("---4의 배수 출력[1-100]---");
		for(int i=1;i<=100;i++) {
			if(i%4==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("---3과 4의 공배수[1-100]---");
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("---3과 4의 최소공배수[1-100]---");
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%4==0) {
				System.out.print(i+" ");
				break;
				/*
				 * break문:
				 * - 반복문에서 사용가능하다.
				 * - break문 이후의 for블록코드를 실행하지 않는다.
				 * - 다음 반복문도 실행하지 않는다->반복 블록을 빠져나온다.
				 */
			}
		}
		System.out.println();
		System.out.println("---홀수 짝수의 합[1-100]---");
		
		int oddTot=0;
		int evenTot=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				//짝수 누적하기
				evenTot+=i;//evenTot=evenTot+i;
			}else {
				//홀수 누적하기
				oddTot+=i;
			}
		}
		System.out.println("짝수의 합:"+evenTot);
		System.out.println("홀수의 합:"+oddTot);
		System.out.println("---문자 출력---");
		
		for(char c='a';c<='z';c++) { 
				System.out.print(c);
				if(c=='z') 
					continue;
				
				System.out.print(",");
				/*
				 * 5개 문자 찍고 개행하기
				 */
				if((c-'a'+1)%5==0) {
					System.out.print("\n");
				}
				
		}
		System.out.println();
		
		
		
		
		
		
	}

}
