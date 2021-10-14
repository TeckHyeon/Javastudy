package application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);
		
		String password = null;
		
		do {
			
			System.out.print("Enter password > ");
			password = scanner.nextLine();
			
		} while(!password.equals(USER_PASSWORD));
		
		scanner.close();
		
		System.out.println("Á¢¼Ó ½ÂÀÎ.");
	}

}
