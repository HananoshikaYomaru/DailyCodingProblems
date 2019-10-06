package dcp185;

public class Rectangle {
	int topleft_x ; 
	int topleft_y ; 
	int dimension_x; 
	int dimension_y; 
	public Rectangle(int tx, int ty, int dx, int dy) {
		topleft_x = tx; 
		topleft_y = ty; 
		dimension_x  = dx ; 
		dimension_y = dy  ;
	}
	
	public Rectangle(Interval intervalx, Interval intervaly) {
		topleft_x = intervalx.p1 ; 
		dimension_x = intervalx.p2 - intervalx.p1 ; 
		topleft_y = intervaly.p2 ; 
		dimension_y = intervaly.p2 - intervaly.p1 ;
	}
}
