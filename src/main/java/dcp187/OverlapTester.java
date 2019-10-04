package dcp187;

public class OverlapTester {
	
	public static boolean testRectangleArrayOverlap(Rectangle[] recs) {
		for(int i = 0; i < recs.length ; i++)
			for(int j = i+1 ; j < recs.length;j++ )
				if(rectangleOverlap(recs[i],recs[j]))
					return true ;
		return false; 
	}
	
	public static boolean rectangleOverlap( Rectangle rec1, Rectangle rec2) {
		Interval rec1x = new Interval(rec1.topleft_x, rec1.topleft_x + rec1.dimension_x);
		Interval rec1y = new Interval(rec1.topleft_y, rec1.topleft_y - rec1.dimension_y);
		Interval rec2x = new Interval(rec2.topleft_x, rec2.topleft_x + rec2.dimension_x);
		Interval rec2y = new Interval(rec2.topleft_y, rec2.topleft_y - rec2.dimension_y);
		if(intervalOverlap(rec1x, rec2x) && intervalOverlap(rec1y, rec2y)) 
			return true;
		else 
			return false ; 
	}
	
	public static boolean intervalOverlap(Interval interval1, Interval interval2) {
		
		//interval1 -> interval1.p1 < interval2.p1 
		if(interval1.p1 > interval2.p1) {
			Interval temp = interval2 ; 
			interval2 = interval1; 
			interval1 = temp ; 
		}
		if(interval1.p2 > interval2.p1)
			return true; 
		else 
			return false ;
	}
}
