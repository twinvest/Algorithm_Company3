package day0207;

import java.util.Scanner;

public class 영식이와친구들 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfPeople = scan.nextInt();
		int limit = scan.nextInt();
		int jump = scan.nextInt();
		
		int[] Map = new int[numOfPeople];
		int ans = 0, cur = 0;
		boolean flag = true;
		
		while(flag)
		{
			++ans;
			++Map[cur%numOfPeople];
			//짝수
			if(Map[cur%numOfPeople] % 2 == 0)
				cur -= jump;
			//홀수
			else
				cur += jump;
			for(int a : Map)
			{
				if(a==limit)
				{
					flag = false;
					break;
				}
			}
		}
		System.out.println(ans-1);
	}
}
