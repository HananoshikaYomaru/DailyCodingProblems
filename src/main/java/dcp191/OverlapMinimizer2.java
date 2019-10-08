package dcp191;

import java.util.* ; 

public class OverlapMinimizer2 {
	public static int minimizeOverlap(List<Interval> intervals){
		Comparator<Interval> ascendingFinish = new Comparator<Interval> () {

			@Override
			public int compare(Interval interval1, Interval interval2) {
				// TODO Auto-generated method stub
				if(interval1.p2 > interval2.p2)
					return 1  ;
				else if (interval2.p2 > interval1.p2 )
					return -1 ; 
				return 0;
			}
			
		};
		
		Collections.sort(intervals, ascendingFinish);
		printIntervalList(intervals) ; 
		
		List<Interval> selected = new ArrayList<>() ; 
		int finish = 0 ;  
		for(Interval i : intervals) {
			if(i.p1 >= finish) {
				selected.add(i) ;
				finish = i.p2 ; 
			} 
		}
		
		printIntervalList(selected)  ;
		
		for(Interval i : intervals) {
			if( selected.contains(i) == false) 
				System.out.println("remove interval (" + i.p1 + ", " + i.p2 + ")");
		}
		
		return intervals.size() - selected.size(); 
		
		
	}
	
	private static void printIntervalList(List<Interval> intervals) {
		for(Interval i : intervals) {
			System.out.print(i.toString()) ;
			System.out.println(" - (" + i.p1 + ", " + i.p2 + ")");
		}
	}
}
