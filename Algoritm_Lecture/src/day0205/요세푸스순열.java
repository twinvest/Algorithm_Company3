package day0205;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스순열 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int N,K;
		N = scan.nextInt();
		K = scan.nextInt();
		for(int i =1; i<=N; ++i)
			q.offer(i);
		System.out.print("<");
		while(!q.isEmpty())
		{
			for(int i =1; i<=K; ++i)
			{
				if(i==K)
				{
					System.out.print(q.poll());
					if(q.size() != 0)
						System.out.print(", ");
					break;
				}
				int num = q.poll();
				q.offer(num);
			}
		}
		System.out.println(">");
	}

}
