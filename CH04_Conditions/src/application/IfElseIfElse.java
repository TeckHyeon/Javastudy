package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("����� ������ ? ");
		int apples = scanner.nextInt();
		System.out.print("�ٳ����� ������ ? ");
		int bananas = scanner.nextInt();
		scanner.close();

		if (apples > bananas) {
			System.out.println("����� �ٳ������� ����");
		}

		else if (apples < bananas) {
			System.out.println("�ٳ����� ������� ����");
		} else {
			System.out.println("�ٳ����� ��� ������ ����");
		}

	}

}
