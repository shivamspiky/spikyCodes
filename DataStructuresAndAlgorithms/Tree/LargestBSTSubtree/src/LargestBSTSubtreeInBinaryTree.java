
public class LargestBSTSubtreeInBinaryTree {

	public int inorderMethod(TreeNode root) {
		
		if(isBST(root)) {
			return size(root);
		}
		
		return Math.max(inorderMethod(root.left),inorderMethod(root.right));
	}
	
	private boolean isBST(TreeNode node) {
		
		return isBSTUtil(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private boolean isBSTUtil(TreeNode node, int min, int max) {
		if(node==null) {
			return true;
		}
		
		return (node.data > min && node.data < max && isBSTUtil(node.left,min,node.data) && isBSTUtil(node.right,node.data,max));
	}
	
	private int size(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		return 1 + size(root.left) + size(root.right);
	}
	
	
	public int optimizedMethod(TreeNode root) {
		
		SubTreeInfo subtreeInfo = optimizedMethodUtil(root);
		return subtreeInfo.size;
	}
	
	private SubTreeInfo optimizedMethodUtil(TreeNode root) {
		
		if(root == null) {
			SubTreeInfo subtreeInfo = new SubTreeInfo();
			subtreeInfo.isBST=true;
			subtreeInfo.min = Integer.MAX_VALUE;
			subtreeInfo.max = Integer.MIN_VALUE;
			subtreeInfo.size = 0;
			return subtreeInfo;
		}
		SubTreeInfo leftSubtreeInfo = optimizedMethodUtil(root.left);
		SubTreeInfo rightSubtreeInfo = optimizedMethodUtil(root.right);
		SubTreeInfo subtreeInfo = new SubTreeInfo();
		if(leftSubtreeInfo.isBST && rightSubtreeInfo.isBST && root.data > leftSubtreeInfo.max && root.data < rightSubtreeInfo.min) {
			subtreeInfo.isBST=true;
			subtreeInfo.min = Math.min(leftSubtreeInfo.min,root.data);
			subtreeInfo.max = Math.max(rightSubtreeInfo.max,root.data);
			subtreeInfo.size = 1 + leftSubtreeInfo.size+rightSubtreeInfo.size;
		}
		
		else {
			subtreeInfo.isBST=false;
			subtreeInfo.size = Math.max(leftSubtreeInfo.size, rightSubtreeInfo.size);
		} 
		
		return subtreeInfo;
	}
	
	public static void main(String[] args) {
		
        TreeNode root = new TreeNode(50);
        root.left =new TreeNode(10);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(20);
        root.right.left = new TreeNode(55);
        root.right.left.left = new TreeNode(45);
        root.right.right = new TreeNode(70);
        root.right.right.left = new TreeNode(65);
        root.right.right.right = new TreeNode(80);
        
        LargestBSTSubtreeInBinaryTree largestBSTSubtreeInBinaryTree = new LargestBSTSubtreeInBinaryTree();
        System.out.println(largestBSTSubtreeInBinaryTree.inorderMethod(root));
        
        root.data = 2;
        root.left =new TreeNode(1);
        root.right = new TreeNode(3);
        
        
        System.out.println(largestBSTSubtreeInBinaryTree.optimizedMethod(root));
        
	}
}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
	}
}

class SubTreeInfo {
	boolean isBST;
	int min;
	int max;
	int size;
}
