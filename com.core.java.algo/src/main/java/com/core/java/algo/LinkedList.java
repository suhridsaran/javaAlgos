package com.core.java.algo;

public class LinkedList {
	Node head;

	/*
	 * Linked list Node. This inner class is made static so that main() can access
	 * it
	 */
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		
		LinkedList llist = new LinkedList();
		/* Three nodes have been allocated  dynamically.
        We have refernces to these three blocks as first,  
        second and third

        llist.head        second              third
           |                |                  |
           |                |                  |
       +----+------+     +----+------+     +----+------+
       | 1  | null |     | 2  | null |     |  3 | null |
       */
		
		llist.head = new Node(1);
		
		/*   
		 * llist.head        second              third
           |                |                  |
           |                |                  |
       +----+------+     +----+------+     +----+------+
       | 1  |  o-------->| 2  | null |     |  3 | null |
       +----+------+     +----+------+     +----+------+ 
       
       */
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second;
		second.next = third;

	}
}
