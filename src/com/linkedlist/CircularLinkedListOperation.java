package com.linkedlist;

/**
 * @author Pratik
 *	All the operation carried out by the circular linked list
 */
public class CircularLinkedListOperation {
	
	/**
	 * gets the length of the circular linked list
	 * @param headnode
	 * @return int
	 */
	public int lengthCircular(LinkedListStructure headnode){
		int length = 0;
		LinkedListStructure tmp = headnode;
		while(tmp.getNext()!=headnode){
			length++;
			tmp = tmp.getNext();
		}		
		return length;
	}

	
	
	
}
