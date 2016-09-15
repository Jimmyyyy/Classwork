package introduction;
import  java.util.Scanner;
public class ProceduralExample {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// System is a class
		// out is a field
		// println is a method of that field
		

		String[] names = {"Jimmy", "asds", "sda"};
		System.out.println("Ayyyy waddup my name is " + names[0]);

		String[] names2323 = {"jimmy" , "jisiuiasduio"};
		String[] years = {"senior", "freshman", "junior"};
		System.out.println(names[0] + " is not a " + years[2]);
		
		Scanner thing = new Scanner(System.in);
		
		String input = thing.next();
		
		System.out.println("ayyy ur name is" + input);
		
	}
}
