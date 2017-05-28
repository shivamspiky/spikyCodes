import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;




public class SpiralLevelOrderTraversal {

	public void levelOrder(TreeNode root) {
		if(root==null) {
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);
		Stack<TreeNode> stack = new Stack<TreeNode>();
		boolean useStack = true;
		while(!queue.isEmpty()) {
			TreeNode node = queue.remove();
			if(node==null) {
				printStack(stack);
				if(useStack){
					useStack = false;
				} else {
					useStack = true;
				}
				if(!queue.isEmpty()) {
					queue.add(null);
				}
			} else {
				
				if(useStack) {
					stack.push(node);
				} else {
					System.out.print(node.data + "\t");
				}
				
				if(node.left!=null) {
					queue.add(node.left);
				}
				
				if(node.right!=null) {
					queue.add(node.right);
				}
			}
		}
	}
	
	private void printStack(Stack<TreeNode> stack) {
		
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().data + "\t");
		}
	}
	
	public static void main(String[] args) {
		TreeNode bnode1 = new TreeNode(1);
		TreeNode bnode2 = new TreeNode(2);
		TreeNode bnode3 = new TreeNode(3);
		TreeNode bnode4 = new TreeNode(4);
		TreeNode bnode5 = new TreeNode(5);
		TreeNode bnode6 = new TreeNode(6);
		TreeNode bnode7 = new TreeNode(7);
		TreeNode bnode8 = new TreeNode(8);
		bnode1.left=bnode2;
		bnode1.right=bnode3;
		bnode2.left=bnode8;
		bnode3.left=bnode4;
		bnode3.right=bnode5;
		bnode4.left=bnode6;
		bnode4.right = bnode7;
		
		SpiralLevelOrderTraversal spiralLevelOrderTraversal = new SpiralLevelOrderTraversal();
		spiralLevelOrderTraversal.levelOrder(bnode1);
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
