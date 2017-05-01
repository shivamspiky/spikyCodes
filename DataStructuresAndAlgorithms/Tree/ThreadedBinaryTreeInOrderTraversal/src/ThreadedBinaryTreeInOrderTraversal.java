
public class ThreadedBinaryTreeInOrderTraversal {
	
	public void inOrderTraversal(ThreadedTreeNode root) {
		
		if(root==null) {
			return;
		}
		
		ThreadedTreeNode node=getLeftMostChild(root);
		/*every node will have either right child or inorder successor in right
		 * reference.
		 * after printing every node we'can directly get inorder successor
		 * or find the leftmost element in right subtree which will be inorder successor
		 * in case it has right child.If it doesn't then inorder successor in right reference gets
		 * printed
		 * 
		 * hence if condition that if it has inorder successor move to it
		 * or move to lefmost child in right subtree
		 * and repeat the process*/
		while(node!=null) {
			
			System.out.print(node.data+"\t");
			
			if(node.rightThread) {
				node=node.right;
				
			}
			else{
				node=getLeftMostChild(node.right);
			}
			
		}
	}
	
	private ThreadedTreeNode getLeftMostChild(ThreadedTreeNode node) {
		if(node==null) {
			return null;
		}
		
		while(node.left!=null) {
			node=node.left;
		}
		
		return node;
	}
	
	public static void main(String[] args) {
		ThreadedTreeNode node1 = new ThreadedTreeNode(1);
		ThreadedTreeNode node2 = new ThreadedTreeNode(2);
		ThreadedTreeNode node3 = new ThreadedTreeNode(3);
		ThreadedTreeNode node4 = new ThreadedTreeNode(4);
		ThreadedTreeNode node5 = new ThreadedTreeNode(5);
		ThreadedTreeNode node6 = new ThreadedTreeNode(6);
		ThreadedTreeNode node7 = new ThreadedTreeNode(7);
		ThreadedTreeNode node8 = new ThreadedTreeNode(8);
		
		node1.left= node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.right=node7;
		node4.left=node6;
		node4.right=node2;
		node4.rightThread=true;
		node5.rightThread=true;
		node5.right=node1;
		node6.rightThread=true;
		node6.right=node4;
		node7.left=node8;
		node8.rightThread=true;
		node8.right=node7;
		
		ThreadedBinaryTreeInOrderTraversal threadedBinaryTreeInOrderTraversal = new ThreadedBinaryTreeInOrderTraversal();
		threadedBinaryTreeInOrderTraversal.inOrderTraversal(node1);
		
		
	}

}

class ThreadedTreeNode{
	
	public int data;
	public ThreadedTreeNode left;
	public ThreadedTreeNode right;
	public boolean rightThread;
	
	public ThreadedTreeNode(int data){
		this.data = data;
		this.left=null;
		this.right=null;
		this.rightThread=false;
	}
}
