package day0207;

import java.util.Scanner;

public class 배열전진 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] arr = new int[N][N];
		for(int i =0; i<N; ++i)
			for(int j=0; j<N; ++j)
				arr[i][j] = scan.nextInt();
		
		for(int k =0; k<5; ++k)
		{
			for(int i =N-1; i>=1; --i)
			{
				for(int j=0; j<N; ++j)
				{
					arr[i][j] = arr[i-1][j];
				}
				
				for(int j=0; j<N; ++j)
				{
					arr[i-1][j] = -1;
				}
			}
			
			System.out.println();
			System.out.println();
			for(int i =0; i<N; ++i)
			{
				for(int j=0; j<N; ++j)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		
		
		
	}

}
