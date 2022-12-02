public class AcademyTeacher extends AcademyMember {
	public String subject;
	public AcademyTeacher() {
		super();
		
	}
	public AcademyTeacher(int no, String name, String subject) {
		super(no,name);
		this.subject=subject;
		
	}
		
	@Override
	public void print() {
			super.print();
			System.out.println(this.subject);
		}
		
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
