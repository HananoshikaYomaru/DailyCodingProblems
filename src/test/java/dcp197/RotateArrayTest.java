package dcp197;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateArrayTest {

	@Test
	public void testRotateRight() {
		int[] array = new int[] {0,1,2,3,4,5,6,7,8,9,10} ; 
		int[] newArray = RotateArray.rotateRight(array, 3) ; 
		int[] expectedArray = new int[] {8,9,10,0,1,2,3,4,5,6,7} ; 
		assertArrayEquals(expectedArray, newArray);
	}

	@Test
	public void testRotateLeft() {
		
	}

}
