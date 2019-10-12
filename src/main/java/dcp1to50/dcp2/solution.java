package dcp1to50.dcp2;

public class solution {
	public static int[] product1(int [] array) {
		int product = 1 ; 
		int result[] = new int[array.length] ; 
		for(int i = 0 ; i < array.length ; i++)
			product *= array[i] ; 
		for(int i = 0 ; i < array.length ; i ++)
			result[i] = product / array[i]  ;
		return result ; 
	}
	
	public static int[] product2(int [] array) {
		int result[] = new int [array.length ];
		int temp = 1;
		for(int i = 0 ; i < array.length ; i++) {
			result[i] = temp ; 
			temp *= array[i] ;
		}
		temp = 1; 
		for(int i = array.length - 1 ; i >= 0 ; i--) {
			result[i] *= temp ; 
			temp *= array[i] ;
		}
		return result  ;
	}
}
