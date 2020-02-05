package day02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ArrayTest3 {
	/*
	 2차원 배열의 갯수와 좌표를 입력받아서 해당 좌표의 상하좌우에 1을 입력하고
	 배열을 출력하는 프로그램을 작성하세요
	 4 <= row && column <= 20
	 */
		/*
		public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("row와 column을 입력하세요 .");
		int row = sc.nextInt();
		int column = sc.nextInt();
		
		int[][] arr = new int[row][column];
		
		
		System.out.println("좌표를 입력하세요 ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>row || x>column || y>row || y>column) {
			System.out.println("ERROR");
		}
		
		*/
		
		
		/*
		arr[x-1][y] = 1;
		arr[x+1][y] = 1;
		arr[x][y+1] = 1;
		arr[x][y-1] = 1;
		*/
		
		/*
		if(x+1 >= column) {
			arr[x-1][y] = 1;
			
			arr[x][y+1] = 1;
			arr[x][y-1] = 1;
		} else if(x-1 <=0) {
			
			arr[x+1][y] = 1;
			arr[x][y+1] = 1;
			arr[x][y-1] = 1;
		} else if(y+1 >= row) {
			arr[x-1][y] = 1;
			arr[x+1][y] = 1;
			
			arr[x][y-1] = 1;
		} else if(y-1<=0) {
			arr[x-1][y] = 1;
			arr[x+1][y] = 1;
			arr[x][y+1] = 1;
			
		} else {
			arr[x-1][y] = 1;
			arr[x+1][y] = 1;
			arr[x][y+1] = 1;
			arr[x][y-1] = 1;
		} 
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	*/
		
	/*	
	Random r = new Random();
		static int N,M;
		static int[][] map;
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("N,M을 입력");
			N = sc.nextInt();
			M = sc.nextInt();
			
			map = new int[N][M];
			
			System.out.println("좌표를 입력");
			int r = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println("길이를 입력하세요 :");
			int len = sc.nextInt();
			
			int[] dr = {0,0,1,-1,1,-1,-1,1};
			int[] dc = {1,-1,0,0,1,1,-1,-1};
			
		
			
			for (int i=0;i<4;i++){
				for(int j=1;j<=len;j++) {
					int nr = r + dr[i]*j;
					int nc = c + dc[i]*j;
					
					if(nr >= 0 && nr < N && nc>=0 && nc<M )
					map[nr][nc] = 1;
					
				
				}
			}
			for(int k=0 ;k<map.length;k++) {
				System.out.println(Arrays.toString(map[k]));
			}
			
			
		}
		*/
	
	/*
	 10 * 10 배열에 길이가 3인 포를 3방으로 랜덤으로 쏩니다.
	 이포는 8방으로 길이만큼 ++증가하는데 가장 값이 큰 값을 출력하세요.
	 */
	

		static int N,M;
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int [][] map = new int[10][10];
			Random r = new Random();
			int len = 3;
		
			int[] dr = {0,0,1,-1,1,-1,-1,1};
			int[] dc = {1,-1,0,0,1,1,-1,-1};
		
			int x = 0;
			int y = 0;
			
			for(int k = 0; k < 3; k++) {
				x = r.nextInt(10);
				y = r.nextInt(10);
				System.out.println("x, y: " + x + y);
		
				for (int i=0;i<8;i++){
					
					for(int j=1;j<=len;j++) {
						int nr = x + dr[i]*j;
						int nc = y + dc[i]*j;
					
						if(nr >= 0 && nr < 10 && nc>=0 && nc<10 ){
							map[nr][nc]++;
						}
						
							
					
				
					}
				}
			}
		
			
			for(int k=0 ;k<map.length;k++) {
				System.out.println(Arrays.toString(map[k]));
			}
		
		
		}
}		
		
