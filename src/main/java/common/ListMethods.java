package common;

import java.util.* ; 

public class ListMethods {
	public static Integer findClosestInteger(List<Integer> nums, double k) {
		Integer result = 0; 
		double diff = absolute(nums.get(0) - k);
		for(int i = 1 ; i < nums.size() ; i++) 
			if(absolute(nums.get(i) - k ) < diff) {
				diff = absolute(nums.get(i) - k ); 
				result = i ; 
			}
		return result ;  //index
	}
	
	
	
	private static double absolute(double k) {
		if(k < 0)
			return k * -1 ; 
		else 
			return k ; 
	}
}
