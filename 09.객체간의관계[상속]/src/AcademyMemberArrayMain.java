
public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students=new AcademyStudent[3];
		AcademyTeacher[] Teach=new AcademyTeacher[2];
		AcademyStaff[] staffs=new AcademyStaff[2];
		
		students[0]=new AcademyStudent(1, "KIM", "JAVA");
		students[1]=new AcademyStudent(2, "SIM", "JA");
		students[2]=new AcademyStudent(3, "RIM", "VA");
		
		Teach[0]=new AcademyTeacher(3, "김강사", "디자이너");
		Teach[1]=new AcademyTeacher(4, "이강사", "개발자");
		
		staffs[0]=new AcademyStaff(5, "송", "홍보");
		staffs[1]=new AcademyStaff(6, "도", "영업");
		
		System.out.println("--Academy 전체출력--");
		System.out.println("--Student--");
		for(int i=0;i<students.length;i++) {
			students[i].studentPrint();
		}
		
		System.out.println("--Teacher--");
		for(AcademyTeacher teacher:Teach) {
			teacher.teacherPrint();
		}
		
		
		System.out.println("--Staff--");
		for(AcademyStaff staff:staffs) {
			staff.staffPrint();
		}
		
		
		
		
	}

}
