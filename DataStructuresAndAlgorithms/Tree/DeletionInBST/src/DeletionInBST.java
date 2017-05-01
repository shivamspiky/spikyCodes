public class DeletionInBST {

	
	/*delete the key in tree starting with root and returns new root
	 * 
	 * thereofore if key==root and root has no child
	 * then return null
	 * 
	 * if key==root and it has only one child,
	 * return the other child
	 * if key==root and it has both child
	 * 
	 * set predecessor of root as root and call
	 * same the function on righ subtree to delete
	 * predec
	 * 
	 * if key doesn't root
	 * then move either to left or right
	 * and capture the new left subtree or right subtree
	 * in their respective reference due to deletion*/
	
	public BSTNode delete(BSTNode root, int key) {
		if(root==null) {
			return root;
		}
		
		if(root.data==key) {
			if(root.left==null && root.right==null) {
				root=null;
			}
			
			else if(root.right==null) {
				return root.left;
			}
			else if(root.left==null) {
				return root.right;
			}
			else {
				BSTNode pre=min(root.right);
				root.data = pre.data;
				root.right= delete(root.right,pre.data);
			}
		}
		
		else {
			if(key < root.data) {
				root.left=delete(root.left,key);
			}
			else {
				root.right = delete(root.right,key);
			}
		}
		
		return root;
	}
	
	private void swap(BSTNode node1,BSTNode node2) {
		int temp = node1.data;
		node1.data = node2.data;
		node2.data = temp;
	}
	
	public BSTNode min(BSTNode node) {
		if(node==null) {
			return null;
		}
		while(node.left!=null) {
			node=node.left;
		}
		return node;
	}
	public BSTNode insert(BSTNode root, int key) {
		if(root==null) {
			root = new BSTNode(key);
			return root;
		}
		
		if(key < root.data) {
			root.left= insert(root.left,key);
		} else {
			root.right= insert(root.right,key);
		}
		
		return root;
	}
	
	
	public void traversal(BSTNode node) {
		
		if(node==null) {
			return;
		} 
		
		traversal(node.left);
		System.out.print(node.data + "\t");
		traversal(node.right);

	}
	
	public static void main(String[] args) {
		DeletionInBST deletion = new DeletionInBST();
		
		BSTNode root = deletion.insert(null, 1);
		root = deletion.insert(root,2);
		root = deletion.insert(root,13);
		root = deletion.insert(root,11);
		root = deletion.insert(root,5);
		root = deletion.insert(root,6);
		root = deletion.insert(root, 15);
		deletion.traversal(root);
		
		deletion.delete(root,13);
		System.out.println();
		deletion.traversal(root);
	}
}

class BSTNode {
	public int data;
	public BSTNode left;
	public BSTNode right;
	
	public BSTNode(int data) {
		this.data = data;
	}
}
