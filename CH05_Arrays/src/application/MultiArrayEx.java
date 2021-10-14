package application;

public class MultiArrayEx {

	public static void main(String[] args) {
		int total = 0;
		int[][] values = {
				{1,5,7},
				{9,6,3},
				{2,4,6},
				{1,2,3,4,5}
		};
		for (int i=0; i < values.length; i++) {
			int[] innerArray = values[i];
	
			for (int j=0; j < innerArray.length; j++) {
				total += values[i][j];
			}
		}
			System.out.println("ÃÑÇÕÀº : "+total);
	}
}
