package day0205;

import java.util.Scanner;
import java.util.Stack;

public class 계산기3 {
	static int postToAns(String s)
	{
		Stack<Integer> stack = new Stack<>();
		//식을 순회하면서(문자열에서 문자 한글자씩 검사하면서)
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//피연산자면 스택에 담는다.
			if( Character.isDigit(c) )
				stack.push(c - '0');
			//연산자면 두개의 피연산자를 스택에서 꺼내서 해당 연산자로 연산한 후 결과를 스택에 담는다.
			else {
				int num2 = stack.pop();
				int num1 = stack.pop();
				switch (c) {
				case '+':
					stack.push(num1 + num2);
					break;
				case '-':
					stack.push(num1 - num2);
					break;
				case '*':
					stack.push(num1 * num2);
					break;
				case '/':
					stack.push(num1 / num2);
					break;
				}
			}
		}
		//식이 끝나면 스택에 있는 하나의 값이 결과.
		return stack.pop();
	}
	
	
	static String infixToPost(String s)
	{
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		//수식을 순회하면서
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//피연산자면 그냥 출력
			if( Character.isDigit(c))
				sb.append(c);
			//연산자면
			else {
				if( c == '+' || c == '-') {
					//  덧셈(뺄셈) 스택이 빌때까지 꺼내서 출력 후 자신을 푸쉬
					while( !stack.isEmpty() && stack.peek() != '('  ) {
						sb.append(stack.pop());
					}
					stack.push(c);
				}
				else if( c == '*' || c == '/') {
					//  곱셈(나눗셈) 스택이 비어있지 않으면서 스택의 맨위가 덧셈(뺄셈)이면 자신을 푸쉬
					while( !stack.isEmpty() && stack.peek() != '+' && stack.peek() != '-' && stack.peek() != '(')
						sb.append(stack.pop());
					stack.push(c);
				}
				else if( c == '(' ) {
					//열림괄호는 일단 그냥 다 깔고앉음
					stack.push(c);
				}
				else if( c == ')' ) {
					//닫힘괄호는 열림괄호를 만날때까지 다 꺼내서 출력하고, 열림괄호 버린다.
					while( true ) {
						char top = stack.pop();
						if( top != '(' )
							sb.append(top);
						else
							break;
					}
				}
			}
		}
		
		//수식이 끝나면 모든 스택의 연산자를 꺼내서 출력
		while(!stack.isEmpty())
			sb.append(stack.pop());
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//int testcase = scan.nextInt();
		for(int t = 1; t<=10; ++t)
		{
			int len = scan.nextInt();
			String s = scan.next();
			String post = infixToPost(s);
			int ans = postToAns(post);
			System.out.println("#"+t+" "+ans);
		}
	}
}