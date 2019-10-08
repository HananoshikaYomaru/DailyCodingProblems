package dcp191;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class OverlapMinimizerTest {

	@Test
	public void testCountRemoved1() {
		System.out.println("test1") ; 
		List<Interval> intervals = new ArrayList<>() ; 
		intervals.add(new Interval(7,9)) ;
		intervals.add(new Interval(2,4));
		intervals.add(new Interval(5,8)) ;
		int expected = 1 ; 
		int actual = OverlapMinimizer.countRemoved(intervals); 
		assertArrayEquals("correct answer should be " + expected + " but actual is " + actual,expected, actual);
		//assertEquals(expected, actual, "hello world");
		
	}
	
	@Test
	public void testCountRemoved2() {
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
		int actual = OverlapMinimizer.countRemoved(intervals); 
		assertArrayEquals("correct answer should be " + expected + " but actual is " + actual,expected, actual);
	}

	private void assertArrayEquals(String message, int expected, int actual) {
		// TODO Auto-generated method stub
		int[] expected2 = {expected } ; 
		int[] actual2 = {actual}; 
		Assert.assertArrayEquals(message, expected2 , actual2) ; 
	} 

}
