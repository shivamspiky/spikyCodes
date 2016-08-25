package com.tree.maxelement;

public class MaximumElement {
	public int maxElement(BinaryTreeNode root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}

		int leftMax = maxElement(root.getLeft());
		int rightMax = maxElement(root.getRight());
		int max = Integer.MIN_VALUE;
		if (leftMax > rightMax) {
			max = leftMax;
		} else {
			max = rightMax;
		}

		if (max < root.getData()) {
			max = root.getData();
		}

		return max;
	}

	public static void main(String args[]) {
		BinaryTreeNode bnode1 = new BinaryTreeNode(6);
		BinaryTreeNode bnode2 = new BinaryTreeNode(5);
		BinaryTreeNode bnode3 = new BinaryTreeNode(4);
		BinaryTreeNode bnode4 = new BinaryTreeNode(3);
		BinaryTreeNode bnode5 = new BinaryTreeNode(2);
		BinaryTreeNode bnode6 = new BinaryTreeNode(1);
		BinaryTreeNode bnode7 = new BinaryTreeNode(11);

		bnode1.setLeft(bnode2);
		bnode1.setRight(bnode3);
		bnode2.setLeft(bnode4);
		bnode3.setRight(bnode5);
		bnode4.setLeft(bnode6);
		bnode6.setRight(bnode7);

		MaximumElement maxElement = new MaximumElement();
		int max = maxElement.maxElement(null);
		System.out.println(max);
	}
}
