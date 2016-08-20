package com.linkedlist.singly.cycle;

import org.junit.Test;

import com.linkedlist.singly.LinkedList;
import com.linkedlist.singly.ListNode;
import com.linkedlist.singly.cycle.CheckLinkedListHasCycle;

public class CheckLinkedListHasCycleTest {

	@Test
	public void whetherLinkedListHasCycleTest() {

		CheckLinkedListHasCycle checkLinkedListHasCycle = new CheckLinkedListHasCycle();
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
//		node.setNext(linkedList.getHead());

		boolean result = checkLinkedListHasCycle
				.whetherLinkedListHasCycle(linkedList.getHead());
		
		if(result){
			System.out.println("linked list has a cycle");
		}
		else{
			System.out.println("linked list has no cycle");
		}
	}

}
