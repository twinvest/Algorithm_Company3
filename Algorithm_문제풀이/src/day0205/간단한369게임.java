package day0205;

import java.util.Scanner;

public class 간단한369게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		for(int i = 1; i<=num; ++i)
		{
			String tmp = i+"";
			if(tmp.contains("3") || tmp.contains("6") || tmp.contains("9"))
			{
				for(int j=0; j<tmp.length(); ++j)
				{
					if(tmp.charAt(j) == '3')
					{
						++count;
						continue;
					}
						
					if(tmp.charAt(j) == '6')
					{
						++count;
						continue;
					}
						
					if(tmp.charAt(j) == '9')
					{
						++count;
						continue;
					}
				}
			}
			if(count != 0)
			{
				for(int j = 0; j<count; ++j)
					System.out.print("-");
				count = 0;
				System.out.print(" ");
				continue;
			}
			System.out.print(i);
			System.out.print(" ");
		}
	}
}
