package com.ssafy.algo;

import java.util.Scanner;
import java.util.*;
import javax.tools.FileObject;

public class Solution13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		//상 하 좌 우 좌상 우상 우하 좌하
		
		int dr[] = {-1,1,0,0,-1,-1,1,1};
		int dc[] = {0,0,-1,1,-1,1,1,-1};
		
		for (int i = 0; i < T; i++) {
			
			int N = sc.nextInt();
			String[][] map = new String[N][N];

			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < N; j2++) {
					map[j][j2] = sc.next();
				}
			}

		
			int count = 0;
			int maxcount = 0;
			
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < N; j2++) {
					boolean flag = true;
					for (int k = 0; k < 8; k++) {
						int x = j + dr[k];
						int y = j2 + dc[k];
						
						if(x>=0 && x<N && y>=0 && y<N) {
							if(!map[x][y].equals("B")) {
								flag  = false;
								break;
							
							} 
						}
					}
					
					
					
					if(flag) {
						count = 0;
						for (int k = 0; k < N; k++) {
							if(map[j][k].equals("B")) {
								count++;
							}
							if(map[k][j2].equals("B")) {
								count++;
							}
						}
						
						count--;
					}
					
					maxcount = Math.max(maxcount, count);
				}
			}

			
			
			
			System.out.println("#" + (i+1) + " " + maxcount);
			
		}

	}

}
