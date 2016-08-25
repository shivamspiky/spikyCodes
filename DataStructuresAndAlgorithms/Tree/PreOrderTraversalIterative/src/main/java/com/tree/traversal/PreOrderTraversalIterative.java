package com.tree.traversal;

import java.util.Stack;

public class PreOrderTraversalIterative {
	
	public void traversal(BinaryTreeNode root){
		
		if(root==null){
			return ;
		}
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		
		stack.push(root);
		
		while(!stack.isEmpty()){
			
			BinaryTreeNode temp = stack.pop();
			System.out.println(temp.getData());
			if(temp.getRight()!=null){
				stack.push(temp.getRight());
			}
			
			if(temp.getLeft()!=null){
				stack.push(temp.getLeft());
			}
		}
	}
	
	public static void main(String args[]){
		
		PreOrderTraversalIterative preOrderTreeTraversal = new PreOrderTraversalIterative();
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
		preOrderTreeTraversal.traversal(node1);
		
	}

}
