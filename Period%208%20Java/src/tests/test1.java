package tests;

import java.util.Scanner;

public class test1 {
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry() {
		return input.nextLine();
	}
	
	private static String username = "test_user";
	private static String password = "test";
	
	public static void main(String[] args) {
		if(correctUser()) {
			askPassword();
		}
		else {
			System.out.println("Unknown username. Please contact the system administrator.");
		}
	}
	public static void askPassword() {
		boolean inLoop = true;
		int triesRemaining = 3;
		while(inLoop) {
			System.out.println("Enter your password.");
			String entry = waitForEntry();
			if(entry.equals(password)) {
				System.out.println("ayy u did it");
				inLoop = false;
			} else {
				triesRemaining--;
				
				if(triesRemaining == 0) {
					System.out.println("invalid password");
					inLoop = false;
				} else {
					System.out.println("You have " + triesRemaining + " attempt.");
					
				}
			}
		}
	}
	
	public static boolean correctUser() {
		System.out.println("Enter a username");
		
		return waitForEntry().equals(username);
	}
	
/*	public static void main (String[] args) {
		System.out.println("Enter username");
		String username = input.nextLine();
		if (username.equals("jimmy")) {
			System.out.println("Enter your password"); 
			int attempts = 3;
			while (attempts > 0) {
				String password = input.nextLine();
				if (password.equals("test")) {
					System.out.println("ayy you did it");
					return;
				}
				else {
					attempts--;
					System.out.println("You have " + attempts + " attempts left");
				}		
			}
			System.out.println("password is invalid");
		}
		else {
			System.out.println("You entered wrong username, contact administrator");
		}
	} */
}