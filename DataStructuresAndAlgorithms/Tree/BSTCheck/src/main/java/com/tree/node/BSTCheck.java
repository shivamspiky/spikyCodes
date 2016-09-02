package com.tree.node;


public class BSTCheck {

	int prev = Integer.MIN_VALUE;
	public boolean whetherBST(BinaryTreeNode root){
		if(root == null){
			return true;
		}
		
		if(!whetherBST(root.getLeft())){
			return false;
		}
		
		if(root.getData() < prev){
			return false;
		}
		
		prev = root.getData();
		
		return whetherBST(root.getRight());
		
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
		
		BSTCheck bst = new BSTCheck();
		boolean result = bst.whetherBST(bnode4);
		
		System.out.println(result);
		
	}
}
