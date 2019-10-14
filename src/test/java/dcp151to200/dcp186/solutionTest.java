package dcp151to200.dcp186;

import org.junit.Test;

public class solutionTest {

	@Test
	public void testSmallestDiff() {
		Integer[] nums = new Integer[] {5,10,15,20,25} ; 
		int[][] result = solution.smallestDiff(nums) ; 
		print(result) ; 
		
		nums = new Integer[] {19,21,36,40,5,31,50,30,22} ; 
		result = solution.smallestDiff(nums) ; 
		print(result) ; 
  	}
	
	@Test
	public void testSmallestDiff2() {
		Integer[] nums = new Integer[] {5,10,15,20,25} ; 
		int[][] result = solution.smallestDiff2(nums) ; 
		print(result) ; 
		
		nums = new Integer[] {19,21,36,40,5,31,50,30,22} ; 
		result = solution.smallestDiff2(nums) ; 
		print(result) ;
	}
	
	void print(int[][ ] result) {
		for(int i = 0 ; i < result.length ; i++) {
			for(int j = 0 ; j < result[i].length ; j++)
				System.out.print(result[i][j] + ",");
			System.out.println();
		}
		System.out.println("") ; 
	}

}
