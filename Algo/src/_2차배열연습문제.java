import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _2차배열연습문제 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] map = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				map[i][j] = (int)(Math.random()*10);
			}
		}
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		int x=1;
		int y = 1;
		
		int[] sum = new int[9];
		
		if( x!=0 && y!=0 && x!=4 && y!=4 ) {
			for (int i = 0; i < 9; i++) {
				sum[i] =(int)(Math.abs(map[x][y] - map[x-1][y]) + Math.abs(map[x][y] - map[x+1][y]) + 
						Math.abs(map[x][y] - map[x][y-1])+Math.abs(map[x][y] - map[x][y+1]));
			}
				
				
		}
		
		int realsum = 0;
		for (int i = 0; i < sum.length; i++) {
			realsum += sum[i];
		}
		
		
		
		
		System.out.println(realsum);
		
		
		
	}
}
