package application;

public class App {

	public static void main(String[] args) {
		// String 문자열은 기본자료타입 아니라 클래스 타입이다.
		int cats = 7;
		double height = 1.8;
		String name = "홍길동";
		
		System.out.println("내 이름은 " + name);
		String text = "나의 이름은: ";
		String endOfSentence = ".";
		
		System.out.println(text + name + endOfSentence);
	}

}
