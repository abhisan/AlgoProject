package stackqueue;

public class Stack {
	public static int[] stack = new int[5];
	public static int top = -1;

	public static void push(int i) throws Exception {
		top++;
		if (top == stack.length) {
			throw new Exception("throw overflow");
		}
		stack[top] = i;
	}

	public static int pop(int i) throws Exception {
		if (top == -1) {
			throw new Exception("underflow");
		}
		int j = stack[top];
		top--;
		return j;
	}
}
