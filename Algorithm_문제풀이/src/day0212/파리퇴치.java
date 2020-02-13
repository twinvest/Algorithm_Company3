package day0212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 파리퇴치 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=10; ++t)
		{
			ArrayList<Integer> list = new ArrayList<>();
			int RealSize = scan.nextInt();
			int StampSize = scan.nextInt();
			int[][] map = new int[RealSize][RealSize];
			
			for(int i =0; i<RealSize; ++i)
				for(int j =0; j<RealSize; ++j)
					map[i][j]=scan.nextInt();
			
			for(int i=0; i<=RealSize-StampSize; ++i)
			{				
				for(int j =0; j<=RealSize-StampSize; ++j)
				{
					int sum = 0;
					for(int y=i; y<StampSize+i; ++y)
					{
						for(int x=j; x<StampSize+j; ++x)
						{
							sum+=map[y][x];
						}
					}
					list.add(sum);
				}
			}
			Collections.sort(list);
			//System.out.println(list.get(list.size()-1));
			System.out.println("#"+t+" "+list.get(list.size()-1));
		}
	}
}