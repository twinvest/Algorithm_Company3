package day0205;

import java.util.LinkedList;
import java.util.Queue;

public class 마이쮸 {

	public static void main(String[] args) {
		int[] arr = new int[11];
		int i = 1;
		Queue<Integer> q = new LinkedList<>();
		int numOfmychu = 20;
		int ans = -1, sum = 0;
		boolean flag = true;
		
		while(flag)
		{
			sum = 0;
			q.add(i);
			++arr[q.peek()];
			q.add(q.poll());
			++i;
			
			for(int j = 1; j<arr.length; ++j)
			{
				if(arr[j] != 0)
				{
					for(int k = arr[j]; k>0; k--)
					{
						sum += k;
					}
				}
				if(sum > 20)
				{
					ans = q.poll();
					flag = false;
				}
			}
		}
		System.out.println(ans);
	}
}
