
public class IterativeInorderWithoutStack {

	public void iterativeInorder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		TreeNode current = root;
		
		while(current!=null) {
			
			if(current.left==null) {
				System.out.print(current.data+"\t");
				current=current.right;
			}
			else {
				TreeNode pre = current.left;
				while(pre.right!=null && pre.right!=current) {
					pre=pre.right;
				}
				
				if(pre.right==null) {
					pre.right=current;
					current=current.left;
				}
				else{
					System.out.print(current.data+"\t");
					pre.right=null;
					current=current.right;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		IterativeInorderWithoutStack iterativeInorder = new IterativeInorderWithoutStack();
		
		TreeNode node1= new TreeNode(1);
		TreeNode node2= new TreeNode(2);
		TreeNode node3= new TreeNode(3);
		TreeNode node4= new TreeNode(4);
		TreeNode node5= new TreeNode(5);
		
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		
		
		iterativeInorder.iterativeInorder(node1);
		
	}
	
}

class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
