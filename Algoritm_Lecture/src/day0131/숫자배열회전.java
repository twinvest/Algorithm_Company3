package day0131;

import java.util.Scanner;

public class 숫자배열회전 {
	
	static int size;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; t++)
		{
			size = scan.nextInt();
			int[][] arr = new int [size][size];
			int[][] copy = new int [size][size];
			
			for(int i = 0; i<size; ++i)
			{
				for(int j=0; j<size; ++j)
				{
					arr[i][j] = scan.nextInt();
				}
			}
			
			for(int i=0; i<size; ++i)
			{
				for(int j= 0; j<size; ++j)
				{
					copy[j][(size - 1) - i] = arr[i][j];
				}
			}
			
			for(int i = 0; i<size; ++i)
			{
				for(int j=0; j<size; ++j)
				{
					System.out.print(copy[i][j]);
				}
				System.out.println();
			}
		}
	}
}
