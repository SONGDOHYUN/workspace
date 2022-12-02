
public class StudentScorePrint1 {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		
		int studentNum1, studentNum2;
		int kor1, eng1, math1, total1;
		int kor2, eng2, math2, total2;
		String studentName1, studentName2;
		double avg1, avg2;
		char grade1, grade2;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		
		studentNum1=1;
		studentName1="김경호";
		kor1=42;
		eng1=56;
		math1=78;
		
		studentNum2=2;
		studentName2="김경수";
		kor2=45;
		eng2=53;
		math2=76;
		
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
				
		if(kor1<0 || kor1>100) {
			System.out.println(kor1+"은 유효한 점수가 아니다.");
			return;
		}
		if(kor2<0 || kor2>100) {
			System.out.println(kor2+"은 유효한 점수가 아니다.");
			return;
		}
		if(eng1<0 || eng1>100) {
			System.out.println(eng1+"은 유효한 점수가 아니다.");
			return;
		}
		if(eng2<0 || eng2>100) {
			System.out.println(eng2+"은 유효한 점수가 아니다.");
			return;
		}
		if(math1<0 || math1>100) {
			System.out.println(math1+"은 유효한 점수가 아니다.");
			return;
		}
		if(math2<0 || math2>100) {
			System.out.println(math2+"은 유효한 점수가 아니다.");
			return;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		
		
		total1= kor1+ eng1+ math1;
		total2= kor2 +eng2 +math2;
		
		avg1 = (double)total1/3.0;
		avg2 = (double)total2/3.0;
		
		grade1 = 'F';
		
		if(avg1>=90) {
			grade1='A';
		} else if(avg1>=80) {
			grade1='B';
		} else if(avg1>=70) {
			grade1='C';
		} else if(avg1>=60) {
			grade1='D';
		} else {
			grade1='F';
		}
		
		grade2 = 'F';
		
		if(avg2>=90) {
			grade2='A';
		} else if(avg2>=80) {
			grade2='B';
		} else if(avg2>=70) {
			grade2='C';
		} else if(avg2>=60) {
			grade2='D';
		} else {
			grade2='F';
		}		
				
		System.out.println("----------------학생 성적 출력---------------");
		System.out.println("학번 "+"이름 "+ " 국어 "+"영어 "+"수학 "+"총점 "+"평균 "+"평점 "+"석차 ");
		System.out.printf("%d %5s %4d %4d %4d %3d %5.1f %3c %3d\n"
				,studentNum1, studentName1, kor1, eng1 ,math1 ,total1, avg1 ,grade1);
		System.out.printf("%d %5s %4d %4d %4d %3d %5.1f %3c %3d\n"
				,studentNum2, studentName2, kor2, eng2 ,math2 ,total2, avg2,grade2);
		System.out.println("----------------------------------------------");
		
		
		
		
		
		}
		
		
		
		
		
	}
}