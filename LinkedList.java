package pkg4;

import java.util.*;

public class LinkedList {

	private Node head;
	
	public void insertAtHead (int data) {
		Node newNode = new Node (data);
		newNode.setNextNode(this.head);
		this.head = newNode;
}
	
	public int length() {
		int length = 0;
		Node current = this.head;

		while(current !=  null) {
		length ++;
		current = current.getNextNode();
								}
		return length;
	}
	@Override
	public String toString() {
        String result = "";
        Node current = this.head;
        while(current.getNextNode() != null){
            result += current.getData();
            if(current.getNextNode() != null){
                 result += ", ";
            }
            current = current.getNextNode();
        }
        return "List: " + result;
}
	
}
 
	

