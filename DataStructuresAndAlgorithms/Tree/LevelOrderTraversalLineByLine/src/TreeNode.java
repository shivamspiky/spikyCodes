
public class TreeNode {
	private int data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(int data){
		this.data=data;
		left=null;
		right = null;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		this.data=data;
	}
	
	public TreeNode getLeft(){
		return this.left;
	}
	
	public void setLeft(TreeNode left) {
		this.left=left;
	}
	
	public TreeNode getRight(){
		return this.right;
	}
	
	public void setRight(TreeNode right){
		this.right= right;
	}

}
