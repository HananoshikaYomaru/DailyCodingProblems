package dcp191;


import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.* ;

import org.junit.Assert;
import org.junit.Test;


@SuppressWarnings("unused")
public class OverlapMinimizer2Test {

	@Test
	public void testOverlapMinimizer2() {
		List<Interval> intervals = new ArrayList<>() ; 
		intervals.add(new Interval(7,9)) ;
		intervals.add(new Interval(2,4));
		intervals.add(new Interval(5,8)) ;
		int expected = 1 ; 
		int actual = OverlapMinimizer2.minimizeOverlap(intervals); 
		assertArrayEquals("correct answer should be " + expected + " but actual is " + actual,expected, actual);
		//assertEquals(expected, actual, "hello world");
		
	}

	private void assertArrayEquals(String message, int expected, int actual) {
		// TODO Auto-generated method stub
		int[] expected2 = {expected } ; 
		int[] actual2 = {actual}; 
		Assert.assertArrayEquals(message, expected2 , actual2) ; 
	} 

}
