
public class AcademyMemberMain {

	public static void main(String[] args) {
		AcademyStudent st1=new AcademyStudent(1, "ss", "aa");
		AcademyStudent st2=new AcademyStudent(2, "rr", "bb");
		
		AcademyTeacher gs1=new AcademyTeacher(3, "ww", "자바");
		AcademyTeacher gs2=new AcademyTeacher(4, "ee", "오피스");
		
		AcademyStaff sf1=new AcademyStaff(5, "Lee", "취업");
		AcademyStaff sf2=new AcademyStaff(6, "Loe", "영업");
		
		System.out.println();
		System.out.println("==Student==");
		st1.print();
		st2.print();
		
		System.out.println();
		System.out.println("==Teacher==");
		gs1.print();
		gs2.print();
		
		System.out.println();
		System.out.println("==Staff==");
		sf1.print();
		sf2.print();
		
	}

}
