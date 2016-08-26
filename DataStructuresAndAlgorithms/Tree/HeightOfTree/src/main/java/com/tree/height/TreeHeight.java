package com.tree.height;

import com.tree.node.BinaryTreeNode;

public class TreeHeight {

	public int height(BinaryTreeNode root) {

		if (root == null) {
			return 0;
		}
		int lheight = height(root.getLeft());
		int rheight = height(root.getRight());

		return (lheight > rheight ? 1 + lheight : 1 + rheight);
	}

	public static void main(String args[]) {

		BinaryTreeNode bnode1 = new BinaryTreeNode(6);
		BinaryTreeNode bnode2 = new BinaryTreeNode(5);
		BinaryTreeNode bnode2i = new BinaryTreeNode(5);
		BinaryTreeNode bnode3 = new BinaryTreeNode(4);
		BinaryTreeNode bnode3i = new BinaryTreeNode(4);
		BinaryTreeNode bnode4 = new BinaryTreeNode(3);
		BinaryTreeNode bnode4i = new BinaryTreeNode(3);
		BinaryTreeNode bnode5 = new BinaryTreeNode(2);
		BinaryTreeNode bnode5i = new BinaryTreeNode(2);
		BinaryTreeNode bnode6 = new BinaryTreeNode(1);
		BinaryTreeNode bnode6i = new BinaryTreeNode(1);

		bnode1.setLeft(bnode2);
		bnode1.setRight(bnode3);
		bnode2.setLeft(bnode4);
		bnode2i.setLeft(bnode4i);
		bnode3.setRight(bnode5);
		bnode4.setLeft(bnode6);
		bnode4i.setLeft(bnode6i);

		TreeHeight treeHeight = new TreeHeight();
		System.out.println(treeHeight.height(bnode4));

	}
}
