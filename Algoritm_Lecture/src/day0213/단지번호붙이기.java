package day0213;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 단지번호붙이기 {
	static class Pos {
		int y;
		int x;

		Pos(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}

	static int[][] dir = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	static boolean inside(int y, int x) {
		return (y >= 0 && y < size) && (x >= 0 && x < size);
	}

	static boolean[][] visit;
	static int size;
	static int[][] map;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		size = scan.nextInt();
		map = new int[size][size];
		visit = new boolean[size][size];
		for (int i = 0; i < size; ++i)
		{
			String s = scan.next();
			for (int j = 0; j < s.length(); ++j)
			{
				map[i][j] = Integer.parseInt(s.charAt(j)+"");
			}	
		}
			

		int count = 0;
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < size; ++j) {
				if (!visit[i][j] && map[i][j] == 1) {
					int ans = dfs(i, j);
					list.add(ans);
					count++;
				}
			}
		}
		Collections.sort(list);
		System.out.println(count);
		for(int i=0; i<list.size(); ++i)
			System.out.println(list.get(i));
	}


	static int dfs(int y, int x) {
		int ans = 1;
		visit[y][x] = true;
		for (int d = 0; d < 4; ++d) {
			int nexty = y + dir[d][0];
			int nextx = x + dir[d][1];
			if (!inside(nexty, nextx) || map[nexty][nextx] == 0 || visit[nexty][nextx] == true)
				continue;
			ans += dfs(nexty, nextx);
		}
		return ans;
	}
}