package day03;

import java.util.Scanner;

import javax.tools.FileObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class 항공기지건설 {

	static int T;
	static int answer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setIn(new FileInputStream("res/항공기지건설.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int testcase = 0; testcase < T; testcase++) {
			int N = sc.nextInt();
			int k = sc.nextInt();
			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					int tmp = 0;
					
					for (int m = i; m < N; m++) {
						for (int n = j; n < N; n++) {
							int max = 0, min = Integer.MAX_VALUE;
							for (int a = i; a <= m; a++) {
								for (int b = j; b <= n; b++) {
									max = Math.max(max, map[a][b]);
									min = Math.min(min, map[a][b]);
								}
							}
							if (Math.abs(max) - Math.abs(min) <= k) {
								tmp = Math.max(tmp, Math.abs(m - i + 1) * Math.abs(n - j + 1));
							}
						}
					}
					answer = Math.max(tmp, answer);
				}

			}

			System.out.println("#" + testcase + " " + answer);

		}

	}

}
