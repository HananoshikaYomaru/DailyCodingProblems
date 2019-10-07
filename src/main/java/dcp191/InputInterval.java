package dcp191;

import java.util.* ;

public class InputInterval extends Interval implements Comparable<InputInterval>{
	List<OverlappingInterval> overlappingIntervals ; 
	
	public InputInterval(int p1, int p2) {
		super(p1,p2) ; 
	}
	
	@Override
	public int compareTo(InputInterval inputInterval2) {
		// TODO Auto-generated method stub
		if(this.p1 > inputInterval2.p1)
			return 1 ; //this is put after 
		else if(inputInterval2.p1 > this.p1)
			return -1 ; // this is put before
		else 
			return 0;
	} 
}
