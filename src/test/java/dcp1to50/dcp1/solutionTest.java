package dcp1to50.dcp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class solutionTest {

	@Test
	public void testTwoNumSumToK() {
		int [ ] array = new int [] {10,3,15,7};
		int k = 17; 
		if(!dcp1to50.dcp1.solution.twoNumSumToK(array,k)) 
			fail("expected is true but actual returned is false") ; 
	}

}
