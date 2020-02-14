package day0214;

import java.util.LinkedList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class 토마토 {
	static boolean inside(int y, int x)
	{
		return y>=0 && y<N && x>=0 && x<M; 
	}
	static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
	static class Pos
	{
		int y;
		int x;
		Pos(int y, int x)
		{
			this.y = y;
			this.x = x;
		}
	}
	static int N;
	static int M;
	static boolean check;
	static int[][] arr;
	static boolean[][] visit;
	static int cnt = 1;
	static Queue<Pos> q;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		arr = new int[N][M];
		q = new LinkedList<>();
		visit = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(arr[i][j] == 1)
				{
					q.add(new Pos(i , j));
				}
			}
		}
		
		do
		{
			check = false;
			bfs(cnt);
			cnt++;
		}while(check);
		
		System.out.println(cnt - 2);
	}
	
	static void bfs(int cnt)
	{
		int size = q.size();
		for(int i=0; i<size; ++i)
		{	
			int y = q.peek().y;
			int x = q.peek().x;
			q.poll();
			for(int d=0; d<4; ++d)
			{
				int nexty = y + dir[d][0];
				int nextx = x +dir[d][1];
				if(!inside(nexty, nextx) || arr[nexty][nextx] != 0 || visit[nexty][nextx])
					continue;
				arr[nexty][nextx] = cnt +1;
				q.add(new Pos(nexty, nextx));
				visit[nexty][nextx] = true;
				check = true;
			}
		}
	}
}