package dcp1to50.dcp4;

import static org.junit.Assert.*;

import org.junit.Test;

public class solutionTest {

	@Test
	public void testFirstMissingPositive() {
		int [ ] array = new int [ ] { -3,-2,0 ,1 ,3, 4 } ; 
		if(dcp1to50.dcp4.solution.firstMissingPositive(array) !=2)
			fail("expected is 2 but actual returned is " + dcp1to50.dcp4.solution.firstMissingPositive(array)); 
	}

}
