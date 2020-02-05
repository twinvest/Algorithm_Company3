import java.util.Scanner;

import javax.tools.FileObject;

public class Gravity2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] input = new int[N];

		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}

		int[][] map = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = N; j > N - input[i]; j--) {
				map[j - 1][i] = 1;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j]);

			}
			System.out.println();
		}

		System.out.println("------------------------");
		
		int[][] map1 = new int[N][N];
		
		int[] count1 = new int[N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1) {
					count1[j]++;
					
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= count1[i]-1; j++) {
				map1[i][j] = 1;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		int[] count = new int[N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map1[i][j] == 1) {
					count[j]++;
					
				}
			}
		}
		
		/* count에는 잘 들어갔음
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}
		*/
		
		int[][] map2 = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = N; j > N - count[i]; j--) {
				map2[j - 1][i] = 1;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map2[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
