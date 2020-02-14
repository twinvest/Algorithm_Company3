package day0214;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 인접리스트 {
	static int N;
	static int M;
	static int V;
	static boolean[] visited;
	static List<Integer>[] adj;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		V = sc.nextInt();
		adj = new ArrayList[N+1]; //이런식으로도 문법가능
		visited = new boolean[N+1];
		for(int i = 1; i <= N; i++)
			adj[i] = new ArrayList<>();
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			adj[a].add(b);
			adj[b].add(a);
		}
		//문제에서는 작은 정점부터 방문해야 하므로, 정렬
		for(int i = 1; i <= N; i++)
			Collections.sort(adj[i]);
		
		visited[V] = true;
		dfs(V);
		System.out.println();

		//여기서부터 bfs
		visited = new boolean[N+1];
		//큐를 준비
		Queue<Integer> queue = new LinkedList<>();
		//시작할 정점을 큐에 삽입하고 방문체크
		queue.add(V);
		visited[V] = true;
		
		while( !queue.isEmpty() ) {
			//하나씩 꺼내서 방문(출력) 후
			int node = queue.poll();
			System.out.print(node + " ");
			//	해당 노드와 연결된 모든 노드들에 대해서 방문하지 않았다면 큐에 삽입하고 방문체크
			for(int i =0; i<adj[node].size(); ++i)
			{
				if(visited[adj[node].get(i)] == false)
				{
					queue.add(adj[node].get(i));
					visited[adj[node].get(i)] = true;
				}
			}
		}
		//for(int i = 1; i <= N; i++)
		//	System.out.println(i + " : " + adj[i]);
	}
	static void dfs(int start)
	{
		System.out.print(start+" ");
		for(int i =0; i<adj[start].size(); ++i)
		{
			if(visited[adj[start].get(i)] == false)
			{
				visited[adj[start].get(i)] = true;
				dfs(adj[start].get(i));
			}
		}
	}
}
