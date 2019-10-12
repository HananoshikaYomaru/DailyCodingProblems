package dcp151to200.dcp185;

public class OverlapRec {
	public static int overlapRecArea(Rectangle recs[]) {
		if (overlapRecs(recs) != null)
			return calcRecArea(overlapRecs(recs)) ;
		else 
			return 0 ; 
	}
	
	public static Rectangle overlapRecs(Rectangle recs[]) {
		Rectangle tempRec = overlapRec(recs[0], recs[1]) ;
		for(int i = 2 ; i < recs.length ; i++)
			tempRec = overlapRec(tempRec, recs[i]) ; 
		return tempRec ; 
	}
	
	public static int overlapRecArea(Rectangle rec1, Rectangle rec2) {
		Interval rec1x = new Interval(rec1.topleft_x, rec1.topleft_x + rec1.dimension_x) ;
		Interval rec1y = new Interval(rec1.topleft_y, rec1.topleft_y - rec1.topleft_y) ;
		Interval rec2x = new Interval(rec2.topleft_x, rec2.topleft_x + rec2.dimension_x);
		Interval rec2y = new Interval(rec2.topleft_y, rec2.topleft_y - rec2.dimension_y) ;
		return (overlapInterval(rec1x, rec2x) * overlapInterval(rec1y, rec2y)) ; 
	}
	
	public static Rectangle overlapRec(Rectangle rec1, Rectangle rec2) {
		Interval rec1x = new Interval(rec1.topleft_x, rec1.topleft_x + rec1.dimension_x) ;
		Interval rec1y = new Interval(rec1.topleft_y, rec1.topleft_y - rec1.topleft_y) ;
		Interval rec2x = new Interval(rec2.topleft_x, rec2.topleft_x + rec2.dimension_x);
		Interval rec2y = new Interval(rec2.topleft_y, rec2.topleft_y - rec2.dimension_y) ;
		if(overlapInterval2(rec1x, rec2x) != null && overlapInterval2(rec1y, rec2y) != null) {
			return new Rectangle(overlapInterval2(rec1x, rec2x) , overlapInterval2(rec1y, rec2y)) ; 
		}
		else 
			return null ;
	}
	
	public static int overlapInterval(Interval interval1, Interval interval2) {
		if(interval1.p1 > interval2.p1) {
			Interval temp = interval1 ; 
			interval1 = interval2 ;
			interval2 = temp ;
		}
		if( interval1.p2 > interval1.p1)
			return interval1.p2 - interval1.p1 ; 
		else 
			return 0 ; 
		
	}
	
	public static Interval overlapInterval2(Interval interval1, Interval interval2) {
		if(interval1.p1 > interval2.p1) {
			Interval temp = interval1 ; 
			interval1 = interval2 ;
			interval2 = temp ;
		}
		if ( interval1.p2 > interval2.p1)
			return new Interval(interval2.p1, interval1.p2) ; 
		
		else 
			return null ;
	}
	
	public static int calcRecArea(Rectangle rec) {
		return rec.dimension_x * rec.dimension_y ; 
	}
}
