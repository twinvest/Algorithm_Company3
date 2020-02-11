package day0211;

import java.util.Scanner;

public class 정올1863_종교 {
	static boolean inside(int y, int x)
	{
		return (y>=0 && y <numOfstudent+1) && (x>=0 && x<numOfstudent+1); 
	}
	static int[][] map;
	static boolean[][] visit;
	static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
	static int numOfstudent;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		numOfstudent = scan.nextInt();
		int numOfpair = scan.nextInt();
		map = new int[numOfstudent+1][numOfstudent+1];
		visit = new boolean[numOfstudent+1][numOfstudent+1];
		
		for(int num=0; num<numOfpair; ++num)
		{
			int i = scan.nextInt();
			int j = scan.nextInt();
			map[i][j] = 1;
			map[j][i] = 1;
		}
		
		int count = 0;
		for(int i=1; i<=numOfstudent; ++i)
		{
			for(int j=1; j<=numOfstudent; ++j)
			{
				if(!visit[i][j] && map[i][j]==1)
				{
					dfs(i, j);
					++count;
				}
			}
		}
		if(numOfpair == 0 && numOfstudent == 1) 
			count = 1;
		System.out.println(count);
	}
	static void dfs(int y, int x)
	{
		visit[y][x] = true;
		visit[x][y] = true;
		for(int d=0; d<4; ++d)
		{
			int nexty = y + dir[d][0];
			int nextx = x + dir[d][1];
			if(!inside(nexty, nextx) || map[nexty][nextx] != 1 || visit[nexty][nextx] == true)
				continue;
			dfs(nexty, nextx);
		}
	}
}
