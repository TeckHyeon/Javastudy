package application;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String USER_PASSWORD = "hello";
		
		System.out.print("Enter password > ");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("접속 승인.");
		}
		else {
			System.out.println("접속 불가.");
		}
	}

}
