
public class FutureReservationInBST {

	
	public BSTNode insert(BSTNode root, int time, int k) {
		
		if(root==null) {
			root = new BSTNode(time);
			return root;
		}
		
		if(root.data >= time -k && root.data <=time+k ){
			return root;
		}
		else if(root.data < time) {
			root.right = insert(root.right,time,k);
		}else {
			root.left = insert(root.left,time,k);
		}
		
		return root;
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
