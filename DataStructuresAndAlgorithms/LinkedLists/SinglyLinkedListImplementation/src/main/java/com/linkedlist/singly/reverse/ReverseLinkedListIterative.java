package com.linkedlist.singly.reverse;

import com.linkedlist.singly.ListNode;

public class ReverseLinkedListIterative {
	
	public ListNode reverseLinkedList(ListNode head){
		
		if(head == null) {
			return null;
		}
		ListNode prev = null;
		ListNode current = head;
		ListNode next = head.getNext();
		
		while(next!=null){
			
			current.setNext(prev);
			prev = current;
			current = next;
			next = next.getNext();
		}
		
		current.setNext(prev);
		return current;
	}

}
