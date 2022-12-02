
public class IfScorePrint {

	public static void main(String[] args) {
		/*
		 * 점수의 유효성 체크
		 */
		int kor = -90;

		if (kor >= 0 && kor < 100) {
			/*
			 * 학점 계산하기
			 */
			char rank = 'S';
			if (kor >= 90) {
				rank = 'A';
			} else if (kor >= 80) {
				rank = 'B';
			} else if (kor >= 70) {
				rank = 'C';
			} else if (kor >= 60) {
				rank = 'D';
			} else {
				rank = 'F';
			}

			System.out.printf("학점은 %c 입니다.", rank);
		} else {
			System.out.println(kor + "은 유효한 점수가 아닙니다.");
		}

	}

}
