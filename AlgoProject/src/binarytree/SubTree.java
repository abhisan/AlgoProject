package binarytree;

public class SubTree {
	public static boolean containsTree(TreeNode t1, TreeNode t2){
		if((t1==null && t2!=null))
			return false;
		else if(t1!=null && t2==null)
			return true;
		else if(t1==null && t2==null)
			return true;
		else if(t1.getValue() == t2.getValue())
			return containsTree(t1.getLeftNode(), t2.getLeftNode())&& containsTree(t1.getRightNode(),t2.getRightNode()); 
		else
			return containsTree(t1.getLeftNode(), t2) || containsTree(t1.getRightNode(), t2); 
	}
	public static void main(String s[]){
		TreeNode roota = new TreeNode(6);
		TreeNode tempc = new TreeNode(9);
		TreeNode tempd = new TreeNode(2);
		TreeNode tempe = new TreeNode(3);
		TreeNode tempb = new TreeNode(4);

		
		roota.setLeftNode(tempb);
		roota.setRightNode(tempc);
		tempb.setLeftNode(tempd);
		tempd.setRightNode(tempe);
		
		TreeNode rootaa = new TreeNode(6);
		TreeNode tempca = new TreeNode(9);
		TreeNode tempda = new TreeNode(2);
		TreeNode tempea = new TreeNode(3);
		TreeNode tempba = new TreeNode(4);
		TreeNode tempbf = new TreeNode(1);

		rootaa.setLeftNode(tempba);
		rootaa.setRightNode(tempca);
		tempba.setLeftNode(tempda);
		tempda.setRightNode(tempea);
		//tempda.setLeftNode(tempbf);
		
		
		System.out.print(containsTree(roota, tempba));
	}
}
//Complexity
//O(n*k)  O(n+k*m)