package dcp1to50.dcp4;

import java.util.Arrays; 

public class solution {
	public static int firstMissingPositive(int [] array) {
		Arrays.sort(array) ; 
		int firstMissing = 1 ; 
		for(int i = 0; i < array.length ; i++) {
			if(array[i] <= 0 )
				continue  ;
			if(array[i] == firstMissing)
				firstMissing++ ; 
			else 
				break ;
		}
		return firstMissing; 
	}
}
