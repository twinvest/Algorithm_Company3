package day0205;

import java.util.Scanner;

public class 중간평균값구하기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			double sum = 0;
			double max = -987654321;
			double min = 987654321;
			double[] arr = new double[10];
			for(int i=0; i<arr.length; ++i)
				arr[i] = scan.nextDouble();
			
			for(int i=0; i<arr.length; ++i)
				if(max < arr[i])
					max = arr[i];
			
			for(int i=0; i<arr.length; ++i)
				if(min > arr[i])
					min = arr[i];
			
			for(int i=0; i<arr.length; ++i)
				if(arr[i] != max && arr[i] !=min)
					sum += arr[i];
			int avg = (int)Math.round(sum/8);
			System.out.println("#"+t+" "+avg);
		}	
	}
}
