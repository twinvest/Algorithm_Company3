package day02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ArrayTest4 {
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		
			int [][] map = new int[10][10];
			Random r = new Random();
			int len = 3;
	
			int[] dr = {0,0,1,-1,1,-1,-1,1};
			int[] dc = {1,-1,0,0,1,1,-1,-1};
	
			int x = 0;
			int y = 0;
			int ans = 0;
			for(int k = 0; k < 3; k++) {
				x = r.nextInt(10);
				y = r.nextInt(10);
				System.out.println("x, y: " + x + " , " +  y);
	
				for (int i=0;i<8;i++){
				
					for(int j=1;j<=len;j++) {
						int nr = x + dr[i]*j;
						int nc = y + dc[i]*j;
				
						if(nr >= 0 && nr < 10 && nc>=0 && nc<10 ){
							map[nr][nc]++;
							ans = Math.max(ans, map[nr][nc]);
						}
					}
				}
			}
	
		
			System.out.println("ans = " + ans);
			for(int k=0 ;k<map.length;k++) {
				System.out.println(Arrays.toString(map[k]));
			}
		}
	}