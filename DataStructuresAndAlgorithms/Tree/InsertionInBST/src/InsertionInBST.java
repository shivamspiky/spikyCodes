public class InsertionInBST {

	public BSTNode insertRec(BSTNode root, int key) {
		if(root==null) {
			root = new BSTNode(key);
			return root;
		}
		
		if(key < root.data) {
			root.left= insertRec(root.left,key);
		} else {
			root.right= insertRec(root.right,key);
		}
		
		return root;
	}
	
	public BSTNode insert(BSTNode root, int key) {
		
		if(root ==null) {
			root = new BSTNode(key);
			return root;
		}
		BSTNode prev = null;
		BSTNode temp = root;
		while(temp!=null) {
			prev = temp;
			if(key < temp.data) {
				temp= temp.left;
				
			} else {
				temp= temp.right;
			}
		}
		
		temp = new BSTNode(key);
		if(key < prev.data) {
			prev.left=temp;
		} else{
			prev.right = temp;
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
		InsertionInBST insertion = new InsertionInBST();
		
		BSTNode root = insertion.insert(null, 1);
		root = insertion.insert(root,2);
		root = insertion.insert(root,13);
		root = insertion.insert(root,11);
		root = insertion.insert(root,5);
		root = insertion.insert(root,6);
		
		insertion.traversal(root);
	}
}

class BSTNode {
	public int data;
	public BSTNode left;
	public BSTNode right;
	
	public BSTNode(int data) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
