package com.linkedlist;

/**
 * @author Pratik
 * This is the customized data structure for the linked consisting of next node and the integer data. 
 */
public class LinkedListStructure {
	
	public LinkedListStructure(){
		
	}
	
	public LinkedListStructure(int data,LinkedListStructure next){
		this.data = data;
		this.next = next;
	}

	private LinkedListStructure next;
	private int data;
	
	
	public LinkedListStructure getNext() {
		return next;
	}
	public void setNext(LinkedListStructure next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

}
