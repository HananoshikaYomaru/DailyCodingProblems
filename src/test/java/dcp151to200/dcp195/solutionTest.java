package dcp151to200.dcp195;

import static org.junit.Assert.*;

import org.junit.Test;

public class solutionTest {

	@Test
	public void testCountBetween() {
		int[][] matrix = {
				{1,3,7,10,15,20},
				{2,6,9,14,22,25},
				{3,8,10,15,25,30},
				{10,11,12,23,30,35},
				{20,25,30,35,40,45}
		};
		int expected = 14 ; 
		int actual = solution.countBetween(matrix, 1, 1, 3, 3); 
		if(solution.countBetween(matrix, 1, 1, 3, 3) != expected)
			fail("expected is " + expected + " but actual return is " + actual) ; 
	}

}
