package com.linkedlist.singly.reverse;

import com.linkedlist.singly.ListNode;

public class ReverseLinkedListRecursive {
	
	public ListNode reverseLinkedList(ListNode head,ListNode prev){
		
		ListNode temp = head.getNext();
		head.setNext(prev);
		
		if(temp!=null){
			prev = head;
			reverseLinkedList(temp,prev);
		}
		
		return head;
	}

}
