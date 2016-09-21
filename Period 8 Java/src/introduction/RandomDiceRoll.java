package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		int[] results = new int[6]; 
		double totalRolls = 10000;
		for (int index = 0; index < 10000; index++) {
			int result = rollFairDie();
			System.out.println("roll # " + (index+1) + " : " + result);
			results[result-1]++; 
		}
		
		//print the results
		for(int i = 0; i < 6; i++) {
			double percentage = (int) (1000* (double) (results[i]/totalRolls)) / 10.0;
			System.out.println((i+1) + " appeared " + percentage + "% of the time.");
		}
		
	}
	//return 1,2,3,4,5,6, with equal probability
	public static int rollFairDie() {
		double rand = Math.random();//returns a double between 0 and 1 exclusive.
		//(between 0 and 1)
		int roll = (int) (6*rand);//from 0 to 5 inclusive
		roll ++;//1 to 6
		return roll;
	}
	
	
}
