package com.ssafy.algo;

import java.util.Scanner;

public class Digittest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		
		
		while(true) {
			int num = sc.nextInt();
			if(num == 0) break;
			
			arr[num/10]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(i + " : " + arr[i] + "개");
			}
		}
	}
}
