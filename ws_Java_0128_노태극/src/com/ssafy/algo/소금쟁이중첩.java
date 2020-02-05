package com.ssafy.algo;

 

import java.util.Scanner;

 

public class 소금쟁이중첩 {

 

	public static void main(String[] args) {

 

		// TODO Auto-generated method stub

 

		Scanner sc = new Scanner(System.in);

 

		int T = sc.nextInt();

 

		

 

		for (int tc = 0; tc < T; tc++) {

 

			int N = sc.nextInt(); // 배열 크기

			int[][] pond = new int[N][N];

			

			int number = sc.nextInt(); // 소금쟁이 수

 

			int[] start_x = new int[number];

			int[] start_y = new int[number];

			int[] dir = new int[number];

			

			for (int i = 0; i < number; i++) {

				start_x[i] = sc.nextInt();

				start_y[i] = sc.nextInt();

				dir[i] = sc.nextInt();

			}

			

//			for (int i = 0; i < number; i++) {

//				pond[start_x[i]][start_y[i]] = 1;

//			}

//			

			

			// 상 하 좌 우

			// dir 이 1 : 상 / 2 : 하 / 3: 좌 / 4 : 우

			int[] dx = {-1,1,0,0};

			int[] dy = {0,0,-1,1};

			int survival = 0;

			

			for (int i = 0; i < number; i++) {

				

				int cur_x= start_x[i];

				int cur_y= start_y[i];

				boolean flag = true;

				for (int j = 3; j > 0; j--) {

					cur_x +=  j*dx[dir[i]-1];

					cur_y +=  j*dy[dir[i]-1];

					

					if(cur_x >=0 && cur_x < N && cur_y>=0 && cur_y < N) {

						if(pond[cur_x][cur_y] == 1) {

							flag = false;

							break;

						}

					} else {

						flag = false;

					}

					

				}

				if(flag == false) {

					

				}else {

					pond[cur_x][cur_y] = 1;

					survival++;

				}

				

				

				

			}

			

			System.out.println("#" + (tc+1) + " " + survival);

			

			

			

			

 

			

 

			

 

			

 

			

 

			

 

		}

 

		

 

		

 

		

 

		

 

		

 

		

 

		

 

		

 

	}

 

}