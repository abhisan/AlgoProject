package binarytree;

public class FindCommonAncestor {
	public static TreeNode commonAncestor(TreeNode root, TreeNode a, TreeNode b) {
		if (root == null || a == null || b == null) {
			throw new RuntimeException("Invalid input");
		}
		if ((cover(root.getLeftNode(), a) && cover(root.getRightNode(), b)) || (cover(root.getLeftNode(), b) && cover(root.getRightNode(), a))) {
			return root;
		} else if (cover(root.getLeftNode(), a) && cover(root.getLeftNode(), b)) {
			return commonAncestor(root.getLeftNode(), a, b);
		} else if (cover(root.getRightNode(), a) && cover(root.getRightNode(), a)) {
			return commonAncestor(root.getRightNode(), a, b);
		} else {
			throw new RuntimeException("Invalid input");
		}
	}

	public static TreeNode commonAncestorBST(TreeNode root, TreeNode a, TreeNode b) {
		if (root == null || a == null || b == null) {
			throw new RuntimeException("Invalid input");
		}
		if ((cover(root.getLeftNode(), a) && cover(root.getRightNode(), b)) || (cover(root.getLeftNode(), b) && cover(root.getRightNode(), a))) {
			return root;
		} else if (cover(root.getLeftNode(), a) && cover(root.getLeftNode(), b)) {
			return commonAncestor(root.getLeftNode(), a, b);
		} else if (cover(root.getRightNode(), a) && cover(root.getRightNode(), a)) {
			return commonAncestor(root.getRightNode(), a, b);
		} else {
			throw new RuntimeException("Invalid input");
		}
	}

	private static boolean cover(TreeNode root, TreeNode a) {
		if (root == null || a == null) {
			return false;
		}
		if (root.getValue() == a.getValue()) {
			return true;
		} else {
			return cover(root.getLeftNode(), a) || cover(root.getRightNode(), a);
		}
	}

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

	public static void main(String s[]) {
		TreeNode root = createTree();
		System.out.print(commonAncestor(root, new TreeNode(5), new TreeNode(1)).getValue());
	}
}
