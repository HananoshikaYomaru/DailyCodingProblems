package dcp151to200.dcp197;

public class RotateArray {
	public static int[] rotateRight(int[] array, int k ) {
		int[] newArray = new int[array.length] ; 
		for(int i = 0 ; i < array.length; i++)
			newArray[(i + k) % array.length ] = array[i] ; 
		return newArray; 
	}
	
	public static int[] rotateLeft(int[] array, int k ) {
		int[] newArray = new int[array.length] ; 
		for(int i = 0 ; i < array.length; i++)
			newArray[(i - k) % array.length ] = array[i] ; 
		return newArray; 
	}
}
