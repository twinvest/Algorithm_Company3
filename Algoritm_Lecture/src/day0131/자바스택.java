package day0131;

import java.util.Stack;

//클래스 : 관련있는 상태(변수)와 기능(함수)을 모아서 만든 사용자 정의 자료형
public class 자바스택 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println(stack.pop());
		System.out.println(stack.pop());	
		}
}