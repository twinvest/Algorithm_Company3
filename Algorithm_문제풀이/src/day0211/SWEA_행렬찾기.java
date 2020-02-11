package day0211;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SWEA_행렬찾기 {
	static class Pos implements Comparable<Pos>
	{
		int y;
		int x;
		Pos(int y, int x)
		{
			this.y = y;
			this.x = x;
		}
		@Override
		public int compareTo(Pos o) {
			
			if((this.x * this.y) > (o.x * o.y))
			{
				return 1;
			}
			else if((this.x * this.y) == (o.x * o.y))
			{
				if(this.y < o.y)
					return 1;
			}
			return -1;
		}
	}
	static boolean inside(int y, int x)
	{
		return (y>=0 && y <N) && (x>=0 && x<N); 
	}
	static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
	static boolean[][] visit;
	static int[][] map;
	static int N;
	static ArrayList<Pos> list;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			N = scan.nextInt();
			map = new int[N][N];
			
			for(int i=0; i<N; ++i)
				for(int j=0; j<N; ++j)
					map[i][j] = scan.nextInt();
			
			int count = 0;
			visit = new boolean[N][N];
			
			for(int i=0; i<N; ++i)
			{
				for(int j=0; j<N; ++j)
				{
					if(!visit[i][j] && map[i][j] != 0)
					{
						list = new ArrayList<>();
						list.add(new Pos(i,j));
						dfs(i,j);
						++count;
						for(int k = 0; k<list.size(); ++k)
						{
							System.out.println(list.get(k).y+","+list.get(k).x);
						}
						System.out.println("끝");
							
					}
				}
			}
			System.out.println("#"+t+" "+count);
		}
	}
	
	static void dfs(int y, int x)
	{
		visit[y][x] = true;
		for(int d=0; d<4; ++d)
		{
			int nexty = y + dir[d][0];
			int nextx = x + dir[d][1];
			if(!inside(nexty,nextx) || map[nexty][nextx] == 0 || visit[nexty][nextx]==true)
				continue;
			list.add(new Pos(nexty, nextx));
			dfs(nexty, nextx);
		}
	}
}
