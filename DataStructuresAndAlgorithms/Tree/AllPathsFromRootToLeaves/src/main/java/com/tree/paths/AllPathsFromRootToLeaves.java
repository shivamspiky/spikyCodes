package com.tree.paths;

import com.tree.node.BinaryTreeNode;

public class AllPathsFromRootToLeaves {

	public void allPaths(BinaryTreeNode root, int[] arr, int length) {

		if (root == null) {
			return;
		}

		arr[length] = root.getData();

		length++;

		if (root.getLeft() == null && root.getRight() == null) {
			printPaths(arr, length);
		}

		if (root.getLeft() != null) {
			allPaths(root.getLeft(), arr, length);
		}

		if (root.getRight() != null) {
			allPaths(root.getRight(), arr, length);
		}
	}

	private void printPaths(int[] arr, int length) {

		for (int i = 0; i < length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println("");
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

		int[] arr = new int[100];
		AllPathsFromRootToLeaves allPathsFromRootToLeaves = new AllPathsFromRootToLeaves();
		allPathsFromRootToLeaves.allPaths(bnode1, arr, 0);
	}

}
