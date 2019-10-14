package common;

public class EnableInterval extends Interval{
	public EnableInterval(int p1, int p2) {
		super(p1, p2);
		// TODO Auto-generated constructor stub
	}
	
	public static EnableInterval[] convert(Interval[] intervals) {
		EnableInterval[] result = new EnableInterval[intervals.length] ; 
		for(int i = 0 ; i < intervals.length ; i++)
			result[i] = new EnableInterval(intervals[i].p1, intervals[i].p2) ; 
		return result ;
	}

	boolean enable = true ; 
}
