package dcp194;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.* ;  

import org.junit.Test;

public class IntersectTest {

	@Test
	public void testCountIntersectFixedX() {
		//fail("Not yet implemented");
		List<Point> pList = new ArrayList<>( )  ;
		pList.add(new Point(0,0));
		pList.add(new Point(0,1));
		pList.add(new Point(0,2));
		pList.add(new Point(0,3));
		pList.add(new Point(0,4));
		pList.add(new Point(0,5));
		pList.add(new Point(0,6));
		List<Point> qList = new ArrayList < > ( ) ; 
		qList.add(new Point(1,100)) ; 
		qList.add(new Point(1,101)) ; 
		qList.add(new Point(1,1)) ;
		qList.add(new Point(1,2)) ;
		qList.add(new Point(1,3)) ;
		qList.add(new Point(1,4)) ;
		qList.add(new Point(1,5)) ;
		int expected = 10 ; 
		int actual = Intersect.countIntersectFixedX(pList, qList) ; 
		assertEquals(expected, actual, "expected is " + expected + "but actual is " + actual);
		
	}
	
	@Test
	public void testCountIntersectFixedX2() {
		//fail("Not yet implemented");
		List<Point> pList = new ArrayList<>( )  ;
		pList.add(new Point(0,0));
		pList.add(new Point(0,1));
		List<Point> qList = new ArrayList < > ( ) ; 
		qList.add(new Point(1,0)) ; 
		qList.add(new Point(1,2)) ; 
		int expected = 0 ; 
		int actual = Intersect.countIntersectFixedX(pList, qList) ; 
		assertEquals(expected, actual, "expected is " + expected + "but actual is " + actual);
		
	}

	@Test
	public void testIntervalOverlap() {
		//fail("Not yet implemented");
	}

}
