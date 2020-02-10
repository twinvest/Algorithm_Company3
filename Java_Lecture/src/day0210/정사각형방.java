package day0210;

import java.util.Scanner;

public class 정사각형방 {
	static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
	static boolean inside(int y, int x)
	{
		return (y>=0 && y<N) && (x>=0 && x<N); 
	}
	
	static int dfs(int y, int x, int id, int depth)
	{
		for(int d=0; d<4; ++d)
		{
			int nexty = y+dir[d][1];
			int nextx = x+dir[d][0];
			if(!inside(nexty, nextx) || (map[nexty][nextx]-map[y][x]) !=1)
				continue;
			depth = dfs(nexty, nextx, map[nexty][nextx], depth+1);
		}
		return depth;
	}
	
	static int N;
	static int[][] map;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testcase= scan.nextInt();
		for(int t =1; t <= testcase; ++t)
		{			
			N = scan.nextInt();
			map = new int[N][N];
			int[][] visit = new int[N][N];
			for(int i = 0; i<N; ++i)
				for(int j = 0; j<N; ++j)
					map[i][j] = scan.nextInt();
			
			int ans = -987654321;
			int ans_id = 987654321; 
			for(int i = 0; i<N; ++i)
			{
				for(int j = 0; j<N; ++j)
				{
					int id = map[i][j]; 
					//dfs가 반환하는 값은 이동한거리
					int ret = dfs(i, j, id, 1);
					if(ans == ret)
					{
						ans = ret;
						if(id<ans_id)
							ans_id = id;
					}else if(ans < ret) {
						ans = ret;
						ans_id = id;
					}
				}
			}
			System.out.println("#"+t+" "+ans_id+" "+ans);
		}
	}
}