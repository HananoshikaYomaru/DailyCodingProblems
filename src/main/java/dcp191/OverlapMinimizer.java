package dcp191;

import java.util.*  ; 

public class OverlapMinimizer {
	public static int countRemoved(List<Interval> intervals) {
		
		return intervals.size() - minimize(intervals).size() ; 
	}
	
	public static List<Interval> minimize(List<Interval> intervals) {
		Comparator<Interval> ascendingStart = new Comparator<Interval> ( ) {

			@Override
			public int compare(Interval interval1, Interval interval2) {
				// TODO Auto-generated method stub
				if(interval1.p1 > interval2.p1)
					return 1 ;
				else if ( interval1.p1 < interval2.p1)
					return -1 ; 
				else 
					return 0;
			}
			
		};
		
		Collections.sort(intervals, ascendingStart);
		List<Interval> overlappingIntervals = findOverlapping(intervals) ; 
		while(!overlappingIntervals.isEmpty()) {
			Collections.sort(overlappingIntervals, ascendingStart)  ;
			overlappingIntervals = removeMaxOverlapping(intervals, overlappingIntervals)  ;
		}
		return intervals; 
	}
	
	public static List<Interval> removeMaxOverlapping(List<Interval> intervals, List<Interval> overlappingIntervals) {
		int maxOverlapInterval = findMaxOverlapping(intervals, overlappingIntervals);
		if(maxOverlapInterval != -1 ) 
		{
			System.out.println("remove " +intervals.get(maxOverlapInterval).toString() + " - (" + intervals.get(maxOverlapInterval).p1 + ", " + intervals.get(maxOverlapInterval).p2 + ")") ;
			intervals.remove(maxOverlapInterval) ; 
			overlappingIntervals = findOverlapping(intervals) ; 
		}
		return overlappingIntervals ; 
	}
	
	public static int findMaxOverlapping(List<Interval> intervals, List<Interval> overlappingIntervals) {
		int maxNum = 1; //
		int index = -1;  
		for(int i = 0 ; i < intervals.size() ; i++) {
			int numOverlap = 0 ;  
			for(int j = 0 ; j < overlappingIntervals.size() ; j++) {
				if(checkIntervalContains(intervals.get(i), overlappingIntervals.get(j))) {
					numOverlap++ ; 
					if (numOverlap >= maxNum) {
						maxNum = numOverlap ; 
						index = i ; 
					}
				}
					 
			}
		}
		return index; 
	}
	
	public static boolean checkIntervalContains(Interval interval1, Interval interval2) {
		if(interval1.p1 <= interval2.p1 && interval1.p2 >= interval2.p2)
			return true ; 
		else 
			return false ; 
	}
	
	
	//return overlappingIntervals
	private static List<Interval> findOverlapping(List<Interval> intervals){ 
		List<Interval> overlappingIntervals = new ArrayList<> ( ) ;
		
		//find all the breakpoint
		List<Integer> breakpoints = new ArrayList<>() ; 
		for(int i = 0 ; i < intervals.size() ; i++)
		{
			if(!breakpoints.contains(intervals.get(i).p1))breakpoints.add(intervals.get(i).p1) ;
			if(!breakpoints.contains(intervals.get(i).p2))breakpoints.add(intervals.get(i).p2) ;
			//System.out.println(breakpoints) ; 
		}
		Collections.sort(breakpoints);
		//create overlappingIntervals
		for(int i = 0 ; i < breakpoints.size() - 1 ; i++ )
		{
			Interval testInterval = new Interval(breakpoints.get(i), breakpoints.get(i+1)) ; 
			int numIntervalOverlapTestInterval = 0 ; 
			for(int j = 0 ; j < intervals.size() ; j++)
				if(checkIntervalContains(intervals.get(j), testInterval)){
					numIntervalOverlapTestInterval++ ; 
					if(numIntervalOverlapTestInterval == 2) {
						//out.print("add (" + breakpoints.get(i) + ", " + breakpoints.get(i+1)+ ") \n");
						overlappingIntervals.add(testInterval)  ;
						break ;
					}
				}
		}
		
		//for(int i = 0 ; i < overlappingIntervals.size() ; i++)
			//out.print(overlappingIntervals.get(i).toString() + " - (" + overlappingIntervals.get(i).p1 + ", " + overlappingIntervals.get(i).p2 + "), " ) ;
		 
			
		
		return overlappingIntervals ; 
	}
}
