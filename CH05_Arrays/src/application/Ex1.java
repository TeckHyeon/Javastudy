package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		final int NUM = 3;
		int[] numbers = new int[NUM];
		
		for(int i=0; i < NUM; i++) {
			System.out.print("숫자를 입력: ");
			numbers[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		int total = 0;
		for(int i=0; i<NUM; i++) {
			System.out.println(numbers[i]);
			total = total + numbers[i];
		}
		
		System.out.println("합계 : "+ total);
	}

}
