package application;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] animals = {"°í¾çÀÌ", "°³", "Æë±Ï", "»çÀÚ"};
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		
		animals[0] = "´ß";
		
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
	}

}
