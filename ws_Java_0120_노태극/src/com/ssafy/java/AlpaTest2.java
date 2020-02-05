package com.ssafy.java;

public class AlpaTest2 {
	public static void main(String[] args) {
		int line = 5;
		int alpa = 65;
		
		for(int i=1; i<= 5; i++) {
			for(int k=i+1; k<6;k++) {
				System.out.printf("   ");
			}
			for(int j=0; j<i; j++) {
				System.out.printf("%c  ",alpa++);
			} 
			System.out.println("");
			line--;
		}
	}
}
