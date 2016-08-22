package com.linkedlist.singly;

public class LinkedList {

	ListNode head;
	
	public void add(int data){
		ListNode node = new ListNode(data);
		
		if(node!=null){
			node.setNext(head);
			head=node;
		}
	}
	
	public void moveLastElementToFirst(){
		
		ListNode last=head;
		ListNode secondLast=null;
		
		while(last.getNext()!=null){
			
			secondLast=last;
			last=last.getNext();
			
		}
		
		secondLast.setNext(null);
		last.setNext(head);
		head=last;
	}
	
	public void printList(){
		ListNode temp = head;
		while(temp!=null){
			
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	
	public static void main(String args[]){
		
		LinkedList listList = new LinkedList();
		listList.add(8);
		listList.add(7);
		listList.add(6);
		listList.add(5);
		
		System.out.println("list before moving last element to first");
		listList.printList();
		listList.moveLastElementToFirst();
		System.out.println("list after moving last element to first");
		listList.printList();
	}
	
}
