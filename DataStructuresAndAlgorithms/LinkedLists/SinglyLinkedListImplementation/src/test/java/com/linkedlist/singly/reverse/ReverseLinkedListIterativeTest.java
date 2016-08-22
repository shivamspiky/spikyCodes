package com.linkedlist.singly.reverse;

import org.junit.Test;

import com.linkedlist.singly.LinkedList;
import com.linkedlist.singly.ListNode;

public class ReverseLinkedListIterativeTest {

	@Test
	public void reverseLinkedListTest() {

		ReverseLinkedListIterative reverseLinkedListIterative = new ReverseLinkedListIterative();
		LinkedList linkedList = new LinkedList();
		ListNode node = new ListNode(3);
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(5);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(7);
		node.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
//		linkedList.print();
//		linkedList.print();
		
		node = reverseLinkedListIterative.reverseLinkedList(node);
		
		linkedList.print(node);

	}

}
