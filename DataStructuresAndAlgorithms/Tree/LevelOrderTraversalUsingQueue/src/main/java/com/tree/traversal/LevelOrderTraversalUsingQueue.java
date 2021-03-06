package com.tree.traversal;

import java.util.LinkedList;
import java.util.Queue;

import com.tree.node.BinaryTreeNode;

public class LevelOrderTraversalUsingQueue {

	public int levelOrderTraversal(BinaryTreeNode root) {

		if(root==null) {
			return Integer.MIN_VALUE;
		}
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		int max = Integer.MIN_VALUE;
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			BinaryTreeNode temp = queue.remove();
			if(temp.getData() > max) {
				max = temp.getData();
			}
			System.out.println(temp.getData());

			if (temp.getLeft() != null) {
				queue.add(temp.getLeft());
			}

			if (temp.getRight() != null) {
				queue.add(temp.getRight());
			}
		}
		
		return max;
		
	}
	
	public static void main(String args[]){
		
		BinaryTreeNode bnode1 = new BinaryTreeNode(6);
		BinaryTreeNode bnode2 = new BinaryTreeNode(5);
		BinaryTreeNode bnode3 = new BinaryTreeNode(4);
		BinaryTreeNode bnode4 = new BinaryTreeNode(3);
		BinaryTreeNode bnode5 = new BinaryTreeNode(2);
		BinaryTreeNode bnode6 = new BinaryTreeNode(1);
		
		bnode1.setLeft(bnode2);
		bnode1.setRight(bnode3);
		bnode2.setLeft(bnode4);
		bnode3.setRight(bnode5);
		bnode4.setLeft(bnode6);
		
		LevelOrderTraversalUsingQueue levelOrderTraversalUsingQueue = new LevelOrderTraversalUsingQueue();
		int max = levelOrderTraversalUsingQueue.levelOrderTraversal(bnode2);
		System.out.println("Max element : "+max);
		
	}

}
