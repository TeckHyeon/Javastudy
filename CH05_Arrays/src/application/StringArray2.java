package application;

public class StringArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = null;
		text = new String("��ο�!");
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3];
		System.out.println();
		
		texts[0] = new String("����!");
		texts[1] = "�� ��?";
		texts[2] = "�� ����!";
		
		for(String word: texts) {
			System.out.println(word);
		}
	}

}
