package introduction;
import java.util.Random;
public class RandomDiceRollMe {
	public static void main(String[] args) {
		Random rand = new Random();
		int num;
		int lmao = 1;
		int b = 0;
		for (int a = 0; a < 10; a++) {
			while (b < 6) {
				
				b++;
				
			}
			num = 1 + rand.nextInt(lmao+b);
			System.out.println("roll # " + num);
			
		}
	}
}
