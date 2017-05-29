
public class CheckBalancedTree {

	public boolean isBalanced(TreeNode root) {
		
		if(root == null) {
			return true;
		}
		
		int lHeight = height(root.left);
		int rHeight = height(root.right);
		
		if(lHeight - rHeight >=2 || rHeight - lHeight >=2) {
			return false;
		}
		
		return (isBalanced(root.left) && isBalanced(root.right));
		
	}
	
	
	public boolean isBalancedOptimized(TreeNode root){
		
		Height height = new Height();
		return isBalancedOptimizedUtil(root, height);
	}
	public boolean isBalancedOptimizedUtil(TreeNode root, Height height) {
		
		if(root == null) {
			height.height = 0;
			return true;
		}
		
		Height lheight = new Height();
		Height rheight = new Height();
		
		boolean lcheck = isBalancedOptimizedUtil(root.left,lheight);
		boolean rcheck = isBalancedOptimizedUtil(root.right,rheight);
		
		height.height = lheight.height > rheight.height ? 1 +  lheight.height : 1 + rheight.height;
		if(lheight.height-rheight.height >=2 || rheight.height-lheight.height >=2) {
			return false;
		}
		
		return lcheck && rcheck;
	}
	
	public int height(TreeNode node) {
		
		if(node==null) {
			return 0;
		}
		
		int lheight = height(node.left);
		int rheight = height(node.right);
		
		return (lheight > rheight ? 1 + lheight: 1 + rheight);
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
		bnode1.right=bnode5;
		bnode2.left=bnode3;
		bnode2.right = bnode7;
		bnode3.left=bnode4;
		
		bnode5.left =bnode6;
		//bnode4.left=bnode6;
		//bnode4.right = bnode7;
		
		CheckBalancedTree checkBalancedTree = new CheckBalancedTree();
		
		System.out.println(checkBalancedTree.isBalancedOptimized(bnode1));
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

class Height {
	public int height;
}
