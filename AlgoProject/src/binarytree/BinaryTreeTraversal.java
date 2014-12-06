package binarytree;

import java.util.Stack;

public class BinaryTreeTraversal {
	public static Stack<TreeNode> stack = new Stack<TreeNode>();

	public static void inorderTrav(TreeNode root) {
		TreeNode temp = root;
		while (temp != null) {
			stack.push(temp);
			temp = temp.getLeftNode();
		}
		while (!stack.isEmpty()) {
			temp = stack.pop();
			process(temp);
			temp = temp.getRightNode();
			while (temp != null) {
				stack.push(temp);
				temp = temp.getLeftNode();
			}
		}
	}
	
	
	
	public static void inorderTravTest(TreeNode root) {
		Stack stack = new Stack();
		TreeNode temp = root;
		if(temp==null)
			return;
		while(temp.getLeftNode()!=null){
			stack.push(temp);
			temp = temp.getLeftNode();
		}
		process(temp);
		
	}

	public static void preorderTrav(TreeNode root) {
		TreeNode temp = root;
		if (temp == null) {
			return;
		} else {
			stack.push(temp);
		}
		while (!stack.isEmpty()) {
			temp = stack.pop();
			process(temp);
			if (temp.getRightNode() != null) {
				stack.push(temp.getRightNode());
			}
			if (temp.getLeftNode() != null) {
				stack.push(temp.getLeftNode());
			}
		}
	}

	public static void process(TreeNode node) {
		System.out.print(node.getValue());
	}

	public static void main(String s[]) {
		TreeNode roota = new TreeNode(1);
		TreeNode tempc = new TreeNode(3);
		TreeNode tempd = new TreeNode(4);
		TreeNode tempe = new TreeNode(5);
		TreeNode tempb = new TreeNode(2);
		roota.setLeftNode(tempb);
		roota.setRightNode(tempc);
		tempb.setLeftNode(tempd);
		tempd.setRightNode(tempe);
		// inorderTrav(roota);
		preorderTrav(roota);
	}
}
