package dcp1to50.dcp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class solutionTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		int [] array = new int [] {1,2,3,4,5} ; 
		assertArrayEquals( "expected is true, but actual returned is false",solution.product1(array), solution.product2(array)) ; 
	}

}
