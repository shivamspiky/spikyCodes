package com.tree.traversal;

import com.tree.node.BinaryTreeNode;

public class PreOrderTraversalRecursive {

	public void preOrderTraversal(BinaryTreeNode root){
		
		if(root==null){
			return;
		}
		
		System.out.println(root.getData());
		preOrderTraversal(root.getLeft());
		preOrderTraversal(root.getRight());
	}
	
	public static void main(String args[]){
		
		PreOrderTraversalRecursive preOrderTreeTraversal = new PreOrderTraversalRecursive();
		BinaryTreeNode node1 = new BinaryTreeNode(1);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node5.setRight(node6);
		preOrderTreeTraversal.preOrderTraversal(node1);
		
	}
}
