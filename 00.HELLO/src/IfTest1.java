/*
제어문
   1. if 문
   
       -형식 : 
	      stmt0;
		  if(조건문 ){
		      //조건문 -->   논리형데이타가 반환되는 연산 혹은 논리형 변수(데이터)
			  stmt1;
		   }else{
		      stmt2;
		   }
		   stmt3;

		   조건데이타가 true인경우  stmt0-->stmt1-->stmt3;
		   조건데이타가 false인경우  stmt0-->stmt2-->stmt3;


 */

public class IfTest1 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		System.out.println("main block start");
		System.out.println("stmt1");
		boolean condition = true;

		if (condition) {
			/*
			 * condition 조건이 true일 때 실행되는 블록
			 */
			System.out.println("stmt2");
			System.out.println("stmt3");
			System.out.println("stmt4");

		}
		System.out.println("stmt5");
		if(condition) {
			//true일 때 실행되는 블록
			System.out.println("stmt6");
			System.out.println("stmt7");
		}else {
			//false일 때 실행되는 블록
			System.out.println("stmt8");
			System.out.println("stmt9");
			
		}
		System.out.println("stmt10");
		
		if(condition)
			System.out.println("stmt11");
		
		else
			System.out.println("stmt12");
			System.out.println("stmt13");
		
		System.out.println("main block end");
		/*
		 * return; 
		 * -return 문을 만나면 실행흐름을 호출한 곳으로 반환한다. 
		 * -return 문 생략가능하다. 
		 */
		return;
		// System.out.println("after return statement");

	}

}
