package com.tree.height;

import java.util.LinkedList;
import java.util.Queue;

import com.tree.node.BinaryTreeNode;

public class TreeHeight {

	public int height(BinaryTreeNode root){
		
		if(root==null){
			return 0;
		}
		
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		
		int count = 1;
		queue.add(root);
		queue.add(null);
		
		while(!queue.isEmpty()){
			
			BinaryTreeNode current = queue.remove();
			if(current == null){
				if(!queue.isEmpty()){
					count ++;
					queue.add(null);
				}
			}
			else{
				
				/*
				 * 
				 * only modification required to return minimum depth. Minimum depth is depth when
				 * we first encounter a leaf node 
				 * */
				
				if (current.getLeft()==null && current.getRight()==null) {
					 		break;	
					  }
				if(current.getLeft()!=null){
					queue.add(current.getLeft());
				}
				
				if(current.getRight()!=null){
					queue.add(current.getRight());
				}
				
			}
		}
		return count;
	}
	
	
	public static void main(String args[]){
		
		BinaryTreeNode bnode1 = new BinaryTreeNode(1);
		BinaryTreeNode bnode2 = new BinaryTreeNode(2);
		BinaryTreeNode bnode3 = new BinaryTreeNode(3);
		BinaryTreeNode bnode4 = new BinaryTreeNode(4);
		BinaryTreeNode bnode5 = new BinaryTreeNode(5);
		BinaryTreeNode bnode6 = new BinaryTreeNode(6);
		
		bnode1.setLeft(bnode2);
		bnode1.setRight(bnode3);
		bnode3.setLeft(bnode4);
		bnode3.setRight(bnode5);
		bnode4.setLeft(bnode6);
		
		
		TreeHeight treeHeight = new TreeHeight();
		
		System.out.println(treeHeight.height(bnode1));
		
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.add(null);
		queue.add(null);
		
		if(queue.isEmpty()){
			System.out.println("Queue is empty");
		}else{
			System.out.println("Queue is not empty");
		}
		
		
	}

}
