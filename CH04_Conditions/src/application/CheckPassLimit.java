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
				System.out.println("���ӽ���");
				accessOK=true;
				break;
			} else {
				System.out.println("����� Ʋ�Ƚ��ϴ�.");
				count++;
			}

		}
//		
		scanner.close();
		
		if (!accessOK) {
			System.out.println("���Ӱź�");
			
		}
	}
}
//do {
////	
////	System.out.print("Enter password > ");
////	password = scanner.nextLine();
////} while(count++ < 2);