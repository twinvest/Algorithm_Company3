package com.ssafy.java;
import java.util.Arrays;
import java.util.Scanner;



public class ArrayTest {

	public static int[] list = new int[10];
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<list.length;i++) {
			list[i] = sc.nextInt();
		}
		print();
		total();
		average();
		minmun();
	}
	
	
	static void print() {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
	
	static void total() {
		int sum = 0;
		for (int j = 0; j < list.length; j++) {
			sum += list[j];
		}
		System.out.println("배열의 합 : " + sum);
	}
	
	static void average() {
		int sum = 0;
		for (int j = 0; j < list.length; j++) {
			sum += list[j];
		}
		System.out.println("배열의 평균 : " + sum/10);
	}
	
	static void minmun() {
		int min = list [0];
		for (int j = 1; j < list.length; j++) {
			if(min > list[j])
			min = list[j];
		}
		System.out.println("배열의 최소값 : " + min);
	}
	
	
}
