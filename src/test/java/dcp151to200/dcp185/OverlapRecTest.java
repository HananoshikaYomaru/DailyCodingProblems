package dcp151to200.dcp185;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import dcp151to200.dcp185.OverlapRec;
import dcp151to200.dcp185.Rectangle;

public class OverlapRecTest {

	@Test
	public void testOverlapRecArea() { // only public void can test
		Rectangle[] recs = new Rectangle[2] ; 
		recs[0] = new Rectangle(1,4,3,3) ; 
		recs[1] = new Rectangle(0,5,4,3) ;
		assertEquals(6, OverlapRec.overlapRecArea(recs));
	}

}
