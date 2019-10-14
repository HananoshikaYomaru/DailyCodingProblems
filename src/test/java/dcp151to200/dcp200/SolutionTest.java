package dcp151to200.dcp200;


//import static org.junit.Assert.*;

import org.junit.Test;
import common.* ; 

public class SolutionTest {

	@Test
	public void testStabIntervals() {
		Interval[] intervals = new Interval[4];
		intervals[0] = new Interval(1,4) ; 
		intervals[1] =new Interval(4,5) ; 
		intervals[2] = new Interval(7,9) ; 
		intervals[3] = new Interval(9,12) ; 
		print(Solution.stabIntervals(intervals)) ; 
		
		Interval[] intervals2 = new Interval[6] ; 
		intervals2[0] = new Interval(1,10) ; 
		intervals2[1] =new Interval(2,5) ; 
		intervals2[2] = new Interval(6,9) ; 
		intervals2[3] = new Interval(7,8) ; 
		intervals2[4] = new Interval(7,9) ; 
		intervals2[5] = new Interval(10,11) ; 
		print(Solution.stabIntervals(intervals2)) ; 
	}

	private void print(int[] array) {
		System.out.print("[");
		for(int i = 0 ; i < array.length ; i++)
				System.out.print(array[i] + ((i != array.length -1)?",": ""));
		System.out.println("]\n");
	}
}
