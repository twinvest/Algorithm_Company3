package day0212;

import java.util.Arrays;
import java.util.Scanner;

public class 진기의최고급붕어빵 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			int N, M, K;
			N = scan.nextInt();
			M = scan.nextInt();
			K = scan.nextInt();
			
			int[] person = new int[N];
			int[] bread = new int[11111];
			
			for(int i = 0; i<N; ++i)
				person[i] = scan.nextInt();
			Arrays.sort(person);
			
			int count = 1;
			int cur = 0;
			
			//몇초에 붕어빵을 얼마나 만들 수 있는지 구해놓음.
			bread[0] = 0;
			for(int i = 1; i<bread.length; ++i)
			{
				if(i%M==0)
				{
					bread[i] = K * count;
					cur = K * count;
					count++;
					continue;
				}
				bread[i] = cur;
			}
			
			boolean flag = true;
			for(int i=0; i<N; ++i)
			{
				if(bread[person[i]] > 0)
				{
					flag = true;
					for(int j = person[i]; j<bread.length; ++j)
						--bread[j];
				}
				else {
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("#"+t+" "+"Possible");
			else
				System.out.println("#"+t+" "+"Impossible");
		}
	}
}