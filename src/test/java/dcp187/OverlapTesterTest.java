package dcp187;

import static org.junit.Assert.*;

import org.junit.Test;

public class OverlapTesterTest {

	@Test
	public void testTestRectangleArrayOverlap() {
		Rectangle[] recs = new Rectangle[13] ; 
		recs[0] = new Rectangle(0,4,4,4) ; 
		recs[1] = new Rectangle(4,4,4,4)  ;
		recs[2] = new Rectangle(8,4,4,4) ;
		recs[3] = new Rectangle(0,8,4,4) ;
		recs[4] = new Rectangle(4,8,4,4) ;
		recs[5] = new Rectangle(8,8,4,4) ;
		recs[6] = new Rectangle(0,12,4,4) ;
		recs[7] = new Rectangle(4,12,4,4) ;
		recs[8] = new Rectangle(8,12,4,4) ;
		recs[9] = new Rectangle(2,10,4,4) ;
		recs[10] = new Rectangle(6,10,4,4) ;
		recs[11] = new Rectangle(2,8,4,4) ;
		recs[12] = new Rectangle(6,8,4,4) ;
		
		assertTrue("they should be overlapping; should be true but return false" , OverlapTester.testRectangleArrayOverlap(recs));
	}
	
	@Test
	public void testRectangleOverlap() {
		//if I put many testCase here, basically it is the same as putting it in the array test
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
