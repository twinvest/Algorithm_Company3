package day0205;
import java.util.Scanner;
public class 원형큐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] queue = new int[5];
		int front = 0;
		int rear = 0;
		
		while(true) {
			System.out.println("1. enQueue\n2. deQueue\n3. size\n4. isEmpty\n0. End");
			int sel = sc.nextInt();
			if( sel == 0 )
				break;
			else if( sel == 1 ) {
				int num = sc.nextInt();
				//enqueue
				rear = (rear+1) % queue.length;
				queue[rear] = num;
			}
			else if( sel == 2 ) {
				//dequeue
				front = (front+1) % queue.length;
				System.out.println(queue[front]);
			}
			else if( sel == 3 ) {
				//size
				if( rear > front)
					System.out.println(rear - front);
				else
					System.out.println( (queue.length-rear) - front );
			}
			else if( sel == 4 ) {
				//isEmpty
				System.out.println(front == rear ? "empty" : "not empty");
			}	
		}		
	}
}

