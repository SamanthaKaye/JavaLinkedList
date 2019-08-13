package pkg4;

import java.util.*;

public class Node {
	private int data;
	private Node nextNode;

public Node (int data) {
	this.data = data;
}
//get the data in the node
public int getData() {
	return this.data;
}
// get the next node
public Node getNextNode() {
	return this.nextNode;
}	
//set the data in the node	
public void setData( int data ) {
	this.data = data;
}
//set the next node
public void setNextNode(Node nextNode) {
	this.nextNode = nextNode;
} }
