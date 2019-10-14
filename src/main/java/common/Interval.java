package common;

public class Interval {
	public int p1; 
	public int p2 ;
	public Interval(int p1, int p2 ) {
		if(p1 > p2) {
			int temp = p2 ; 
			p2 = p1 ; 
			p1 = temp ; 
		}
		this.p1 = p1; 
		this.p2 = p2 ; 
	}
	
	public boolean contains(int num) {
		if(num > p1 && num < p2)
			return true; 
		else 
			return false ;
	}
	
	public boolean contains_include_boundary(int num) {
		if(num >= p1 && num <= p2)
			return true;
		else 
			return false ;
	}
}
