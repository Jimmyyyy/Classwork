package tests;

import java.util.Scanner;

public class test1me {
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry() {
		return input.nextLine();
	}
	
	public static void main (String[] args) {
		System.out.println("Enter username");
		String username = input.nextLine();
		if (username.equals("test_user")) {
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
	}
}
