package introduction;
import java.util.Random;

public class Junior extends Student {
	Random s = new Random();
	int num = 10 + s.nextInt(20);
	int age;
	
	public Junior(String name) {
		super(name);
		this.age = num;
	}
	
	public void talk() {
		super.talk();
		System.out.println("... and I am a junior and I am " + age);
	}
}
