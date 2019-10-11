package dcp196;

public class Node{//define a class inside class
	int num ;  
	boolean disable ;
	public Node(int num, boolean disable) {
		this.num = num ; 
		this.disable = disable; 
	}
	
	public Node(int num) {
		this.num = num ; 
		this.disable = false ;
	}
}