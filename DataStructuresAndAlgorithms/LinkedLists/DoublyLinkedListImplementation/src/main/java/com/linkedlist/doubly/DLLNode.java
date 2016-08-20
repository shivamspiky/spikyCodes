package com.linkedlist.doubly;

public class DLLNode {

	private int data;
	private DLLNode next;
	private DLLNode prev;
	
	public DLLNode(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setNext(DLLNode next){
		this.next = next;
	}
	
	public DLLNode getNext(){
		return this.next;
	}
	
	public void setPrev(DLLNode prev){
		this.prev = prev;
	}

	public DLLNode getPreve(){
		return this.prev;
	}
	
	
	
}
