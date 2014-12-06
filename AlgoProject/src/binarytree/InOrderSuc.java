package binarytree;

public class InOrderSuc {
	public static TreeNode inorderSucc(TreeNode e) {
		if (e != null) {
			TreeNode p;
			if (e.getParNode() == null || e.getRightNode() != null) {
				p = leftMostChild(e.getRightNode());
			} else {
				while ((p = e.getParNode()) != null) {
					if (p.getLeftNode() == e) {
						break;
					}
					e = p;
				}
			}
			return p;
		}
		return null;
	}

	public static TreeNode leftMostChild(TreeNode e) {
		if (e == null)
			return null;
		while (e.getLeftNode() != null)
			e = e.getLeftNode();
		return e;
	}
}