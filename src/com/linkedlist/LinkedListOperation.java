package com.linkedlist;

/**
 * @author Pratik Time complexity of this function is O(n) for scanning the
 *         entire list and i have reduced the space complexity by reducing one
 *         more variable i.e O(1)
 */
public class LinkedListOperation {

	int count = 1;

	// Scanning the length of the linked
	public int length(LinkedListStructure headnode) {

		int length = 0;

		while (headnode != null) {
			length++;
			headnode = headnode.getNext();
		}

		return length;
	}

	/**
	 * This method is written recursively to traverse the list and get the node
	 * with one previous value and insert it into the appropriate position.
	 * 
	 * @param headnode
	 * @param pos
	 * @param nodeToInsert
	 * @return true
	 */
	public LinkedListStructure insertNode(LinkedListStructure headnode, int pos, LinkedListStructure nodeToInsert) {

		if (pos < 1 || pos > length(headnode)) {
			return headnode;
		}
		// Always check nulls
		if (headnode == null) {
			return nodeToInsert;
		}
		// if the position is first
		if (pos == 1) {
			nodeToInsert.setNext(headnode);

		}

		// it will do the node setting in the middle other than the first pos
		if (count + 1 < pos) {
			count++;
			insertNode(headnode.getNext(), pos, nodeToInsert);
		} else {
			LinkedListStructure tmp = headnode.getNext();
			headnode.setNext(nodeToInsert);
			nodeToInsert.setNext(tmp);
		}
		return headnode;
	}

	/**
	 * This method deletes node at the particular position
	 * @param headnode
	 * @param pos
	 * @return
	 */
	public LinkedListStructure deleteNode(LinkedListStructure headnode, int pos) {

		if (headnode == null) {
			return headnode;
		}

		if (pos < 1 || pos > length(headnode)) {
			System.out.println("Impossible position");
			return headnode;
		}

		if (pos == 1) {
			LinkedListStructure tmp = headnode.getNext();
			headnode = null;
			return tmp;
		}
		// O(1) time for one constant used and the O(n) time for the traversing
		// of the list.
		if (count + 1 < pos) {
			deleteNode(headnode, pos);
		} else {
			LinkedListStructure tmp = headnode.getNext();
			headnode.setNext(tmp.getNext());
			tmp = null;
		}
		return headnode;
	}

	
	/**
	 * deletes all the linked list node elements
	 * @param headnode
	 */
	public void deleteLinkedList(LinkedListStructure headnode){
		if(headnode==null){
			System.out.println("Already Empty");
		}
		LinkedListStructure tmp;
		while(headnode!=null){
			tmp = headnode;
			headnode = headnode.getNext();
			tmp=null;
		}
	}
	
}
