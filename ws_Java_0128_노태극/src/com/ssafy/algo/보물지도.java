package com.ssafy.algo;

import java.util.Scanner;

public class 보물지도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int tc = 0; tc < T; tc++) {
			
			// 배열크기, 현위치, 함정의 수
			int N = sc.nextInt();
			int start_x = sc.nextInt();
			int start_y = sc.nextInt();
			int P = sc.nextInt();
			
			int[][] arr = new int[N][N];
			int[] trap_x = new int[P];
			int[] trap_y = new int[P];
			
			// 함정의 좌표
			for (int i = 0; i < P; i++) {
				trap_x[i] = sc.nextInt();
				trap_y[i] = sc.nextInt();
			}
			
			// 방향 입력
			int D = sc.nextInt();
			int[] dir = new int[D];
			int[] cansu = new int[D];
			
			// 방향 , 칸수
			for (int i = 0; i < D; i++) {
				dir[i] = sc.nextInt();
				cansu[i]= sc.nextInt();
			}
			
			
			int cur_x = 0;
			int cur_y = 0;
			
			for (int i = 0; i < D; i++) {
				if(dir[i] == 1) {
					start_x = start_x - cansu[i] ;
				}
				if(dir[i] == 2) {
					start_x = start_x - cansu[i] ;
					start_y = start_y + cansu[i] ;
				}
				if(dir[i] == 3) {
					start_y = start_y + cansu[i] ;
				}
				if(dir[i] == 4) {
					start_x = start_x + cansu[i] ;
					start_y = start_y + cansu[i] ;
				}
				if(dir[i] == 5) {
					start_x = start_x + cansu[i] ;
				}
				if(dir[i] == 6) {
					start_x = start_x + cansu[i] ;
					start_y = start_y - cansu[i] ;
				}
				if(dir[i] == 7) {
					start_y = start_y - cansu[i] ;
				}
				if(dir[i] == 8) {
					start_x = start_x - cansu[i] ;
					start_y = start_y - cansu[i] ;
				}
				
				if(start_x > N || start_y > N || start_x < 0 || start_y < 0) {
					start_x = 0;
					start_y = 0;
				}
				
				
			}
			
			System.out.println("#" + (tc+1) + " " + start_x + "  " + start_y);
		}
	}

}
