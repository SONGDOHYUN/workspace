public class AcademyStudent extends AcademyMember {
	
	public String ban;
	public AcademyStudent() {
	}
	public AcademyStudent(int no, String name, String ban) {
		this.no=no;
		this.name=name;
		this.ban=ban;
	}
	@Override
	public void print() {
		super.print();
		System.out.println(this.ban);
//		System.out.println(this.ban+"\t"+this.name+"\t"+this.ban);
	}
	
	
	
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
}
