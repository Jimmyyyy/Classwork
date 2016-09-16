package introduction;

public class Senior extends Student {
	String lmao;
	
	public Senior(String name) {
		super(name); /* constructs a Student first - has to happen first since a 
		Senior is a Student */
		this.lmao = "Ayyyyyy";
		}
	public void talk() {
		super.talk();
		System.out.println("... and I am a senior " + lmao);
		
	}
}
