package dcp194;

import java.util.* ;  

public class Intersect {
	public static int countIntersectFixedX(List<Point> pList, List<Point> qList) {//pList has x = 0 and qList has x = 1
		List<LineSegment> lineSegments = new ArrayList<>( ) ; 
		for(int i=  0 ; i < pList.size() ; i++) {
			lineSegments.add(new LineSegment(pList.get(i) , qList.get(i))) ; 
		}
		
		int overlap = 0 ; 
		for(int i = 0 ; i < lineSegments.size() ; i++) 
			for(int j = i + 1 ; j < lineSegments.size(); j++)
				if(Overlap(lineSegments.get(i), lineSegments.get(j)))
					overlap++ ; 
		
		
		return overlap ;
	}
	
	public static boolean Overlap(LineSegment line1, LineSegment line2) {
		 //imagine the line segment are infinitely long, if their intersection point have 0 < x < 1, then it is true. 
		int x1 = line1.p1.x ; 
		int y1 = line1.p1.y ; 
		int x2 = line1.p2.x ; 
		int y2 = line1.p2.y;
		int x3 = line2.p1.x ;
		int y3 = line2.p1.y ; 
		int x4 = line2.p2.x ; 
		int y4 = line2.p2.y ; 
		double slope1= (y2 - y1) / (x2-x1) ; 
		double slope2 = (y4 - y3 ) / (x4 - x3 ) ; 
		if(slope1 - slope2 != (double) 0 )
		{
			double intersectX = (y3-y1) / (slope1 - slope2) ;
			if(intersectX > (double) 0 && intersectX < (double) 1)
				return true; 
		}
		else 
			if (y1 == y3)
				return true ; 
		return false ;
	}
	
}
