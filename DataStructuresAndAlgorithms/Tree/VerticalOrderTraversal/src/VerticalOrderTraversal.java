import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class VerticalOrderTraversal {

	public void traversal(TreeNode root) {
		
		Queue<AugmentedTreeNode> queue = new LinkedList<AugmentedTreeNode>();
		int min=0,max=0;
		queue.add(new AugmentedTreeNode(root,0));
		HashMap<Integer,List<TreeNode>> map = new HashMap<Integer,List<TreeNode>>();
		
		while(!queue.isEmpty()) {
			AugmentedTreeNode node = queue.remove();
			insertInMap(node,map);
			
			if(node.node.left!=null) {
				queue.add(new AugmentedTreeNode(node.node.left,node.horDist-1));
				if(node.horDist-1 < min) {
					min = node.horDist-1;
				}
			}
			
			if(node.node.right!=null) {
				queue.add(new AugmentedTreeNode(node.node.right,node.horDist+1));
				if(node.horDist+1 > max) {
					max = node.horDist+1;
				}
			}
		}
		
		printVerticalOrder(map,min,max);
	}
	
	private void printVerticalOrder(HashMap<Integer,List<TreeNode>> map, int min, int max) {
		for(int i=min;i<=max;i++) {
			
			List<TreeNode> list = map.get(i);
			for(int j=0;list !=null && j<list.size();j++) {
				System.out.print(list.get(j).data + " ");
			}
		}
	}
	
	private void insertInMap(AugmentedTreeNode augNode, HashMap<Integer,List<TreeNode>> map) {
		
		if(map.get(augNode.horDist)==null) {
			List<TreeNode> list = new ArrayList<TreeNode>();
			list.add(augNode.node);
			map.put(augNode.horDist, list);
		} else {
			List<TreeNode> list = map.get(augNode.horDist);
			list.add(augNode.node);
			map.put(augNode.horDist, list);
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
		
		VerticalOrderTraversal verticalOrderTraversal = new VerticalOrderTraversal();
		verticalOrderTraversal.traversal(bnode1);
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

class AugmentedTreeNode {
	
	TreeNode node;
	int horDist;
	
	public AugmentedTreeNode(TreeNode node, int dist) {
		this.node = node;
		this.horDist=dist;
	}
}

