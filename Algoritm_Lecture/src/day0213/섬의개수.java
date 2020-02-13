package day0213;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Pos
{
	int y;
	int x;
	Pos(int y, int x)
	{
		this.y = y;
		this.x = x;
	}
}

public class 섬의개수 {
	static int[][] dir= {{0,1},{0,-1},{1,0},{-1,0},{-1,1},{1,1},{-1,-1},{1,-1}};
	static boolean inside(int y, int x)
	{
		return (y>=0 && y<H) && (x>=0 && x<W);
	}
	static boolean[][] visit;
	static int W;
	static int H;
	static int[][] map;
	static Queue<Pos> q;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true)
		{			
			W = scan.nextInt();
			H = scan.nextInt();
			q = new LinkedList<>();
			if(H==0 && W==0)
				break;
			map = new int[H][W];
			visit = new boolean[H][W];
			for(int i =0; i<H; ++i)
				for(int j=0; j<W; ++j)
					map[i][j] = scan.nextInt();
			
			int count = 0;
			for(int i =0; i<H; ++i)
			{			
				for(int j=0; j<W; ++j)
				{				
					if(!visit[i][j] && map[i][j]==1)
					{
						//dfs(i,j );
						q.add(new Pos(i, j));
						visit[i][j] = true;
						bfs(i, j);
						count++;
					}	
				}
			}
			System.out.println(count);
		}
	}
	static void bfs(int y, int x)
	{
		int size = q.size();
		for(int i=0; i<size; ++i)
		{
			for(int d=0; d<8; ++d)
			{
				int nexty = y + dir[d][0];
				int nextx = x + dir[d][1];
				if(!inside(nexty, nextx) || map[nexty][nextx] == 0 || visit[nexty][nextx] == true)
					continue;
				q.add(new Pos(nexty, nextx));
				visit[nexty][nextx] = true;
				bfs(nexty, nextx);
			}
		}
	}
	
	
	/*
	static void dfs(int y, int x)
	{
		visit[y][x] = true;
		for(int d=0; d<8; ++d)
		{
			int nexty = y + dir[d][0];
			int nextx = x + dir[d][1];
			if(!inside(nexty, nextx) || map[nexty][nextx] == 0 || visit[nexty][nextx] == true)
				continue;
			dfs(nexty, nextx);
		}
	}
	*/
}