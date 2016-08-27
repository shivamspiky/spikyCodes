package com.tree.paths;

import com.tree.node.BinaryTreeNode;

public class PathWithGivenSum {

	public boolean isPathExists(BinaryTreeNode root, int sum) {

		if (root == null) {
			return false;
		}
		if (root.getLeft() == null && root.getRight() == null && root.getData() == sum) {

			return true;
		}
		
		return isPathExists(root.getLeft(), sum - root.getData())
				|| isPathExists(root.getRight(), sum - root.getData());
	}

	public static void main(String args[]) {
		BinaryTreeNode bnode1 = new BinaryTreeNode(1);
		BinaryTreeNode bnode2 = new BinaryTreeNode(2);
		BinaryTreeNode bnode3 = new BinaryTreeNode(3);
		BinaryTreeNode bnode4 = new BinaryTreeNode(4);
		BinaryTreeNode bnode5 = new BinaryTreeNode(5);
		BinaryTreeNode bnode6 = new BinaryTreeNode(6);
		BinaryTreeNode bnode7 = new BinaryTreeNode(7);
		BinaryTreeNode bnode8 = new BinaryTreeNode(8);
		BinaryTreeNode bnode9 = new BinaryTreeNode(9);

		bnode1.setLeft(bnode2);
		bnode1.setRight(bnode3);
		bnode2.setLeft(bnode4);
		bnode3.setLeft(bnode8);
		bnode3.setRight(bnode5);
		bnode4.setLeft(bnode6);
		bnode4.setRight(bnode9);
		bnode6.setRight(bnode7);

		PathWithGivenSum pathWithSum = new PathWithGivenSum();
		System.out.println(pathWithSum.isPathExists(bnode1, 9));
	}

}
