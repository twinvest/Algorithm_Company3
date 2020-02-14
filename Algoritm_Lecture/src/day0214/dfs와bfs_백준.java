package day0214;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class dfs와bfs_백준 {
	static int N;
	static int M;
	static int V;
	static int[][] adj;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		adj = new int[N+1][N+1];
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj[a][b] = 1;
			adj[b][a] = 1;
		}
		//DFS
		//정점별로 방문체크를 하기 위한 방문 배열을 준비
		visited = new boolean[N+1];
		//시작정점을 매개로 DFS함수 호출
		visited[V] = true;
		dfs(V);
		System.out.println();
		
		//BFS
		//정점별로 방문체크를 하기 위한 방문 배열을 준비
		visited = new boolean[N+1];
		//큐를 준비
		Queue<Integer> queue = new LinkedList<>();
		//시작할 정점을 큐에 삽입하고 방문체크
		queue.add(V);
		visited[V] = true;
		
		//큐가 빌때까지
		while( !queue.isEmpty() ) {
			//하나씩 꺼내서 방문(출력) 후
			int node = queue.poll();
			System.out.print(node + " ");
			//	해당 노드와 연결된 모든 노드들에 대해서 방문하지 않았다면 큐에 삽입하고 방문체크
			for(int i = 1; i <= N; i++) {
				if( !visited[i] && adj[node][i] == 1 ) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
		System.out.println();
	}
	//DFS함수. 현재 방문할 정점 번호를 매개로 받음
	static void dfs(int node) {
		//	현재 번호를 방문(출력)
		System.out.print(node + " ");
		//	현재 번호에 대해 방문체크
		//	현재 정점과 연결된 모든 정점들에 대해서
		for(int i = 1; i <= N; i++) {
			//	아직 방문하지 않았다면 해당 정점에 대해 DFS함수 호출
			if( !visited[i] && adj[node][i] == 1 ) {
				visited[i] = true;
				dfs(i);
			}
		}
	}
}