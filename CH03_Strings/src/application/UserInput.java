package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�µ��� �Է��� �ּ��� : ");
		double celsius = scanner.nextDouble();
		double fahrenhit = (celsius * 9/5) + 32;
		
		System.out.println("����"+celsius+"�� ȭ�� "+fahrenhit+"�̴�.");
	}
}
