/*
 배열:  
      - 같은 데이타형을 가진 멤버필드(기억장소) 여러개의 모음 
      - 배열타입 변수의 선언형식
           데이타타입[] 이름; int[] ia;, char[] ca; 
	  - 사용: 
	       1.배열타입 객체의 생성	
		   2.배열객체 멤버필드의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은 타입만 정의가 가능하다 
		  3.길이가 고정되어있다. 
		 
 */

public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		int intType;
		intType=90;
		
		
		int[] intArray;
		intArray=new int[5];
		System.out.println("int 배열 객체의 주소값:"+intArray);
		intArray[0]=90;
		intArray[1]=80;
		intArray[2]=70;
		intArray[3]=60;
		intArray[4]=50;
		
		System.out.println("---for 문---");
		for(int i=0; i<5;i++) {
			System.out.println("intArray[i]->"+intArray[i]);
		}	
		/*
		 * 모든 배열객체는 public int length;를 멤버변수로 가진다.	
		 */
		System.out.println("배열객체의 멤버필드개수:"+intArray.length);	
		for(int i=0; i<intArray.length;i++) {
			System.out.println("intArray[i]->"+intArray[i]);
		}
		
		System.out.println("--기본형 1차원[]배열--");
		int[] korArray=new int[10];
		korArray[0]=80;
		korArray[1]=81;
		korArray[2]=82;
		korArray[3]=83;
		korArray[4]=84;
		korArray[5]=85;
		korArray[6]=86;
		korArray[7]=87;
		korArray[8]=88;
		korArray[9]=89;
		
		int korTot=0;
		for (int i = 0; i < korArray.length; i++) {
			korTot+=korArray[i];
			
		}
		System.out.println("국어점수 총합:"+korTot);
		double korAvg=(double)korTot/korArray.length;
		System.out.println("국어점수 평균:"+korAvg);
		
		System.out.println("==char[] 배열===");
		char[] ca=new char[5];
		ca[0]='q';
		ca[1]='w';
		ca[2]='e';
		ca[3]='r';
		ca[4]='t';
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]+" ");
		}
		System.out.println();
		System.out.println("===boolean[]배열===");
		boolean[] ba=new boolean[5];
		ba[0]=true;
		ba[1]=true;
		ba[2]=false;
		ba[3]=true;
		ba[4]=false;
		
		int trueCount=0;
		for (int i = 0; i < ba.length; i++) {
			if(ba[i]) {
				trueCount++;
			}
		}
		System.out.println("true count: "+ trueCount);
		
		System.out.println("===String[]===");
		String[]strArray=new String[5];
		strArray[0]="가";
		strArray[1]="나";
		strArray[2]="다";
		strArray[3]="라";
		strArray[4]="마";
			
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
			
		}
		
		
		
		
		
		
		
		
		
		}
		
		
		}
		
		

