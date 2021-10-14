package application;

public class StringArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = null;
		text = new String("Çï·Î¿ì!");
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3];
		System.out.println();
		
		texts[0] = new String("ÇÏÀÌ!");
		texts[1] = "¾È ³ç?";
		texts[2] = "±Â ¹ÙÀÌ!";
		
		for(String word: texts) {
			System.out.println(word);
		}
	}

}
