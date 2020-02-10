package day0210;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Student
{
	int cur;
	int next;
	Student(int cur, int next)
	{
		this.cur = cur;
		this.next = next;
	}
}

public class 자기방으로돌아가기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t)
		{
			int ans = 1;
			Queue<Student> q = new LinkedList<>();
			int Student = scan.nextInt();
			//입력받기
			for(int i=0; i<Student; ++i)
			{
				int cur = scan.nextInt();
				int next = scan.nextInt();
				q.add(new Student(cur, next));
			}
			
			
			while(!q.isEmpty())
			{
				int index = q.size();
				for(int i=0; i<index-1; ++i)
				{
					int curcur = q.peek().cur;
					int curnext = q.peek().next;
					q.poll();
					if(q.peek().cur < curnext || q.peek().next < curnext)
					{
						q.add(new Student(q.peek().cur, q.peek().next));
					}
					q.poll();
				}
				++ans;
				System.out.println("#"+t+" "+ans);
			}
		}
	}
}