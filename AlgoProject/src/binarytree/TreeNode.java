package binarytree;

public class TreeNode {
	private int value;
	private TreeNode leftNode;
	private TreeNode rightNode;
	private TreeNode parNode;

	public TreeNode getParNode() {
		return parNode;
	}

	public void setParNode(TreeNode parNode) {
		this.parNode = parNode;
	}

	public TreeNode(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
}
