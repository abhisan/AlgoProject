package graph;

import java.util.Stack;

public class DFS {
	static Stack<Node> processS = new Stack<Node>();

	public static void traverseGraphVer1(Node start) {
		Graph g = new Graph();

		for (Node d : g.getChildren()) {
			d.state = State.UNVISITED;
		}
		push(start);
		Node temp;
		while (!processS.isEmpty()) {
			temp = processS.pop();
			for (Node d : temp.getAdjacent()) {
				if (d.state == State.UNVISITED) {
					push(d);
				}
			}
			process(temp);
		}
	}

	private static void push(Node d) {
		d.state = State.VISITING;
		processS.push(d);
	}

	public static void process(Node d) {
		System.out.print(d.value);
		d.state = State.VISITED;
	}
}
