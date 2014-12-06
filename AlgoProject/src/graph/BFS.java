package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	static Queue<Node> processQ = new LinkedList<Node>();
	public static void traverseGraphVer1(Node start) {
		Graph g = new Graph();
		for (Node d : g.getChildren()) {
			d.state = State.UNVISITED;
		}
		enqueue(start);
		Node temp;
		while (!processQ.isEmpty()) {
			temp = processQ.poll();
			for (Node d : temp.getAdjacent()) {
				if (temp.state == State.UNVISITED) {
					enqueue(start);
					temp.state = State.VISITED;
				}
			}
			process(temp);
		}
	}

	public static void enqueue(Node n) {
		n.state = State.VISITING;
		processQ.add(n);
	}

	public static void process(Node d) {
		System.out.print(d.value);
		d.state = State.VISITED;
	}

	public static void traverseGraphVer2() {

	}

}
