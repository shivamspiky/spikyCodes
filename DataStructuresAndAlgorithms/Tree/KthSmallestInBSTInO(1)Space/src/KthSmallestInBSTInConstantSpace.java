public class KthSmallestInBSTInConstantSpace {
	
	/*inorder traversal through morris traversal
	 * 
	 * before going to left subtree find a way to come back to root
	 * which is by making right of inorder predecessor of root as root*/
	public TreeNode kthSmallest(TreeNode root, int k) {
		TreeNode current = root;
		
		int count=0;
		while(current!=null) {
			
			if(current.left==null) {
				count++;
				if(count==k) {
					return current;
				} else {
					current = current.right;
				}
				
			}
			else {
				TreeNode predec = findPredecessor(current);
				if(predec.right==current) {
					predec.right = null;
					count++;
					if(count==k) {
						return current;
					} else {
						current = current.right;
					}
				} else {
					predec.right = current;
					current = current.left;
				}
			}
		}
		
		return null;
	}
	
	private TreeNode findPredecessor(TreeNode current) {
		
		TreeNode node=current.left;
		while(node.right!=null && node.right!=current) {
			node = node.right;
		}
		
		return node;
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
		
		KthSmallestInBSTInConstantSpace kthSmallestInBST = new KthSmallestInBSTInConstantSpace();
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
		if((node=kthSmallestInBST.kthSmallest(bnode1, 7)) !=null) {
			System.out.println("kth smallest node " + node.data);
		}
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

class Smallest {
	int smallest;
}

class Count {
	int k;
	
	public Count(int k) {
		this.k = k;
	}
}