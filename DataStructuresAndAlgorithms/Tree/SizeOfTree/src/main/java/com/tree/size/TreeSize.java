package com.tree.size;

import com.tree.node.BinaryTreeNode;

public class TreeSize {

	public int size(BinaryTreeNode root) {
		if (root == null) {
			return 0;
		}

		return 1 + size(root.getLeft()) + size(root.getRight());
	}

	public static void main(String args[]) {

		TreeSize treeSize = new TreeSize();
		BinaryTreeNode node1 = new BinaryTreeNode(1);
		BinaryTreeNode node2 = new BinaryTreeNode(2);
		BinaryTreeNode node3 = new BinaryTreeNode(3);
		BinaryTreeNode node4 = new BinaryTreeNode(4);
		BinaryTreeNode node5 = new BinaryTreeNode(5);
		BinaryTreeNode node6 = new BinaryTreeNode(6);
		BinaryTreeNode node7 = new BinaryTreeNode(7);
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node5.setRight(node6);
		node6.setLeft(node7);
		int size = treeSize.size(node2);
		System.out.println(size);

	}

}
