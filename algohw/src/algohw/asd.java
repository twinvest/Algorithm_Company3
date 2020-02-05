package algohw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class asd {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("./src/algohw/input.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			
			int a = sc.nextInt();
			
			int[] scores = new int[101];

			for (int m = 0; m < 101; m++) {
				a = sc.nextInt();
				scores[a]++;
			}

			int max = 0, max_idx = 0;
			
			for (int j = 0; j < 101; j++) {
				if(scores[j] >= max) {
					max = scores[j];
					max_idx = j;
				}
			}
			
			System.out.println("#" + (i+1) +" " + max_idx);


			
		}

	}
}
