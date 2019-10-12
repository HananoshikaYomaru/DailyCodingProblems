package dcp151to200.dcp185;

public class Interval {
	int p1; 
	int p2 ;
	public Interval(int p1, int p2 ) {
		if(p1 > p2) {
			int temp = p2 ; 
			p2 = p1 ; 
			p1 = temp ; 
		}
		this.p1 = p1; 
		this.p2 = p2 ; 
	}
}
