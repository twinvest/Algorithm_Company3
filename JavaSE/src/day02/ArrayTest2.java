package day02;

import java.util.Arrays;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,3,5},{11,13,15},{21,23,25}};
		int[][] brr = new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		for(int i=0; i<brr.length;i++) {
			System.arraycopy(arr[i], 0 , brr[i], 0 , arr[i].length);
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(Arrays.toString(brr[i]));
		}
		
	}
}
