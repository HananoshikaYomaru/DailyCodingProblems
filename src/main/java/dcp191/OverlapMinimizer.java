package dcp191;

import java.util.* ; 


public class OverlapMinimizer {
	public static List<InputInterval> minimize(List<InputInterval> inputIntervals) {
		Collections.sort(inputIntervals)  ;
		identifyOverlapping(inputIntervals) ; 
		while(findMaxOverlappingInterval(inputIntervals) != null) {
			removeInterval(findMaxOverlappingInterval(inputIntervals)) ;
		}
		 
		return inputIntervals ; 
	}
	
	public static void removeInterval(Interval interval) {
		
	}
	
	
	public static InputInterval findMaxOverlappingInterval(List<InputInterval> inputIntervals) {
		return null  ;
	}
	
	public static void identifyOverlapping(List<InputInterval> inputIntervals){
		
	}
}
