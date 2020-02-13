package day0205;

import java.util.Stack;
import java.util.Stack;

public class 후위표기식연산 {
	public static void main(String[] args) {
		String str = "134*7*+5+";
		Stack<Integer> stack = new Stack<>();
		//식을 순회하면서(문자열에서 문자 한글자씩 검사하면서)
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
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
		System.out.println(stack.pop());
	}
}
