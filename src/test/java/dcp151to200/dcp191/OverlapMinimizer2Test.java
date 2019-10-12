package dcp151to200.dcp191;


import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.* ;

import org.junit.Assert;
import org.junit.Test;

import dcp151to200.dcp191.Interval;
import dcp151to200.dcp191.OverlapMinimizer2;


@SuppressWarnings("unused")
public class OverlapMinimizer2Test {

	@Test
	public void testOverlapMinimizer2() {
		System.out.println("test1") ; 
		List<Interval> intervals = new ArrayList<>() ; 
		intervals.add(new Interval(7,9)) ;
		intervals.add(new Interval(2,4));
		intervals.add(new Interval(5,8)) ;
		int expected = 1 ; 
		int actual = OverlapMinimizer2.minimizeOverlap(intervals); 
		assertArrayEquals("correct answer should be " + expected + " but actual is " + actual,expected, actual);
		//assertEquals(expected, actual, "hello world");
		
	}
	
	@Test
	public void testOverlapMinimizer2v2() {
		System.out.println("test2") ; 
		List<Interval> intervals = new ArrayList<>() ; 
		intervals.add(new Interval(0,5)); 
		intervals.add(new Interval(1,4));
		intervals.add(new Interval(3,5));
		intervals.add(new Interval(3,8));
		intervals.add(new Interval(4,7));
		intervals.add(new Interval(5,9));
		intervals.add(new Interval(6,10));
		intervals.add(new Interval(8,11)); 
		int expected = 5 ; 
		int actual = OverlapMinimizer2.minimizeOverlap(intervals); 
		assertArrayEquals("correct answer should be " + expected + " but actual is " + actual,expected, actual);
	}

	private void assertArrayEquals(String message, int expected, int actual) {
		// TODO Auto-generated method stub
		int[] expected2 = {expected } ; 
		int[] actual2 = {actual}; 
		Assert.assertArrayEquals(message, expected2 , actual2) ; 
	} 

}
