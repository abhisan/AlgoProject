package graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public State state;
	public int value;
	public List<Node> getAdjacent(){
		return new ArrayList<Node>();
	}
}
