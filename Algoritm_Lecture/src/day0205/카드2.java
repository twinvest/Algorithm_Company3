package day0205;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 카드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int N = scan.nextInt();
		for(int i = 1; i<=N; ++i)
			q.offer(i);
		while(q.size() != 1)
		{
			q.poll();
			int num = q.poll();
			q.offer(num);
		}
		int a = q.poll();
		System.out.println(a);
	}
}
