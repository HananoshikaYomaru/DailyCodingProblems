package dcp151to200.dcp196;

//import static org.junit.Assert.*;

import org.junit.Test;

import dcp151to200.dcp196.MostFrequentSum;
import dcp151to200.dcp196.Tree;

public class MostFrequentSumTest {

	@Test
	public void testFind() {
		Tree tree = new Tree();
		tree.add(5);
		tree.add(2);
		tree.add(-5);
		tree.printTree();
		System.out.println("test1:"+MostFrequentSum.find(tree))  ; 
		//use if fail is better than using assert
 	}

	@Test
	public void testFind2() {
		Tree tree1 = new Tree();
		tree1.add(0); 
		tree1.add(22);
		tree1.add(4);
		tree1.add();
		tree1.add();
		tree1.add(5);
		tree1.add(6);
		tree1.add();
		tree1.add();
		tree1.add();
		tree1.add();
		tree1.add();
		tree1.add(7);
		tree1.printTree(); 
		System.out.println("test2:"+MostFrequentSum.find(tree1))  ; 
 	}

}
