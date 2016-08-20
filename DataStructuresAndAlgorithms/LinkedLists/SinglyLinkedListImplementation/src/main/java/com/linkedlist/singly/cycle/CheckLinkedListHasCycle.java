package com.linkedlist.singly.cycle;

import com.linkedlist.singly.ListNode;

public class CheckLinkedListHasCycle {

	public boolean whetherLinkedListHasCycle(ListNode head) {
		
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			
			if (slow.equals(fast)) {
				return true;
			}
		}
		
		return false;
	}

}
