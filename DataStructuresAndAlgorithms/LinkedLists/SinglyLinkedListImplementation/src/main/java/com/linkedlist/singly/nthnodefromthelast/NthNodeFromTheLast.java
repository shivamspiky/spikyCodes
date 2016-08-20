package com.linkedlist.singly.nthnodefromthelast;

import com.linkedlist.singly.ListNode;

public class NthNodeFromTheLast {

	public ListNode nthNodeFromTheLast(ListNode head, int n) {

		if (n < 0 || head == null) {
			return null;
		}

		ListNode fastNode = head;
		ListNode slowNode = head;

		while (n > 0) {
			if (fastNode.getNext() != null) {
				fastNode = fastNode.getNext();
				n--;
				
			}
			else{
				return null;
			}
		}

		while (fastNode.getNext() != null) {
			slowNode = slowNode.getNext();
			fastNode = fastNode.getNext();
		}

		return slowNode;

	}
}
