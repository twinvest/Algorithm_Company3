package day0205;

import java.util.Arrays;
import java.util.Scanner;

public class 조교의성적매기기 {
	static String[] array =  {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+" };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			int num = scan.nextInt();
			double [] arr = new double[num];
			double[] arr2 = new double[num];
			int[] arr3 = new int[num];
			for(int i=0; i<num; ++i)
			{
				int a = scan.nextInt();
				int b = scan.nextInt();
				int c = scan.nextInt();
				double ans = Math.round((a*0.35) + (b*0.45) + (c*0.2));
				arr[i] = ans;
			}
			
			for(int i=0; i<arr.length; ++i)
				arr2[i] = arr[i];
			Arrays.sort(arr2);
			for(int i = 0; i<arr2.length; ++i)
			{
				for(int j = 0; j<arr2.length; ++j)
				{
					if(arr[i] == arr2[j])
					{
						arr2[j] = i;
						break;
					}
				}
			}
			
			for(int i=0; i<arr.length; ++i)
				arr3[i] = 1 + (int)arr2[i];	
			
			for(int i=0; i<arr.length; ++i)
			{
				for(int j=i; j<=N/; )
			}
			
			
			
			for(int i=0; i<arr.length; ++i)
				System.out.print(arr3[i]+" ");
			
		}
	}
}
