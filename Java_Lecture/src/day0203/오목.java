package day0203;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class 오목 {
	static int[][] map;
	static int N = 20;
	static int[] dr = {0,1,1,1}; 
	static int[] dc = {1,1,0,-1};
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("res/Test5.txt"));
		Scanner sc = new Scanner(System.in);
		
		map = new int[N][N];
		for(int r=1; r<N; ++r)
		{			
			for(int c=1; c<N; ++c)
			{
				map[r][c] = sc.nextInt();
			}
		}
		
		boolean flag = false;
		for(int r=1; r<N; ++r)
		{
			for(int c=1; c<N; ++c)
				if(map[r][c]==1 || map[r][c]==2)
				{
					for(int k=0; k<4; ++k)
					{
						int nr = r+dr[k];
						int nc = r+dc[k];
						int cnt = 1;
						while(check(nr,nc) && map[nr][nc] == map[r][c])
						{
							nr = nr +dr[k];
							nc = nc +dc[k];
							cnt++;
						}
						if(cnt == 5) 
						{
							int bCnt = 0;
							nr = nr +(dr[k]*-1);
							nc = nc +(dc[k]*-1);
							while(check(nr,nc) && map[nr][nc] == map[r][c])
							{
								nr = nr+(dr[k] * -1);
								nc = nc+(dc[k] * -1);
								bCnt++;
							}
							if(bCnt > 5) continue;
							System.out.println(map[r][c]);
							System.out.println(r+" "+c);
							flag=true;
						}
					}
				}
		}
		if(!flag) System.out.println(0);
	}
	
	static boolean check(int nr, int nc)
	{
		return (nr>=0 && nr<N) && (nc>=0 && nc<N);
	}

}
