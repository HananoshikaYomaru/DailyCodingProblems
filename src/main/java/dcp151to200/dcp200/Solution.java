package dcp151to200.dcp200;

import common.* ; 
import java.util.* ; 

public class Solution {
	public static int[] stabIntervals(Interval[] intervals) { 
		//assume the intervals are sorted
		List<Interval> intervalList = new ArrayList<>();
		List<Integer> stabs = new ArrayList<>()  ;
		for(int i = 0 ; i < intervals.length ; i++)
			intervalList.add(intervals[i]) ; 

		do {
			int maxNumOverlap = 0 ; 
			for(int i = intervalList.get(0).p1 ; ; i++) { //change of x interval
				int numOverlap = 0 ;
				for(int j = 0 ; j < intervalList.size() ; j++) { 
					if(intervalList.get(j).contains_include_boundary(i))
						numOverlap++ ; 
				}
				if(numOverlap > maxNumOverlap)
					maxNumOverlap = numOverlap ; 
				else if(numOverlap < maxNumOverlap) {
					stabs.add(i - 1) ; 
					deleteStabbed(intervalList, i - 1) ; 
					break ; 
				}
			}
		}while(!intervalList.isEmpty()) ; 
		
		return getResult(stabs) ; //
 	}
	
	private static int[] getResult(List<Integer> stabs) {
		int[] result = new int[stabs.size()] ; 
		for(int i = 0 ; i < stabs.size() ; i++)
			result[i] = stabs.get(i) ; 
		return result; 
	}
	
	public static void deleteStabbed(List<Interval> intervalList, int x) {
		for(int i = 0 ; i < intervalList.size() ; i++) 
			if(intervalList.get(i).contains_include_boundary(x)) {
				intervalList.remove(i) ; 
				i-- ; 
			}

	}
}
