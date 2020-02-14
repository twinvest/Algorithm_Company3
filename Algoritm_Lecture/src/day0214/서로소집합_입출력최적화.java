package day0214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 서로소집합_입출력최적화 {
	static int[] parents;
	static int[] rank;
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			parents = new int[N+1];
			rank = new int[N+1];
			for(int i = 1; i <= N; i++)
				parents[i] = i;
			for(int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());//명령 집합1 집합2
				int oper = Integer.parseInt(st.nextToken());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				switch (oper) {
				case 0:
					union(a, b);
					break;
				case 1:
					if( find(a) == find(b))
						sb.append(1);
					else
						sb.append(0);
					break;
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	static int find(int x) {
		if (x == parents[x])
			return x;
		else
			parents[x] = find(parents[x]);
			return parents[x];
	}
	static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		if( rank[px] > rank[py]) {
			parents[py] = px;
		}
		else if(rank[px] < rank[py] ) {
			parents[px] = py;
		}
		else {
			rank[px]++;
			parents[py] = px;
		}
	}
}
