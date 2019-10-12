package dcp151to200.dcp192;

import static org.junit.Assert.*;

import org.junit.Test;

import dcp151to200.dcp192.GoToEnd;

public class GoToEndTest {

	@Test
	public void testGoToEnd() {
		boolean actual = GoToEnd.goToEnd(new int[] {1,3,1,2,0,1}, 0 ) ; 
		assertTrue("expected is true but the actual is " + actual, actual ) ;
	}
	
	@Test 
	public void testGoToEnd2() {
		boolean actual = GoToEnd.goToEnd(new int[] {1,2,1,0,0 }, 0) ; 
		assertFalse("expected is false but the actual is " + actual, actual) ; 
	}

}
