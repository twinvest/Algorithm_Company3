package day0205;

import java.util.Scanner;

public class 파스칼의삼각형 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			int N = scan.nextInt();
			System.out.println("#"+t);
			
			for(int i = 1; i<N; ++i)
			{
				for(int j = 1; j<=i; ++j)
				{
					System.out.println(j);
				}
			}
		}

	}

}
