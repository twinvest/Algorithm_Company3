package day0211;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Pos
{
	int start;
	int end;
	Pos(int start, int end)
	{
		this.start = start;
		this.end=end;
	}
}

public class 냉장고 {

	public static void main(String[] args) {
		Queue<Pos> q = new LinkedList<>();
		int[] arr = new int[10271];
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int ans = 0;
		int count = 0;
		boolean flag = false;
		for(int i =0;i <num; ++i)
		{
			int start = scan.nextInt();
			int end = scan.nextInt();
			if(start < 0 && end < 0)
			{
				int tmp = Math.abs(start);
				start = 0;
				end += tmp;
			}
			q.add(new Pos(start, end));
			
			for(int j = start; j<=end; ++j)
				++arr[j];
		}
		
		while(!q.isEmpty())
		{
			int max = -987654321;
			int index = -1;
			for(int i = 0; i<arr.length; ++i)
			{
				if(arr[i] > max)
				{
					max = arr[i]; //들어가는 물건의 수
					index = i;  //이 i가 사실상 냉장고를 설치할 온도임.
				}
			}
			int size = q.size();
			for(int i=0; i<size; ++i)
			{
				if(q.peek().start <= index && q.peek().end>=index)
				{
					for(int j = q.peek().start; j<=q.peek().end; ++j)
						--arr[j];
					q.poll();
				}
				else
				{
					Pos p = q.poll();
					q.add(p);
				}
			}
			++ans;
		}
		System.out.println(ans);
	}
}