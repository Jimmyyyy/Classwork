package introduction;

public class DataTypes {
	public static void main(String[] args) {
		double a = 5.0/2;
		System.out.println((double) 5/2);
		System.out.println(4.64-2.0);
		
		System.out.println();
		
		String ten = "10";
		
		String two = "2";
		
		if (ten.compareTo(two) > 0) {
			System.out.println("10 is greater than two");
		}
		
		else {
			System.out.println("10 is not greater than two");
		}
		
		String s = "Happy "+18+"th birthday!";
		System.out.println(s);
		
		String j = "Happy "+(54/3)+"th birthday!";
		System.out.println(j);
		
		int m = 22;
		int n = 7;
		System.out.println("m/n is "+(m/n));	
	}


}
