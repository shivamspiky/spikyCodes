package com.bst.inordersuccessor;

import com.tree.node.BinaryTreeNode;

public class InorderSuccessor {

	public BinaryTreeNode successor(BinaryTreeNode root, BinaryTreeNode node) {
		
		if(root == null || node == null) {
			return null;
		}
		
		if(node.getRight()!=null) {
			node = node.getRight();
			while(node.getLeft()!=null) {
				node = node.getLeft();
			}
			return node;
		}
		
		BinaryTreeNode successor = null;
		while(root!=node) {
			
			if(node.getData() < root.getData()) {
				successor = root;
				root = root.getLeft();
			} else {
				root = root.getRight();
			}
		}
		return successor;
	}
	
	public static void main(String[] args) {
		InorderSuccessor inorderSuccessor = new InorderSuccessor();
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
		
		System.out.println(inorderSuccessor.successor(bnode4, bnode3));
	}
}
