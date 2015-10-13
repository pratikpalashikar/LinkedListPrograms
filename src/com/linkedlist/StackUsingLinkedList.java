package com.linkedlist;

import java.util.Scanner;

public class StackUsingLinkedList {

	LinkedListOperation m = new LinkedListOperation();
	LinkedListStructure top;
	

	public LinkedListStructure push(LinkedListStructure headnode, LinkedListStructure nodeToinsert) {
		// Check if the stack is empty or not
		if (headnode == null) {
			headnode = nodeToinsert;
			this.setTop(headnode);
			return headnode;
		}
		// check if the stack is full
		if (m.length(headnode) == 4) {
			System.out.println("Stack is full");
		} else {
			// set the current node to the headnode
			nodeToinsert.setNext(headnode);
			headnode = nodeToinsert;
			this.setTop(headnode);
		}
		return headnode;
	}

	public void pop(LinkedListStructure headnode) {
		LinkedListStructure temp;
		if (headnode == null) {
			System.out.println("Stack is Empty");
		} else {
			temp = headnode.getNext();
			headnode = null;
			headnode = temp;
			this.setTop(headnode);
		}
	}

	public void printStack(LinkedListStructure headnode) {

		if (headnode == null) {
			System.out.println("Stack is Empty");
			return;
		}

		if(headnode.getNext()==null){
			System.out.println(headnode.getData());
			return;
		}
		
		
		while (headnode.getNext() != null) {
			System.out.println(headnode.getData());
			headnode = headnode.getNext();
		}

	}

	public LinkedListStructure getNewNode(int data) {

		return new LinkedListStructure(data, null);

	}
	
	

	public LinkedListStructure getTop() {
		return top;
	}

	public void setTop(LinkedListStructure top) {
		this.top = top;
	}

	public static void main(String[] args) {
		String stop = null;
		StackUsingLinkedList n = new StackUsingLinkedList();
		
		while(true){
		System.out.println("1.select an option\n");
		System.out.println("2.select an push\n");
		System.out.println("3.select an pop\n");
		System.out.println("4.select an print\n");
		Scanner s = new Scanner(System.in);

		switch (s.nextInt()) {
		case 1:
			

			break;

		case 2:
			System.out.println("Insert the data");
			Scanner o = new Scanner(System.in);		
			LinkedListStructure input  = new LinkedListStructure(o.nextInt(), null);
			n.push(n.getTop(),input);
			
			break;

		case 3:
			n.pop(n.getTop());
			
			break;

		case 4:
			n.printStack(n.getTop());
			break;

	
		}

		}
	}
	

}
