
public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호(int), 이름(String), 국어, 영어, 수학, 총점, 평균(double), 평점(A,B,C)(char), 석차(int)
		 */
		
		int s1Num,s1Kor,s1Eng,s1Math,s1Total,s1Rank;
		int s2Num,s2Kor,s2Eng,s2Math,s2Total,s2Rank;
		String s1Name,s2Name;
		double s1Avg, s2Avg;
		char s1grade, s2grade;
		
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		
		s1Num=1;
		s1Name="김경호";
		s1Kor=42;
		s1Eng=56;
		s1Math=78;
		
		
		s2Num=2;
		s2Name="김경수";
		s2Kor=44;
		s2Eng=53;
		s2Math=48;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균 계산 후 대입 (평점은 F , 석차는 0을 대입)
		 */
		
		s1Total=s1Kor+ s1Eng+s1Math;
		s2Total=s2Kor+ s2Eng+s2Math;
		
		s1Avg=(double)s1Total/3;
		s2Avg=(double)s2Total/3;
		
		s1grade='F';
		s2grade='F';
		
		s1Rank=0;
		s2Rank=0;
				
		
		
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지 출력하세요(반올림)
 		- 석차,평점은 구하지마세요
 		
 		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  89   A    3  
		 2   김경수   45   53   76   334  78   A    2  
		-----------------------------------------------
		*/
		
		System.out.printf("--------------학생 성적출력-------------------\n");
		System.out.printf("학번  이름  국어 영어 수학 총점 평균 평점 석차\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf(" %d   %s  %d   %d   %d  %d  %.1f  %c    %d  \n",
				s1Num,s1Name,s1Kor,s1Eng,s1Math,s1Total,s1Avg,s1grade,s1Rank);
		System.out.printf(" %d   %s  %d   %d   %d  %d  %.1f  %c    %d  \n",
				s2Num,s2Name,s2Kor,s2Eng,s2Math,s2Total,s2Avg,s2grade,s2Rank);
		System.out.printf("\n-----------------------------------------------");	}



		
	}

