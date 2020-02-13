package day0206;
import java.util.*;
public class 규영이와인영이의카드게임 {
	static boolean[] visited;
	static int[] gyu;
	static int[] in;
	static int[] card;
	static int wincnt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int tc=1;tc<=test_case;tc++) {
			gyu = new int[9];
			in = new int[9];
			card = new int[19];
			visited = new boolean[10];
			for(int i=0;i<gyu.length;i++) {
				gyu[i] = sc.nextInt();
				card[gyu[i]] = 1;
			}
			int k = 0;
			for(int i=1;i<=18;i++) {
				if(card[i] != 1) {
					in[k++] = i;
				}
			}
			perm(0, 0, 0);
			System.out.println("#" + tc + " " + wincnt + " " +(362880-wincnt));
			wincnt = 0;
		}
	}
	public static void perm(int idx, int gyu_score, int in_score) {
		if(idx == 9) 
		{
			if(gyu_score > in_score) 
			{
				wincnt++;
				return;
			}
			return;
		}
		for(int i=0;i<9;i++) 
		{
			if(!visited[i]) 
			{
				visited[i] = true;
				if(gyu[idx] > in[i]) 
				{
					perm(idx+1, gyu_score + (gyu[idx]+in[i]), in_score);
				}else 
				{
					perm(idx+1, gyu_score, in_score + (gyu[idx]+in[i]));
				}
				visited[i] = false;
			}
		}	
	}
}