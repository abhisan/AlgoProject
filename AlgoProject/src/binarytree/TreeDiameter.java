package binarytree;

public class TreeDiameter {
	public static int diameterVar1(TreeNode root) {
		int diameter = 0;
		int diameterL = 0;
		int diameterR = 0;
		if (root != null) {
			diameter = height(root.getLeftNode()) + height(root.getRightNode())
					+ 1;
			diameterL = diameterVar1(root.getLeftNode());
			diameterR = diameterVar1(root.getRightNode());
		}
		return Math.max(diameter, Math.max(diameterL, diameterR));
	}

	public static int height(TreeNode root) {
		int height = 0;
		if (root != null) {
			height = Math.max(height(root.getLeftNode()),
					height(root.getRightNode())) + 1;
		}
		return height;
	}

	// public static int diameterVar2(TreeNode root, int height) {
	// }

	public static void main(String s[]) {
		TreeNode root1 = new TreeNode(1);
		TreeNode temp2 = new TreeNode(2);
		TreeNode temp3 = new TreeNode(3);
		TreeNode temp4 = new TreeNode(4);
		TreeNode temp5 = new TreeNode(5);
		TreeNode temp6 = new TreeNode(6);
		root1.setLeftNode(temp2);
		root1.setRightNode(temp3);
		temp2.setLeftNode(temp4);
		temp2.setRightNode(temp5);
	}
}

// Complexity of this algorithm
// O(n^2) can be reduced to O(n), the height can be calculated in the recursion.
