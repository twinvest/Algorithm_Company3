package day0205;

import java.util.Scanner;
import java.util.Stack;
public class 제로 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int testcase = scan.nextInt();
		for(int t=1; t<=testcase; ++t){
			int sum=0;
			Stack<Integer> s = new Stack<>();
			int len = scan.nextInt();
			for(int i=0; i<len; ++i){
				int num = scan.nextInt();
				if(num != 0){
					s.push(num);
					continue;
				}
				s.pop();
			}
			while(!s.empty())
				sum += s.pop();
			System.out.println("#"+t+" "+sum);
		}
	}

}
