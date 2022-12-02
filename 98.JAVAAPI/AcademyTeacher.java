public class AcademyTeacher extends AcademyMember {
	private String subject;
	public AcademyTeacher() {
		
		
	}
	public AcademyTeacher(int no, String name, String subject) {
		this.no=no;
		this.name=name;
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
