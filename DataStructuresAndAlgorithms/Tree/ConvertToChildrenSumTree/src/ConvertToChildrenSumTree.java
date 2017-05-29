
public class ConvertToChildrenSumTree {

	public void convert(TreeNode root) {
		
		if(root==null || (root.left==null && root.right == null)) {
			return;
		}
		
		convert(root.left);
		convert(root.right);
		
		int leftSum=0,rightSum=0;
		
		if(root.left!=null) {
			leftSum=root.left.data;
		}
		
		if(root.right!=null) {
			rightSum = root.right.data;
		}
		int diff = root.data -(leftSum+rightSum);
		if(diff == 0) {
			return;
		}
		
		else if(diff < 0) {
			root.data+=-diff;
		}
		else {
			if(root.left!=null) {
				root.left.data +=diff;
				convert(root.left);
			} 
			else if(root.right!=null) {
				root.right.data +=diff;
				convert(root.right);
			}
		}
	}
	
public void convert1(TreeNode root) {
		
		if(root==null || (root.left==null && root.right == null)) {
			return;
		}
		
		convert(root.left);
		convert(root.right);
		
		int leftSum=0,rightSum=0;
		
		if(root.left!=null) {
			leftSum=root.left.data;
		}
		
		if(root.right!=null) {
			rightSum = root.right.data;
		}
		int diff = root.data -(leftSum+rightSum);
		if(diff == 0) {
			return;
		}
		
		else if(diff < 0) {
			root.data+=-diff;
		}
		else {
			increment(root,diff);
		}
	}

	private void increment(TreeNode node, int diff) {
		if(node.left !=null) {
			node.left.data +=diff;
			increment(node.left,diff);
		}
		
		else if(node.right!=null) {
			node.right.data +=diff;
			increment(node.right,diff);
		}
	}
	
	
	private void inorderTraversal(TreeNode root) {
		if(root==null) {
			return;
		}
		
		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}
	
	public static void main(String[] args) {
		ConvertToChildrenSumTree convertToChildrenSumTree = new ConvertToChildrenSumTree();
		TreeNode bnode1 = new TreeNode(50);
		TreeNode bnode2 = new TreeNode(2);
		TreeNode bnode3 = new TreeNode(13);
		TreeNode bnode4 = new TreeNode(4);
		TreeNode bnode5 = new TreeNode(5);
		TreeNode bnode6 = new TreeNode(46);
		TreeNode bnode7 = new TreeNode(7);
		TreeNode bnode8 = new TreeNode(8);
		bnode1.left=bnode2;
		bnode1.right=bnode3;
		bnode2.left=bnode8;
		bnode3.left=bnode4;
		bnode3.right=bnode5;
		bnode4.left=bnode6;
		bnode4.right = bnode7;
	
		//convertToChildrenSumTree.convert(bnode1);
		convertToChildrenSumTree.convert1(bnode1);
		
		convertToChildrenSumTree.inorderTraversal(bnode1);
		
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

