package chapter01;

import java.util.Arrays;

public class Ex39Array2DExample {

	public static void main(String[] args) {
		int[][] scores = { 
				{ 10, 20, 30 },
				{ 100, 200, 300 }
		};
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(Arrays.toString(scores[i]));
		}
		
		System.out.println("==================");
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + " ");
			}
			
			System.out.println("");
		}
		
		
	}

}
