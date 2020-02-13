package day0213;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섬의개수_교수님ver_bfs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			W = sc.nextInt();
			H = sc.nextInt();
			if( W == 0 && H == 0 )
				break;
			map = new int[H][W];
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) 
					map[i][j] = sc.nextInt();
			}
			int cnt = 0;
			for(int i = 0; i < H; i++) {
				for(int j = 0; j < W; j++) {
					//육지가 발견이 되면
					if( map[i][j] == 1 ) {
						//육지카운트 하나세고
						cnt++;
						//다 물로 만들어
//						dfs(i, j);
						
						//큐를 만들고, 현재 위치를 큐에 넣고, 현재 위치를 물로 바꾼다.
						Queue<Node> queue = new LinkedList<>();
						queue.add(new Node(i,j));
						map[i][j] = 0;
						//큐가 빌때까지
						while( !queue.isEmpty() ) {
							//꺼내서 인접한 아이들 중 육지면 물로 바꾸고 큐에 넣는다.
							Node n = queue.poll();
							for(int d = 0; d < 8; d++) {
								int nr = n.r + dr[d];
								int nc = n.c + dc[d];
								if( nr < 0 || nc < 0 || nr >= H || nc >= W )
									continue;
								if( map[nr][nc] == 0 )
									continue;
								queue.add(new Node(nr,nc));
								map[nr][nc] = 0;
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
	static class Node{
		int r, c;
		Node(int r, int c){
			this.r = r;
			this.c = c;
		}
	}
	static int W;
	static int H;
	static int[][] map;
	static int[] dr = {-1,-1,-1,0,1,1,1,0};
	static int[] dc = {-1,0,1,1,1,0,-1,-1};
	static void dfs(int r, int c) {
		map[r][c] = 0;
		//8방으로 육지가 존재한다면, 재귀호출
		for(int d = 0; d < 8; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if( nr < 0 || nc < 0 || nr >= H || nc >= W )
				continue;
			if( map[nr][nc] == 0 )
				continue;
			dfs(nr, nc);
		}
	}
}