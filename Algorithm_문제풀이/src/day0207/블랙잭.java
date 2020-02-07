package day0207;

import java.util.Arrays;
import java.util.Scanner;

public class 블랙잭 {
	
	static int[] arr;
	static int[] sel;
	static int N, Limit, ans = -987654321;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		arr = new int[N];
		sel = new int[3];
		Limit = scan.nextInt();
		for(int i=0; i<N; ++i)
			arr[i] = scan.nextInt();
		combination(0,0);
		System.out.println(ans);
	}
	
	static void combination(int idx, int sel_idx)
	{
		if(sel_idx == sel.length)
		{
			int sum = 0;
			for(int i =0; i<sel.length; ++i)
				sum += sel[i];
			
			if(sum <= Limit) ans = Math.max(ans, sum);
			return;
		}
		//더이상 고를게 없는것
		if( idx == arr.length )
			return;
		
		sel[sel_idx] = arr[idx];
		combination(idx+1, sel_idx+1);
		combination(idx+1, sel_idx);
	}

}
