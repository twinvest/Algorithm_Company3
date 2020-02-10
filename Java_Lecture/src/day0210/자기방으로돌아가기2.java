package day0210;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Stu
{
	int cur;
	int next;
	Stu(int cur, int next)
	{
		this.cur = cur;
		this.next = next;
	}
}

public class 자기방으로돌아가기2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			int[] arr = new int[201];
			int ans = 1;
			Queue<Stu> q = new LinkedList<>();
			int Student = scan.nextInt();
			//입력받기
			for(int i=0; i<Student; ++i)
			{
				int cur = scan.nextInt();
				int next = scan.nextInt();
				cur = (cur/2) + (cur%2); 
				next = (next/2) + (next%2); 
				q.add(new Stu(cur, next));
			}
			
			while(!q.isEmpty())
			{
				int cur = q.peek().cur;
				int next = q.peek().next;
				
				if(cur < next)
					for(int i = cur; i<=next; ++i)
						arr[i]++;
				else
					for(int i = next; i<=cur; ++i)
						arr[i]++;
				q.poll();	
			}
			Arrays.sort(arr);
			System.out.println("#"+t+" "+arr[200]);
		}
	}
}