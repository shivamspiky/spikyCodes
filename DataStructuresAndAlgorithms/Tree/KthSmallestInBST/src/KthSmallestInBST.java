public class KthSmallestInBST {
	
	/*motivation:
	 * inorder traversal of bst produces 
	 * elements in sorted order
	 * hence we need to return kth element
	 * visited in inorder traversal
	 * 
	 * */
	public TreeNode inorderMethod(TreeNode root, Count count) {
		
		if(root==null) {
			return root;
		}
		
		TreeNode leftNode = inorderMethod(root.left,count);
		if(leftNode!=null) {
			return leftNode;
		}
		count.k--;
		if(count.k==0) {
			return root;
		}
		TreeNode  rightNode = inorderMethod(root.right,count);
		if(rightNode!=null) {
			return rightNode;
		}
		
		return null;
	}
	
	public TreeNode recursiveMethod(TreeNode root, int k) {
	
		if(root==null) {
			return null;
		}
		if(root.leftCount+1==k) {
			return root;
		}
		
		else if(root.leftCount+1> k) {
			return recursiveMethod(root.left, k);
		}
		else {
			return recursiveMethod(root.right,k-(root.leftCount+1));
		}
	}
	
	public TreeNode insert(TreeNode root, TreeNode node) {
		if(root == null) {
			return node;
		}
		
		if(node==null) {
			return root;
		}
		
		if(root.data < node.data) {
			root.right = insert(root.right,node);
		}else {
			root.left = insert(root.left,node);
			root.leftCount++;
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		TreeNode bnode1 = new TreeNode(26);
		TreeNode bnode2 = new TreeNode(8);
		TreeNode bnode3 = new TreeNode(18);
		TreeNode bnode4 = new TreeNode(13);
		TreeNode bnode5 = new TreeNode(5);
		TreeNode bnode6 = new TreeNode(6);
		TreeNode bnode7 = new TreeNode(7);
		
		KthSmallestInBST kthSmallestInBST = new KthSmallestInBST();
		TreeNode root = null;
		root = kthSmallestInBST.insert(root, bnode1);
		root = kthSmallestInBST.insert(root, bnode2);
		root = kthSmallestInBST.insert(root, bnode3);
		root = kthSmallestInBST.insert(root, bnode4);
		root = kthSmallestInBST.insert(root, bnode5);
		root = kthSmallestInBST.insert(root, bnode6);
		root = kthSmallestInBST.insert(root, bnode7);
		
		Count count = new Count(2);
		TreeNode node = null;
		if((node=kthSmallestInBST.inorderMethod(bnode1, count)) !=null) {
			System.out.println("Inorder Method " + node.data);
		}
		
		if((node=kthSmallestInBST.recursiveMethod(bnode1, 2)) !=null) {
			System.out.println("recursive method " + node.data);
		}
		
	}
}

class TreeNode {
	int data;
	int leftCount;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data){
		this.data=data;
		left=null;
		right = null;
	}
}

class Smallest {
	int smallest;
}

class Count {
	int k;
	
	public Count(int k) {
		this.k = k;
	}
}