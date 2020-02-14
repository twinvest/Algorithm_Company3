package day0214;
import java.util.Scanner;
public class 상호배타집합 {
	static int[] parents;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		parents	 = new int[N+1];
		for(int i = 1; i <= N; i++)
			parents[i] = i;
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			union(a, b);
		}
		//자기 자신이 대표자인 수가 집합의 수. 종교의 수
		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			if( i == find(i) )
				cnt++;
		}
		System.out.println(cnt);
	}

	static int find(int x) {
		if (x == parents[x])
			return x;
		else
			return find(parents[x]);
	}
	static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		parents[px] = py;
	}
}