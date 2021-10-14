package application;

public class LoopArray {

	public static void main(String[] args) {
		
		String[] animals = {"개","고양이","닭","사자","양","말"};
		
		for(int i=0; i<animals.length; i++)	{
			System.out.printf("인덱스 %d : %s\n", i,animals[i]);
		}
	}
}
