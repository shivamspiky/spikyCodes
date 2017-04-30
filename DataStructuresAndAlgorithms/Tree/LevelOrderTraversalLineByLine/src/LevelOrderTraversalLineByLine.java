import java.util.LinkedList;
import java.util.Queue;


public class LevelOrderTraversalLineByLine {

	public void traversal(TreeNode root) {
		if(root==null) {
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		queue.add(null);
		
		while(!queue.isEmpty()) {
			TreeNode node = queue.remove();
			if(node==null) {
				System.out.println();
				if(!queue.isEmpty()) {
					queue.add(null);
				}
				continue;
			}
			
			if(node!=null) {
				System.out.print(node.getData()+"\t");
			}
			
			if(node.getLeft()!=null) {
				queue.add(node.getLeft());
			}
			if(node.getRight()!=null) {
				queue.add(node.getRight());
			}
		}
	}
	
	public static void main(String[] args) {
		TreeNode bnode1 = new TreeNode(1);
		TreeNode bnode2 = new TreeNode(2);
		TreeNode bnode3 = new TreeNode(3);
		TreeNode bnode4 = new TreeNode(4);
		TreeNode bnode5 = new TreeNode(5);
		TreeNode bnode6 = new TreeNode(6);
		
		bnode1.setLeft(bnode2);
		bnode1.setRight(bnode3);
		bnode3.setLeft(bnode4);
		bnode3.setRight(bnode5);
		bnode4.setLeft(bnode6);
		
		LevelOrderTraversalLineByLine levelOrderTraversalLineByLine = new LevelOrderTraversalLineByLine();
		levelOrderTraversalLineByLine.traversal(bnode1);
	}
}
