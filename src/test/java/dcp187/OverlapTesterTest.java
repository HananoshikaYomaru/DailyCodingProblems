package dcp187;

import static org.junit.Assert.*;

import org.junit.Test;

public class OverlapTesterTest {

	@Test
	public void testTestRectangleArrayOverlap() {
		
	}
	
	@Test
	public void testRectangleOverlap() {
		
	}
	
	@Test
	public void testIntervalOverlap() {
		Interval i1 = new Interval(0,4) ; 
		Interval i2 = new Interval(2, 6) ; 
		assertTrue("They should be overlapping: should be true but return false", OverlapTester.intervalOverlap(i1,i2) ) ;
		
		Interval i3 = new Interval(4,8) ; 
		assertFalse("They should not be overlapping; should be false but return true", OverlapTester.intervalOverlap(i1, i3)) ; 
		
		
	}

}
