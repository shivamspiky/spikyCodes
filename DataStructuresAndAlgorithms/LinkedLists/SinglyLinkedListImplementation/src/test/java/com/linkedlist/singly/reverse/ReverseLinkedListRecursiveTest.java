package com.linkedlist.singly.reverse;

import org.junit.Test;

import com.linkedlist.singly.LinkedList;
import com.linkedlist.singly.ListNode;

public class ReverseLinkedListRecursiveTest {

	@Test
	public void reverseLinkedListTest() {
		ReverseLinkedListRecursive reverseLinkedListRecursive = new ReverseLinkedListRecursive();
		LinkedList linkedList = new LinkedList();
		ListNode node = new ListNode(3);
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(7);
//		linkedList.addBeginning(node);
//		linkedList.addBeginning(node1);
//		linkedList.addBeginning(node2);
//		linkedList.addBeginning(node3);
//		linkedList.addBeginning(node4);
//		
////		linkedList.print(linkedList.getHead());
////		linkedList.print();
//		
//		linkedList.reverseLinkedListRecursive(linkedList.getHead(), null);
//		
////		linkedList.print(linkedList.getHead());
//		linkedList.displayInReverseOrder(linkedList.getHead());
		
		node.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		//ListNode head = linkedList.pairWiseReverseRecursive(node);
		ListNode head = linkedList.pairwiseReverseIterative(node);
		linkedList.print(head);
		
	}

}
