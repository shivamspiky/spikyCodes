package com.tree.identical;

import com.tree.node.BinaryTreeNode;

public class IdenticalTrees {

	public boolean isIdentical(BinaryTreeNode root1, BinaryTreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}

		if (root1 != null && root2 != null) {
			return (root1.getData() == root2.getData()
					&& isIdentical(root1.getLeft(), root2.getLeft()) && isIdentical(
						root1.getRight(), root2.getRight()));
		}
		return false;
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

		IdenticalTrees identicalTrees = new IdenticalTrees();
		System.out.println(identicalTrees.isIdentical(bnode2, bnode2i));

	}

}
