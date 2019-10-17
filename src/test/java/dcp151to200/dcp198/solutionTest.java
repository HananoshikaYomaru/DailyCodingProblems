package dcp151to200.dcp198;

import static org.junit.Assert.*;

import org.junit.Test;

public class solutionTest {

	@Test
	public void testMultiple() {
		int[] array = new int [ ] { 3,5,10,20,21} ;
		int [] expected = new int [] {5, 10 ,20 } ; 
		int[] actual = solution.multiple(array);
		assertArrayEquals("expected is " + expected.toString() + "but actual return is " + actual.toString(),expected, actual);
	}
	
	@Test
	public void testMultiple2() {
		int[] array = new int[] {1,3,6,24} ; 
		int []expected = new int [] { 1,3,6,24} ;
		int [] actual = solution.multiple(array) ; 
		assertArrayEquals("expected is " + expected.toString() + "but actual returned is " + actual, expected , actual ) ; 
	}

}

//add something from windows 10 intellij
