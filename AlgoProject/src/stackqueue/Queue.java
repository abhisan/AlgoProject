package stackqueue;

public class Queue {
	static int[] queue = new int[5];
	static int queueSize = 6;
	static int front = -1;
	static int rear = -1;

	public static void enqueue(int item) {
		if ((front == 0 && rear == queueSize - 1) || (front == rear + 1))
			throw new RuntimeException("Overflow");
		if (front == -1) {
			front = 1;
			rear = 1;
		} else if (rear == queueSize - 1) {
			rear = 0;
		} else {
			rear = rear + 1;
		}
		queue[rear] = item;
	}

	public static int dequeue() {
		int temp;
		if (front == -1)
			throw new RuntimeException("Underflow");
		temp = queue[front];
		if (front == rear) {
			front = -1;
			rear = -1;
		} else if (front == queueSize - 1) {
			front = 1;
		} else {
			front = front + 1;
		}
		return temp;
	}

	public static int mod(int i) {
		return i;
	}
}
