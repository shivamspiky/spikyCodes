package com.linkedlist.circular;

public class LinkedList {
	
	private ListNode head;

	public void add(int data){
		
		ListNode node = new ListNode(1);
		
		if(head==null){
			head = node;
			return;
		}
		
		ListNode temp = head;
		while(temp.getNext()!=head){
			temp=temp.getNext();
		}
		
		node.setNext(head);
		temp.setNext(node);
		head = node;
	}
	
	public void print(int data){
		
	}
}
