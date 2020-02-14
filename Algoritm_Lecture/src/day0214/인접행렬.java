package day0214;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 인접행렬 {
	static int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	static boolean inside(int y, int x) {
		return (y >= 1 && y < N+1) && (x >= 1 && x < N+1);
	}
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
	static int[][] adj;
	static boolean[][] visit;
	static ArrayList<Pos> list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int startPoint = sc.nextInt();
		adj = new int[N+1][N+1];
		visit = new boolean[N+1][N+1];
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj[a][b] = 1;
			adj[b][a] = 1;
		}
		dfs(1, startPoint+1);
		
		System.out.println();
		for(int i = 0; i <= N; i++)
			System.out.println(Arrays.toString(adj[i]));
	}
	
	static void dfs(int y, int x)
	{
		System.out.print(x);
		visit[y][x] = true;
		visit[x][y] = true;
		for(int d=0; d<4; ++d)
		{
			int nexty = y + dir[d][0];
			int nextx = x + dir[d][1];
			if(!inside(nexty, nextx) || visit[nexty][nextx] == true || adj[nexty][nextx] != 1)
				continue;
			dfs(nexty, nextx);
		}
	}
}









