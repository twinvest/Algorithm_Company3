package day0211;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 안전영역 {
	static int N;
	static int[][] map;
	static boolean[][] visited;
	static int Ans;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		map = new int[N][N];
		//visited = new boolean[N][N];
		
		for(int i = 0; i<N; ++i)
		{
			for(int j =0; j<N; ++j)
			{
				map[i][j] = scan.nextInt();
			}
		}
		
		int level = 1;
		int cnt = 0;
		while(level<=100)
		{			
			cnt=0;
			visited = new boolean[N][N];
			for(int i = 0; i<N; ++i)
			{
				for(int j =0; j<N; ++j)
				{
					//비가오는양보다 큰 애들. 그러나 우리는 비가 오는 양을 모른다. 즉, 1부터 100까지 전부검색해야함. 그리고 방문하지 않은 색히여야함.
					if(map[i][j]>level && !visited[i][j])
					{
						//bfs(i,j,level);
						dfs(i,j,level);
						cnt++;
					}
				}
			}
			level++;
			Ans = Math.max(Ans, cnt);
		}	
		System.out.println(Ans);
	}
	static int [] dr = {1,-1,0,0};
	static int [] dc = {0,0,1,-1};
	
	private static void dfs(int r, int c, int level)
	{
		for(int k=0; k<4; ++k)
		{
			int nr = r+dr[k];
			int nc = c+dc[k];
			if((nr>=0&&nr<N) && (nc>=0&&nc<N) && !visited[nr][nc] && map[nr][nc] > level)
			{
				visited[nr][nc] = true;
				dfs(nr,nc,level);
			}
		}
	}
	
	private static void bfs(int r, int c, int level)
	{
		Queue<Area> q = new LinkedList<>();
		q.add(new Area(r,c));
		visited[r][c] = true;
		while(!q.isEmpty())
		{
			Area p = q.poll();
			for(int k=0; k<4; ++k)
			{
				int nr = p.r+dr[k];
				int nc = p.c+dc[k];
				if((nr>=0&&nr<N) && (nc>=0&&nc<N) && !visited[nr][nc] && map[nr][nc] > level)
				{
					visited[nr][nc] = true;
					q.add(new Area(nr, nc));
				}
			}
		}
		
	}
	static class Area{
		int r,c;
		Area(int r, int c)
		{
			this.r = r;
			this.c =c;
		}
	}
}