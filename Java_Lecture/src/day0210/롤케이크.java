package day0210;

import java.util.Arrays;
import java.util.Scanner;

public class 롤케이크 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cakeLen = scan.nextInt();
		int[] arr = new int[cakeLen+1];
		int numOfperson = scan.nextInt();
		int[] ans = new int[numOfperson+1];
		int gap = -987654321;
		int expectans = -1;
		for(int i =1; i<=numOfperson; ++i)
		{
			int start = scan.nextInt();
			int end = scan.nextInt();
			if(gap < ((end-start)+1))
			{
				gap = (end -start) + 1;
				expectans = i;
			}
			for(int j = start; j<=end; j++)
				if(arr[j] == 0)
					arr[j] = i;
		}
		
		for(int i =1; i<=numOfperson; ++i)
			for(int j =0; j<arr.length; ++j)
				if(arr[j] == i)
					++ans[i];
		
		int max = -987654321;
		int realans = 0;
		for(int i = 1; i<=numOfperson; ++i)
		{			
			if(ans[i]>max)
			{
				max = ans[i];
				realans = i;
			}
		}
		System.out.println(expectans);
		System.out.println(realans);
	}
}
