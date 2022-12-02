
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("--학생 10명 성적 데이터를 저장하기 위한 배열객체 생성 및 초기화--");
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] nameArray = { "KIM", "LEE", "PARK", "CHOI", "SIM", "KIM", "PIM", "MIN", "AIM", "LIM" };
		int[] korArray = { 12, 45, 70, 66, 98, 93, 80, 61, 72, 88 };
		int[] engArray = { 32, 46, 64, 96, 58, 98, 62, 81, 32, 99 };
		int[] mathArray = { 93, 89, 88, 46, 54, 23, 90, 85, 73, 34 };
		int[] totArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avgArray = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradeArray = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] rankArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		/*
		 * 총점, 평균, 평점 계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			totArray[i] = korArray[i] + engArray[i] + mathArray[i];
			avgArray[i] = totArray[i] / 3.0;

			if (avgArray[i] >= 90) {
				gradeArray[i] = 'A';
			} else if (avgArray[i] >= 80) {
				gradeArray[i] = 'B';
			} else if (avgArray[i] >= 70) {
				gradeArray[i] = 'C';
			} else if (avgArray[i] >= 60) {
				gradeArray[i] = 'D';
			} else {
				gradeArray[i] = 'F';
			}

		}
		/*
		 * 총점으로 석차 계산하기 1번학생(index->0)석차계산
		 */
//		for (int j = 0; j < totArray.length; j++) {
//			if(totArray[0]<totArray[j]) {
//				rankArray[0]++;
//			}
//		}

		// 석차내기
		for (int i = 0; i < rankArray.length; i++) {
			for (int j = 0; j < rankArray.length; j++) {
				if (totArray[i] < totArray[j]) {
					rankArray[i]++;
				}
			}
		}

		for (int i = 0; i < rankArray.length; i++) {
			for (int j = 0; j < rankArray.length; j++) {

				rankArray[i]++;
			}
		}

		System.out.println("==========?===========");

		for (int i = 0; i < noArray.length; i++) {
			if (noArray[i] == 5) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				break;
			}
		}

		for (int i = 0; i < korArray.length; i++) {
			if (korArray[i] < 80) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
//			break;
			}
		}

		/*
		 * 학생 검색(번호, 국, 영, 수, 학점 , 석차)
		 */
		/*
		 * 3번인 학생 1명 찾아서 1명의 정보 출력(학생정보는 중복 X)
		 */
		System.out.println("3번인 학생 1명 찾아서 1명의 정보 출력(학생정보는 중복 X)");
		for (int i = 0; i < noArray.length; i++) {
			if (noArray[i] == 3) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				break;
			}
		}
		/*
		 * 국어점수 80점인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println("국어점수 80점인 학생들");
		for (int i = 0; i < noArray.length; i++) {
			if (korArray[i] == 80) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		/*
		 * 영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력
		 */
//		System.out.println("영어점수 50점 이하인 학생들");
//		for (int i = 0; i < noArray.length; i++) {
//			if(engArray[i]<=50) {
//				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
//						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
//			}
//		}

		/*
		 * 수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println("수학점수 70점 이상인 학생들");
		for (int i = 0; i < noArray.length; i++) {
			if (mathArray[i] >= 70) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}

		/*
		 * 학점이 D학점이하인 학생모두찾아서 여러명 정보출력
		 */
		System.out.println("학점이 D학점이하인 학생");
		for (int i = 0; i < gradeArray.length; i++) {
			if (gradeArray[i] <= 'D') {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}

		/*
		 * 정렬 1.오름차순 ex> 1,2,3,4,5.... a,b,c,d,e....,가 ... 힣 2.내림차순 ex> 5,4,3,2,1
		 * z,y,x.... , 힣 ... 가
		 */

		/*
		 * 학생 총점순으로 오름차순
		 */
		System.out.println("===swap이란 무엇===");
		int a = 10;
		int b = 3;

		// swap a,b: 덮어씌우기
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("===swap===");
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a=" + a);
		System.out.println("b=" + b);

		// 1회
		for (int i = 0; i < noArray.length - 1; i++) {
			for (int j = 0; j < noArray.length - 1; j++) {
				if (totArray[j] > totArray[j + 1]) {
					// swap tot
					int tempTot = totArray[j];
					totArray[j] = totArray[j + 1];
					totArray[j + 1] = tempTot;
				}
				// 나머지 항목들도 다 바꿔줘야함...
			}
		}
		System.out.println("==swap 연습 2==");
		int d = 5;
		int g = 6;
		System.out.println("d=" + d);
		System.out.println("g=" + g);
		System.out.println("==swap하면==");
		int tempa = d;
		d = g;
		g = tempa;
		System.out.println("d=" + d);
		System.out.println("g=" + g);

		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}

	}

}