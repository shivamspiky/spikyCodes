package com.tree.LCA;

import com.tree.node.BinaryTreeNode;

public class LCAOfBST {

	public BinaryTreeNode binarySearchTree(BinaryTreeNode root,
			BinaryTreeNode node1, BinaryTreeNode node2) {
		if (root == null) {
			return null;
		}

		if (root.getData() == node1.getData()
				|| root.getData() == node2.getData()) {
			return root;
		}

		if (root.getData() < Math.min(node1.getData(), node2.getData())) {
			return binarySearchTree(root.getRight(), node1, node2);
		}

		else if (root.getData() > Math.max(node1.getData(), node2.getData())) {
			return binarySearchTree(root.getLeft(), node1, node2);
		}

		else {
			return root;
		}

	}
	
	public static void main(String[] args){
		
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
		
		LCAOfBST lca = new LCAOfBST();
		BinaryTreeNode result = lca.binarySearchTree(bnode4, bnode2, bnode7);
		
		System.out.println(result);
		
	}

}
