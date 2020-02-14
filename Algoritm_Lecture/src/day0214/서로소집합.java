package day0214;

import java.util.Scanner;

public class 서로소집합 {
	static int [] parents;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			StringBuilder sb = new StringBuilder();
			int N = scan.nextInt();
			int operations = scan.nextInt();
			parents = new int[N+1];
			for(int i = 1; i<=N; i++) {
	            parents[i] = i;
	        }
			
			sb.append("#"+t+" ");
			//System.out.print("#"+t+" ");
			for(int i =0; i<operations; ++i)
			{
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				int num3 = scan.nextInt();
				if(num1 == 0)
					union(num2, num3);
				else
				{
					int ans = 0;
					if(find(num2) == find(num3))
						++ans;
					sb.append(ans);
				}	
			}
			System.out.println(sb.toString());
		}
	}
		public static int find(int x) {
	        //루트 노드는 부모 노드 번호로 자기 자신을 가짐.
	    	if(x == parents[x]) {
	            return x;
	        }
	    	//각 노드의 부모 노드를 찾아 올라간다.
	    	else {
	    		parents[x] = find(parents[x]);
	    		return	parents[x]; 
	    	}
	    }
		
		public static void union(int x, int y) {
	        int px = find(x);
	        int py = find(y);
	        parents[px] = py; //x의 root를 y로 변경한다.
		}
}
