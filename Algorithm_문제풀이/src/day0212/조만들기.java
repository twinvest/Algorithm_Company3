package day0212;
import java.util.Scanner;
public class 조만들기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for (int t = 1; t <= testcase; ++t) {
			int N = scan.nextInt();
			int K = scan.nextInt();
			int[][] arr = new int[K][N];

			boolean flag = false;
			int d = 1;
			for (int j = 0; j < N; ++j) 
			{
				if(d % K == 1)
					if(flag)flag = false;
					else flag = true;
				if (flag) 
					for (int i = 0; i < K; ++i) 
						arr[i][j] = d++;
				else 
					for (int i = K - 1; i >= 0; --i) 
						arr[i][j] = d++;
			}
			System.out.print("#"+t+" ");
			for(int i =0; i<K; ++i)
			{
				int sum = 0;
				for(int j=0; j<N; ++j)
					sum += arr[i][j];
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}