package day0205;

import java.util.Scanner;

public class 시각덧셈 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			int num4 = scan.nextInt();
			
			int ans1 = (num1 + num3)%12;
			int ans2 = (num2 + num4)%60;
			int mok = (num2 + num4)/60;
			
			if(ans1 == 0) ans1 = 12;
			if(mok>=1) ans1++;
			System.out.println("#"+t+" "+ans1+" "+ans2);
		}
	}
}
