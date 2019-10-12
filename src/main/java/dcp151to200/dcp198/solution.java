package dcp151to200.dcp198;

import java.util.Arrays; 
import java.util.ArrayList;
import java.util.List; 

public class solution {
	public static int[] multiple(int[] array) {
		Arrays.sort(array) ;
		List<Integer> multiple = new ArrayList<>();  
		int maxSize = 0 ; 
		for(int i = 0 ; i < array.length ; i++ ) {
			List<Integer> temp = new ArrayList<>(); 
			temp.add(array[i]);
			for(int j = i + 1  ; j < array.length ; j++)
				if(array[j] % temp.get(temp.size()-1) == 0)
					temp.add(array[j]) ; 
			if(temp.size() > maxSize){
				multiple.clear();
				multiple.addAll(temp) ; 
				maxSize = temp.size() ; 
			}
		}
		return turnInt(multiple);
	}
	
	private static int[] turnInt(List<Integer> list) {
		int[] result = new int[list.size()] ; 
		for(int i = 0 ; i < list.size() ; i++) {
			result[i] = list.get(i) ;
		}
		return result ; 
	}
}
