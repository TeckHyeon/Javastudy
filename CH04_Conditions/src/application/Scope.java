package application;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		
		{
			int value = 0;
			System.out.println(value);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println(i);
		}
		
		String input = null;
		
		do {
			System.out.println("종료할려면 'quit'를 입력하세요");
			input = scanner.nextLine();
		} while(!input.equals("quit"));
		
		scanner.close();
	}
}
