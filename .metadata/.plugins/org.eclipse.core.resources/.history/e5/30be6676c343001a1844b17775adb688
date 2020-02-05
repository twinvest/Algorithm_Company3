import java.util.Scanner;

public class 스택 {
	public static void main(String[] args) {
		int[] stack = new int[5];
		int top = -1;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Push(입력 예 : 1 10)\n2. Pop(입력 예 : 2)\n0. 종료");
			int sel = sc.nextInt();
			if(sel == 0)
				break;
			else if( sel == 1) {
				if( top + 1 >= stack.length ) {
					System.out.println("StackOverflowException");
					continue;
				}
				int num = sc.nextInt();
				top++;
				stack[top] = num;
			}
			else if( sel == 2 ) {
				if( top == -1 ) {
					System.out.println("EmptyStackException");
					continue;
				}
				System.out.println(stack[top]);
				top--;
			}
		}
	}
}
