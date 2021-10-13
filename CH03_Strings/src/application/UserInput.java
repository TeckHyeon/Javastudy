package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("온도를 입력해 주세요 : ");
		double celsius = scanner.nextDouble();
		double fahrenhit = (celsius * 9/5) + 32;
		
		System.out.println("섭씨"+celsius+"는 화씨 "+fahrenhit+"이다.");
	}
}
