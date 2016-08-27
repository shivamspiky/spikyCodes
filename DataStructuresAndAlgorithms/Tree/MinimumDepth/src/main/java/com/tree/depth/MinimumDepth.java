package com.tree.depth;

import java.util.LinkedList;
import java.util.Queue;

import com.tree.node.BinaryTreeNode;

public class MinimumDepth {
	
	public int minDepth(BinaryTreeNode root) {
		if(root == null){
			return 0;
		}
		
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(root);
		queue.add(null);
		int count = 1;
		while(!queue.isEmpty()){
			BinaryTreeNode current = queue.remove();
			if(current==null){
				if(!queue.isEmpty()){
					count ++;
					queue.add(null);
				}
			}
			else{
				if(current.getLeft()==null && current.getRight() == null){
					return count;
				}
				
				if(current.getLeft()!=null){
					queue.add(current.getLeft());
				}
				if(current.getRight()!=null){
					queue.add(current.getRight());
				}
			}
		}
		
		return count;
	}

	public static void main(String args[]) {

		BinaryTreeNode bnode1 = new BinaryTreeNode(1);
		BinaryTreeNode bnode2 = new BinaryTreeNode(2);
		BinaryTreeNode bnode3 = new BinaryTreeNode(3);
		BinaryTreeNode bnode4 = new BinaryTreeNode(4);
		BinaryTreeNode bnode5 = new BinaryTreeNode(5);
		BinaryTreeNode bnode6 = new BinaryTreeNode(6);

		bnode1.setLeft(bnode2);
		bnode1.setRight(bnode3);
		bnode2.setLeft(bnode4);
		bnode3.setRight(bnode5);
		bnode4.setLeft(bnode6);

		MinimumDepth minDepth = new MinimumDepth();

		System.out.println(minDepth.minDepth(bnode1));
	}

}
