package com.linkedlist.singly;

public class MoveLastElementToFirst {
	
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
