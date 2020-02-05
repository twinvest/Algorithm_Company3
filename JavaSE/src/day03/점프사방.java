package day03;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class 점프사방 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {
//			System.setIn(new FileInputStream("Solution32.txt"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {

			int Y = sc.nextInt();
			int X = sc.nextInt();
			int N = sc.nextInt();

			
			int[][] arr = new int[Y+1][X+1];

			// 숫자판 정보 입력
			for (int i = 0; i < Y; i++) {
				for (int j = 0; j < X; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 참가자 시작위치 행, 열 , 횟수
			int[] start_x = new int[N];
			int[] start_y = new int[N];
			int[] time = new int[N];

			for (int i = 0; i < N; i++) {
				start_x[i] = sc.nextInt();
				start_y[i] = sc.nextInt();
				time[i] = sc.nextInt();
			}

			// 함정수, 함정의 좌표
			int trap = sc.nextInt();
			int[] trap_x = new int[trap];
			int[] trap_y = new int[trap];

			for (int i = 0; i < trap; i++) {
				trap_x[i] = sc.nextInt();
				trap_y[i] = sc.nextInt();
			
			}
			
			
			int[] money = new int[N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < time[i]; j++) {
					
					System.out.println(start_x[j] + " : " +  start_y[j] + " : ");
					if(arr[start_x[j]][start_y[j]] / 10 == 1) {
						start_y[j] += arr[start_x[j]][start_y[j]] %10 ;
						if(start_y[j] > N) {
							break;
						}
					}else if(arr[start_x[j]][start_y[j]] / 10 == 3) {
						start_y[j] -= arr[start_x[j]][start_y[j]] %10 ;
						if(start_y[j] < 0) {
							break;
						}
					
					}else if(arr[start_x[j]][start_y[j]] / 10 == 2) {
						start_x[j] += arr[start_x[j]][start_y[j]] %10 ;
						if(start_x[j] > N) {
							break;
						}
					
					}else if(arr[start_x[j]][start_y[j]] / 10 == 4) {
						start_x[j] -= arr[start_x[j]][start_y[j]] %10 ;
						if(start_x[j] < 0) {
							break;
						}
			
					}
					
					
					if(start_x[j] == trap_x[j] && start_y[j] == trap_y[j]) {
						money[j] -= 1000;
						break;
					}
					
					
				}
				money[i] = arr[start_x[i]][start_y[i]] * 100;
			}

			int moneysum = 0;
			
			for (int i = 0; i < money.length; i++) {
				moneysum += money[i];
			}
			
			System.out.println(moneysum - 1000*N);
			

		}

	}

}
