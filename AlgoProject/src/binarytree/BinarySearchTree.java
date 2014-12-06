package binarytree;

public class BinarySearchTree {
	public static int binarySearch(int[] data, int beg, int end, int item) {
		if ((beg < 0) || (end >= data.length))
			return -1;
		int mid = (beg + end) / 2;
		if (data[mid] == item)
			return mid;
		else if ((end >= beg)) {
			if (data[mid] > item)
				return binarySearch(data, beg, mid - 1, item);
			else
				return binarySearch(data, mid + 1, end, item);
		} else
			return -1;
	}
	
	
	
	
	

	public static int binarySearch_ver2(int[] data, int beg, int end, int item) {
		int mid = (beg + end) / 2;
		while ((beg <= end) && (data[mid] != item)) {
			if (data[mid] > item)
				end = mid - 1;
			else
				beg = mid + 1;
			mid = (beg + end) / 2;
		}
		if (data[mid] == item)
			return mid;
		else
			return -1;
	}

	// return par node;
	public static boolean binarySearch_ver3(TreeNode root, int item, TreeNode par, TreeNode loc) {
		TreeNode temp = root;
		while ((temp != null)) {
			if (temp.getValue() == item) {
				loc = temp;
				return true;
			} else if (temp.getValue() > item) {
				par = temp;
				temp = temp.getLeftNode();
			} else {
				par = temp;
				temp = temp.getRightNode();
			}
		}
		return false;
	}

	public static boolean insertNode(TreeNode root, int item) {
		TreeNode par = null;
		TreeNode loc = null;
		boolean flag = binarySearch_ver3(root, item, par, loc);
		if (flag) {
			return false;
		} else {
			if (par == null) {
				root = new TreeNode(item);
			} else if (par.getValue() > item) {
				par.setLeftNode(new TreeNode(item));
			} else {
				par.setRightNode(new TreeNode(item));
			}
			return true;
		}
	}

	public static boolean deleteNode(TreeNode root, int item) {
		TreeNode par = null;
		TreeNode loc = null;
		boolean flag = binarySearch_ver3(root, item, par, loc);
		if (flag) {
			// case a and b
			if (loc.getLeftNode() == null && loc.getRightNode() == null) {
				if (loc == par.getRightNode()) {
					par.setRightNode(null);
				} else {
					par.setLeftNode(null);
				}
			} else if (loc.getLeftNode() == null) {
				if (loc == par.getRightNode()) {
					par.setRightNode(loc.getRightNode());
				} else {
					par.setLeftNode(loc.getRightNode());
				}
			} else if (loc.getRightNode() == null) {
				if (loc == par.getRightNode()) {
					par.setRightNode(loc.getLeftNode());
				} else {
					par.setLeftNode(loc.getLeftNode());
				}
			}// case c
			else {
				TreeNode suc = inorderSuc(loc, par);
				deleteNode(root, suc.getValue());
				if (loc == par.getRightNode()) {
					par.setRightNode(suc);
				} else {
					par.setLeftNode(suc);
				}
			}
			return true;
		} else
			return false;
	}

	//is it a correct implemntation for in order suc
	
	public static TreeNode inorderSuc(TreeNode node, TreeNode parSuc) {
		TreeNode temp = node;
		if (temp == null)
			return null;
		parSuc = temp;
		temp = temp.getRightNode();
		while (temp != null) {
			parSuc = temp;
			temp = temp.getLeftNode();
		}
		return temp;
	}

	public static void main(String s[]) {
		// int[] data = { 1, 2, 4, 6, 7, 8, 9 };
		// System.out.println(binarySearch_ver2(data, 0, 6, 9));
		TreeNode roota = new TreeNode(6);
		TreeNode tempc = new TreeNode(9);
		TreeNode tempd = new TreeNode(2);
		TreeNode tempe = new TreeNode(3);
		TreeNode tempb = new TreeNode(4);
		roota.setLeftNode(tempb);
		roota.setRightNode(tempc);
		tempb.setLeftNode(tempd);
		tempd.setRightNode(tempe);
		System.out.print(binarySearch_ver3(roota, 0, null, null));
	}
}
