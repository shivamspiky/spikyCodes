package com.bst.inorderpredecessor;

import com.tree.node.BinaryTreeNode;

public class InorderPredecessor {

	public BinaryTreeNode predecessor(BinaryTreeNode root, BinaryTreeNode node) {
		if (root == null || node == null) {
			return null;
		}

		if (node.getLeft() != null) {
			node = node.getLeft();

			while (node.getRight() != null) {
				node = node.getRight();
			}
			return node;
		}

		BinaryTreeNode predecessor = null;

		/*
		 * if a node doesn't have left subtree then its inorder predecessor is the nearest ancestor for which this node
		 * would be in right subtree (to remember for inorder predecessor this node is inorder successor where would sucessor be in right subtree 
		 * so whenever moving to right subtree we need to keep of node/ancestor as it could be the nearest ancestor for our node would be in right subtree)
		 * */
		while (root != node) {							
														
			if (node.getData() > root.getData()) {

				predecessor = root;
				root = root.getRight();
			} else {
				root = root.getLeft();
			}
		}

		return predecessor;
	}
	
	public static void main(String[] args) {
		InorderPredecessor inorderPredecessor = new InorderPredecessor();
		
		BinaryTreeNode bnode1 = new BinaryTreeNode(1);
		BinaryTreeNode bnode2 = new BinaryTreeNode(2);
		BinaryTreeNode bnode3 = new BinaryTreeNode(3);
		BinaryTreeNode bnode4 = new BinaryTreeNode(4);
		BinaryTreeNode bnode5 = new BinaryTreeNode(5);
		BinaryTreeNode bnode6 = new BinaryTreeNode(6);
		BinaryTreeNode bnode7 = new BinaryTreeNode(11);

		bnode4.setLeft(bnode2);
		bnode2.setLeft(bnode1);
		bnode2.setRight(bnode3);
		bnode4.setRight(bnode6);
		bnode6.setLeft(bnode5);
		bnode6.setRight(bnode7);
		
		System.out.println(inorderPredecessor.predecessor(bnode4, bnode6));
		
	}

}
