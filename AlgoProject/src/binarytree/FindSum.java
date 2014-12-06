package binarytree;

import java.util.ArrayList;

public class FindSum {
	// static List<TreeNode> path = new ArrayList<TreeNode>();
	// public static void findSum(TreeNode d, int sum, List<TreeNode> tPath, int
	// level){
	// if(d==null)
	// return;
	// if(d.getValue() == sum){
	// tPath.add(d);
	// print(tPath);
	// }
	// findSum(d.getLeftNode(), sum-d.getValue(), tPath, level);
	// findSum(d.getRightNode(),sum-d.getValue(), tPath, level);
	//		
	// findSum(d.getLeftNode(), sum, tPath, level+1);
	// findSum(d.getRightNode(),sum, tPath, level+1);
	// }
	// public static void print(List<TreeNode> list){
	// //print
	// }
	// }

	static void findSum(TreeNode head, int sum, ArrayList<Integer> buffer, int level) {
		if (head == null)
			return;
		int tmp = sum;
		buffer.add(head.getValue());
		for (int i = level; i > -1; i--) {
			tmp -= buffer.get(i);
			if (tmp == 0)
				print(buffer, i, level);
		}
		ArrayList<Integer> c1 = (ArrayList<Integer>) buffer.clone();
		ArrayList<Integer> c2 = (ArrayList<Integer>) buffer.clone();
		findSum(head.getLeftNode(), sum, c1, level + 1);
		findSum(head.getRightNode(), sum, c2, level + 1);
	}

	static void print(ArrayList<Integer> buffer, int level, int i2) {
		for (int i = level; i <= i2; i++) {
			System.out.print(buffer.get(i) + "");
		}
		System.out.println();
	}
	public static void main(String s[]){
		//findSum(root, 19, new ArrayList(), 0);
		TreeNode roota = new TreeNode(6);
		TreeNode tempc = new TreeNode(9);
		TreeNode tempd = new TreeNode(2);
		TreeNode tempe = new TreeNode(3);
		TreeNode tempb = new TreeNode(4);
		TreeNode tempf = new TreeNode(1);
		roota.setLeftNode(tempb);
		roota.setRightNode(tempc);
		tempb.setLeftNode(tempd);
		tempd.setRightNode(tempe);
		tempd.setLeftNode(tempf);
		findSum(roota, 6, new ArrayList(), 0);
	}
}