package application;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("����� ������ ? ");
		int apples = scanner.nextInt();
		System.out.print("�ٳ����� ������ ? ");
		int bananas = scanner.nextInt();
		
		if(apples > bananas) {
			System.out.println("����� �ٳ������� ����");
		}
		
		if(apples < bananas) {
			System.out.println("�ٳ����� ������� ����");
		}
		System.out.println("���α׷� ����.");
	}

}
