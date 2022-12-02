
public class Product {
	private int no;
	private String name;
	public Product() {
		// TODO Auto-generated constructor stub
	
	
	
	}
	@Override
	public String toString() {
		return "Product [no=" + no + ", name=" + name + "]";
	}
	public Product(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
