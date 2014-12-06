package recursion;

import java.util.Iterator;
import java.util.Stack;

public class MoneyChangeProblem {
	public static void change(int n, Stack<Integer> stack) {
		if (n == 0) {
			printStack(stack);
			return;
		} else {
			if (n >= 5) {
				Stack<Integer> tempStack = (Stack<Integer>) stack.clone();
				tempStack.push(5);
				change(n - 5, tempStack);
			}
			if (n >= 10) {
				Stack<Integer> tempStack = (Stack<Integer>) stack.clone();
				tempStack.push(10);
				change(n - 10, tempStack);
			}
			// if(n>=25){
			// change(n-25);
			// System.out.print(" 25 ");
			// }
			// if(n>=100){
			// change(n-100);
			// System.out.print(" 100 ");
			// }
		}
	}

	private static void printStack(Stack<Integer> stack) {
		Iterator<Integer> i = stack.iterator();
		while (i.hasNext()) {
			System.out.print(" " + i.next() + " ");
		}
		System.out.println("");
	}

	public static void main(String s[]) {
		change(20, new Stack<Integer>());
	}
}

//denomination 5, 10

//20
//5 + change(15)
//	5 + change(10)
//		5  + change(5) =>  5 5 5 5
//		10             =>  5 5 10
//	10 + chnage (5)    =>  5 10 5
//10 + change (10)    
//	5 + change(5)      => 10 5 5
//	10                 => 10 10 





