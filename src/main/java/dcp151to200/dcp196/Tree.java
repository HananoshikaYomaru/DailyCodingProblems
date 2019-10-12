package dcp151to200.dcp196;

import java.util.ArrayList;
import java.util.List;

public class Tree{
	int size = 0; // true size without counting disabled
	List<Node> nodes = new ArrayList<>(); 
	
	
	public void add(int num) {
		this.nodes.add(new Node(num)) ; 
		size++ ; 
	}
	public void add() {
		this.nodes.add(new Node(0, true)) ;  
	}
	
	public void add(Node node) {
		this.nodes.add(node) ; 
		if(!node.disable)
			size++;
	}
	
	public void printTree(){
		for(Node n : nodes)
			System.out.println(n.num + " : " + n.disable) ; 
		
	}
}