
public class AcademyMemberTypeCastingMain {

	public static void main(String[] args) {
		/*
		 * public class AcademyStudent extends AcademyMember{} public class
		 * AcademyTeacher extends AcademyMember{} public class AcademyStaff extends
		 * AcademyMember{}
		 * 
		 * AcademyMember의 자식타입 객체(student, teacher, staff)들은 AcademyMember타입 변수에 대입가능
		 */
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "Android");
		AcademyMember m1 = st1;
		AcademyMember m2 = new AcademyStudent(2, "SIM", "JAVA");
		AcademyMember m3 = new AcademyStudent(3, "EIM", "OFFICE");
		AcademyMember m4 = new AcademyTeacher(4, "TIM", "보안");
		AcademyMember m5 = new AcademyTeacher(5, "YIM", "인공지능");
		AcademyMember m6 = new AcademyStaff(6, "AIM", "대리");
		AcademyMember m7 = new AcademyStaff(7, "GIM", "원장");

		// String ban=m1.getBan();AcademyMember에 정의되지 않아서 메소드 호출 불가능함

		System.out.println("--AcademyMember들 전체 출력--");
		m1.print();
		m2.print();
		m3.print();
		m4.print();
		m5.print();
		m6.print();
		m7.print();
	
	
	}

}
