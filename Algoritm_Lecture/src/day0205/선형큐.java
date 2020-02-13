package day0205;

public class 선형큐 {
	public static void main(String[] args) {
		int[] queue = new int[5];
		int front = -1;
		int rear = -1;

		// enqueue 1
		rear += 1;
		queue[rear] = 1;

		// enqueue 2
		rear += 1;
		queue[rear] = 2;

		// enqueue 3
		rear += 1;
		queue[rear] = 3;

		// dequeue
		front += 1;
		System.out.println(queue[front]);

		// dequeue
		front += 1;
		System.out.println(queue[front]);

		// dequeue
		front += 1;
		System.out.println(queue[front]);

		System.out.println("공백여부 : " + (front == rear));

		// enqueue 4
		rear += 1;
		queue[rear] = 4;

		// enqueue 5
		rear += 1;
		queue[rear] = 5;
		
		// enqueue 6
		rear += 1;
		queue[rear] = 6;
	}
}