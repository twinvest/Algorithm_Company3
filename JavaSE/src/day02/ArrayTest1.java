package day02;

import java.util.Arrays;

public class ArrayTest1 {
	
	
	public static void main(String[] args) {
		int a = 1, b = 3, c = 5, d = 7;
		
		int[] arr = {1,3,5,7};
		memcpy(a,arr);
		System.out.println(a);
		System.out.println(arr[0]);
		
		int[] brr = arr;
		arr[1] = 13;
		System.out.println(brr[1]);
		
		int[] crr = new int[arr.length];

		for (int i = 0; i < crr.length; i++) {
			crr[i] = arr[i];
		}
		
		System.arraycopy(arr, 0, crr, 0, arr.length);
		System.out.println(Arrays.toString(crr));
		Arrays.sort(crr);
		System.out.println(Arrays.toString(crr));
	}
	
	static void memcpy(int ca, int[] cb){
		ca++;
		System.out.println(ca);
		
		cb[0]++;
		System.out.println(cb[0]);
		System.out.println("-------------");
	}
}
