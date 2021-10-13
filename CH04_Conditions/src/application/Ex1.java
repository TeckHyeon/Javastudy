package application;

import java.util.Scanner;

import javax.swing.Spring;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("====\n");
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕 ?'");
		System.out.println("3. 프로그램 종료");
		System.out.println("옵션을 선택 > ");
		int a = scanner.nextInt();
		scanner.close();
		switch (a) {
		case 1:
			System.out.println("헬로우");
			break;
		case 2:
			System.out.println("안녕 ?");
			break;
		case 3:
			System.out.println("프로그램을 종료합니다...");
			break;
		case 10000:
			System.out.println("이스터에그를 발견합니다.");
			break;
		default:
			System.out.println("잘못된 값을 입력하였습니다.");
			break;
		}
//		if (a==1) {
//			System.out.println("헬로우");
//		}
//
//		else if (a==2) {
//			System.out.println("안녕 ?");
//		} 
//		else if (a==3) {
//			System.out.println("프로그램을 종료합니다...");
//		}
//			else if (a==10000) {
//				System.out.println("이스터에그를 발견합니다.");
//			}
//			else {
//				System.out.println("잘못된 값을 입력하였습니다.");
//		}

	}
}
