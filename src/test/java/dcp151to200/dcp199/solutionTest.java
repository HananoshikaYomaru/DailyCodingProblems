package dcp151to200.dcp199; 

import org.junit.Test;

public class solutionTest {

	@Test
	public void testCompleteParenthesis() {
		String str = "(()" ; 
		System.out.println(solution.completeParenthesis(str));
		str = "))()(" ; 
		System.out.println(solution.completeParenthesis(str));
	}

}
