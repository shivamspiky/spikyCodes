
public class ChildrenSumPropertyCheck {

	public boolean property(TreeNode root) {
		
		if(root==null || (root.left==null && root.right==null)) {
			return true;
		}
		int leftSum=0,rightSum=0;
		if(root.left!=null) {
			leftSum=root.left.data;
		}
		
		if(root.right!=null) {
			rightSum = root.right.data;
		}
		
		if(root.data == leftSum+rightSum && property(root.left) && property(root.right)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		TreeNode bnode1 = new TreeNode(26);
		TreeNode bnode2 = new TreeNode(8);
		TreeNode bnode3 = new TreeNode(18);
		TreeNode bnode4 = new TreeNode(13);
		TreeNode bnode5 = new TreeNode(5);
		TreeNode bnode6 = new TreeNode(6);
		TreeNode bnode7 = new TreeNode(7);
		TreeNode bnode8 = new TreeNode(8);
		bnode1.left=bnode2;
		bnode1.right=bnode3;
		bnode2.left=bnode8;
		bnode3.left=bnode4;
		bnode3.right=bnode5;
		bnode4.left=bnode6;
		bnode4.right = bnode7;
		
		ChildrenSumPropertyCheck  childrenSumPropertyCheck = new ChildrenSumPropertyCheck();
		
		System.out.println(childrenSumPropertyCheck.property(bnode1));
	}
}


class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data){
		this.data=data;
		left=null;
		right = null;
	}
}

