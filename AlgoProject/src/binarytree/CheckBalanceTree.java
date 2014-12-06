package binarytree;

public class CheckBalanceTree {
	public static TreeNode createTree() {
		TreeNode root = new TreeNode(1);
		TreeNode a2 = new TreeNode(2);
		TreeNode a3 = new TreeNode(3);
		TreeNode a4 = new TreeNode(4);
		TreeNode a5 = new TreeNode(5);
		TreeNode a6 = new TreeNode(6);
		root.setLeftNode(a2);
		root.setRightNode(a3);
		a2.setLeftNode(a4);
		a2.setRightNode(a5);
		// a4.leftNode = a6;
		return root;
	}

	public static boolean checkBalTree(TreeNode tn) {

		if ((maxHeight(tn) - minHeight(tn)) > 1) {
			return false;
		}
		return true;
	}

	public static int maxHeight(TreeNode tn) {
		if (tn == null)
			return 0;
		else
			return Math.max(maxHeight(tn.getLeftNode()),
					maxHeight(tn.getRightNode())) + 1;
	}

	public static int minHeight(TreeNode tn) {
		if (tn == null)
			return 0;
		else
			return Math.min(minHeight(tn.getLeftNode()),
					minHeight(tn.getRightNode())) + 1;
	}

	public static void main(String s[]) {
		TreeNode root = createTree();
		System.out.println(checkBalTree(root));
	}
}
