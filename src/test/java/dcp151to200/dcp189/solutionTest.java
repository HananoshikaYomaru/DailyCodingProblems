package dcp151to200.dcp189;

import static org.junit.Assert.*;

import org.junit.Test;

public class solutionTest {

	@Test
	public void testCountElements() {
		Object[] array = new Object[] {5,1,3,5,2,3,4,1} ; 
		int expected = 5 ; 
		int actual = solution.countElements(array);
		if(expected != actual)
			fail("expected is " + expected + " but actual return is " + actual );
	}

}
