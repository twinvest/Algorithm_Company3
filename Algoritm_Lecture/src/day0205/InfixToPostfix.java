package day0205;

import java.util.Stack;

public class InfixToPostfix {
	public static void main(String[] args) {
		String expr = "2+3*4*2+7";
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		//수식을 순회하면서
		for(int i = 0; i < expr.length(); i++) {
			char c = expr.charAt(i);
			//피연산자면 그냥 출력
			if( Character.isDigit(c))
				sb.append(c);
			//연산자면
			else {
				if( c == '+' || c == '-') {
					//  덧셈(뺄셈) 스택이 빌때까지 꺼내서 출력 후 자신을 푸쉬
					while( !stack.isEmpty() ) {
						sb.append(stack.pop());
					}
					stack.push(c);
				}
				else if( c == '*' || c == '/') {
					//  곱셈(나눗셈) 스택이 비어있지 않으면서 스택의 맨위가 덧셈(뺄셈)이면 자신을 푸쉬
					while( !stack.isEmpty() && stack.peek() != '+' && stack.peek() != '-')
						sb.append(stack.pop());
					stack.push(c);
				}
			}
		}		
		//수식이 끝나면 모든 스택의 연산자를 꺼내서 출력
		while(!stack.isEmpty())
			sb.append(stack.pop());
		System.out.println(sb.toString());
	}
}

