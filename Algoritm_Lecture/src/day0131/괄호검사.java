package day0131;

import java.util.Stack;

import java.util.Stack;

public class 괄호검사 {
	public static void main(String[] args) {
		String str = "((( )((((( )( )((( )( ))((( ))))))";
		Stack<Character> stack = new Stack<>();
		boolean result = true;
		//한글자씩 탐색하면서
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			//열림괄호면 해당 문자를 스택에 담자.
			if( c == '(' )
				stack.push(c);
			
			//닫힘괄호면, 스택에서 팝 해서 내 짝꿍인지 검사하자.
			else if( c == ')' ) {
				if( !stack.isEmpty() && stack.pop() == '(' ) {
					
				}
				else {
					//잘못됐음. 더이상 검사할 필요도 없어.
					result = false;
					break;
				}
			}
		}
		if(result) {
			if(stack.isEmpty())
				System.out.println("정상");
			else
				System.out.println("잘못됨");
		}
		else {
			System.out.println("잘못됨");
		}
	}
}
