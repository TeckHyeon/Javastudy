package application;

import java.util.Scanner;

import javax.swing.Spring;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("�޴�");
		System.out.println("====\n");
		System.out.println("1. ����Ʈ '��ο�'");
		System.out.println("2. ����Ʈ '�ȳ� ?'");
		System.out.println("3. ���α׷� ����");
		System.out.println("�ɼ��� ���� > ");
		int a = scanner.nextInt();
		scanner.close();
		switch (a) {
		case 1:
			System.out.println("��ο�");
			break;
		case 2:
			System.out.println("�ȳ� ?");
			break;
		case 3:
			System.out.println("���α׷��� �����մϴ�...");
			break;
		case 10000:
			System.out.println("�̽��Ϳ��׸� �߰��մϴ�.");
			break;
		default:
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
			break;
		}
//		if (a==1) {
//			System.out.println("��ο�");
//		}
//
//		else if (a==2) {
//			System.out.println("�ȳ� ?");
//		} 
//		else if (a==3) {
//			System.out.println("���α׷��� �����մϴ�...");
//		}
//			else if (a==10000) {
//				System.out.println("�̽��Ϳ��׸� �߰��մϴ�.");
//			}
//			else {
//				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
//		}

	}
}
