package binarytree;

import java.util.ArrayList;
import java.util.List;

public class HeapTree {
	private static List<TreeNode> heapList = new ArrayList<TreeNode>();
	public static void insertHeap_Array(TreeNode node){
		int nodeIndex = heapList.size();//index starts from 0;
		int parIndex;
		while(nodeIndex !=0){
			parIndex = (nodeIndex+1)/2;
			if(heapList.get(parIndex).getValue()<node.getValue())
				heapList.add(nodeIndex, heapList.get(parIndex));
			nodeIndex = parIndex;
		}
		heapList.add(nodeIndex, node);
	}

	public static TreeNode deleteHeap_Array(){
		int heapSize = heapList.size();
		TreeNode deleteNode = null;
		if(heapSize>0){
			deleteNode = heapList.remove(0);
			if(heapList.size()>0){
				TreeNode last = heapList.remove(heapSize-1);
				int ptr = 0;
				int ptrR = 1;
				int ptrL = 2;
				while(ptrR<heapList.size()){
					if(last.getValue()> heapList.get(ptrL).getValue() && last.getValue()> heapList.get(ptrR).getValue()){
						heapList.add(ptr, last);
						return deleteNode;
					}
					else if(heapList.get(ptrL).getValue() > heapList.get(ptrR).getValue()){
						if(heapList.get(ptrL).getValue() > last.getValue()){
							heapList.add(ptr, heapList.get(ptrL));
							ptr = ptrL;
						}
						else{
							heapList.add(ptr, heapList.get(ptrR));
							ptr = ptrR;
						}
						ptrL = 2*ptr +1;
						ptrR = 2*ptr +2;
					}
				}
				if((ptrL==heapList.size()-1) && last.getValue()< heapList.get(ptrL).getValue() ){
					ptr = ptrL;
				}
				heapList.add(ptr, last);
			}
		}
		return deleteNode;
	}
	public static void main(String s[]) {

	}
	
	//public static TreeNode root;
	//public static TreeNode parNode;
	//public static int LEFT = 0;
	//public static int RIGHT = 1;
	//private static int count = 0;

	/*public static void insHeap(TreeNode node) {
		if (root == null) {
			count++;
			root = node;
		} else {
			count++;
			Stack path = getPath();
			TreeNode temp = root;
			while (!path.isEmpty()) {
				parNode = temp;
				if ((Integer) path.pop() == LEFT) {
					if (path.isEmpty()) {
a						temp.setLeftNode(node);
					} else {
						temp = temp.getLeftNode();
					}
				} else {
					if (path.isEmpty()) {
						temp.setRightNode(node);
					} else {
						temp = temp.getRightNode();
					}
				}
			}
		}
	}*/

	/*public static TreeNode delHeap(TreeNode root) {
		Stack stack = getPath();
		TreeNode delNode = root;
		TreeNode temp = root;
		while (stack.isEmpty()) {
			if ((Integer) stack.pop() == LEFT) {
				temp = temp.getLeftNode();
			} else {
				temp = temp.getRightNode();
			}
		}
		// if parNode is available
		if (temp == temp.getParNode().getLeftNode()) {
			temp.getParNode().setLeftNode(null);
		} else {
			temp.getParNode().setRightNode(null);
		}
		temp.setRightNode(root.getRightNode());
		temp.setLeftNode(root.getLeftNode());

		delNode.setLeftNode(null);
		delNode.setRightNode(null);

		root = temp;

		reHeap(root);

		return delNode;
	}

	public static void reHeap(TreeNode root){
		TreeNode temp = root;
		while(temp!=null){
			if(root.getValue() >= root.getLeftNode().getValue() && root.getValue()>=root.getRightNode().getValue())
				return;
			else
			{
				if(root.getLeftNode().getValue() >= root.getRightNode().getValue()){
					root.getLeftNode()
				}
			}
			else{
				
			}
		}
	}

	public static void swapTreeNode(TreeNode firstNode, TreeNode secondNode) {

	}

	public static Stack getPath() {
		Stack<Integer> stack = new Stack<Integer>();
		int div = count;
		int rem;
		while (div > 1) {
			stack.push(div % 2);
			div = div / 2;
		}
		return stack;
	}*/
}
