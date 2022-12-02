public class Engine {
    private int cc;//엔진 배기량
    private String type;//엔진타입
    
    public Engine() {
		// TODO Auto-generated constructor stub
	}
	public Engine(int cc, String type) {
		this.cc = cc;
		this.type =type;
		
	public void print() {
		System.out.println(this.type+"\t"+this.cc);
	}
	
	
	
	public int getCc() {
		return cc;
	}
	public String getType() {
		return type;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public void setType(String type) {
		this.type = type;
	}
    

}
