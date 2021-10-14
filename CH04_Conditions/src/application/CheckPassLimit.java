package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {

		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);

		boolean accessOK = false;

		String password = null;
		int count = 0;

		while (count < 3) {
			System.out.println("Enter password > ");
			password = scanner.nextLine();
		
			if (password.equals(USER_PASSWORD)) {
				System.out.println("접속승인");
				accessOK=true;
				break;
			} else {
				System.out.println("비번이 틀렸습니다.");
				count++;
			}

		}
//		
		scanner.close();
		
		if (!accessOK) {
			System.out.println("접속거부");
			
		}
	}
}
//do {
////	
////	System.out.print("Enter password > ");
////	password = scanner.nextLine();
////} while(count++ < 2);