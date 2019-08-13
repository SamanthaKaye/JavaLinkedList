package pkg4;

import java.util.*;

	public class LinkedListDemo {
		
		public static void main(String[] args) {
		LinkedList list = new LinkedList( );
		list.insertAtHead(6);
		list.insertAtHead(8);
		list.insertAtHead(10);
		list.insertAtHead(12);
		list.insertAtHead(14);
		list.insertAtHead(16);
		System.out.println("Length: " + list.length());
		System.out.println(list.toString());
	}
	}

