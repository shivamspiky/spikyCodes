
public class BSTKeysInGivenRange {

	public void range(TreeNode root, int k1, int k2) {
		
		if(root==null) {
			return;
		}
		
		if(root.data >=k1) {
			range(root.left,k1,k2);
		}
		
		if(root.data >=k1 && root.data <=k2) {
			System.out.print(root.data + " ");
		}
		
		if(root.data <=k2) {
			range(root.right,k1,k2);
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
		
		BSTKeysInGivenRange bstKeysInGivenRange = new BSTKeysInGivenRange();
		TreeNode root = null;
		root = bstKeysInGivenRange.insert(root, bnode1);
		root = bstKeysInGivenRange.insert(root, bnode2);
		root = bstKeysInGivenRange.insert(root, bnode3);
		root = bstKeysInGivenRange.insert(root, bnode4);
		root = bstKeysInGivenRange.insert(root, bnode5);
		root = bstKeysInGivenRange.insert(root, bnode6);
		root = bstKeysInGivenRange.insert(root, bnode7);
		
		bstKeysInGivenRange.range(root, 11, 28);
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