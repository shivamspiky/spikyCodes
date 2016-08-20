package com.linkedlist.singly.nthnodefromthelast;

import org.junit.Test;

import com.linkedlist.singly.LinkedList;
import com.linkedlist.singly.ListNode;

public class NthNodeFromTheLastNode {

	@Test
	public void nthNodeFromTheLastTest() {

		LinkedList linkedList = new LinkedList();
		ListNode node = new ListNode(3);
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(7);
		linkedList.addBeginning(node);
		linkedList.addBeginning(node1);
		linkedList.addBeginning(node2);
		linkedList.addBeginning(node3);
		linkedList.addBeginning(node4);
	//	linkedList.print();

		NthNodeFromTheLast nthNodeFromTheLast = new NthNodeFromTheLast();
		ListNode result = nthNodeFromTheLast.nthNodeFromTheLast(
				linkedList.getHead(), 5);
		if (result != null) {
			System.out.println(result.getData());
		} else {
			System.out.println("no such node exists in the node");
		}

	}

}
