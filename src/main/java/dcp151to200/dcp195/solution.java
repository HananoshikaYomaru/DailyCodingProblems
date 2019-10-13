package dcp151to200.dcp195;

import java.util.*;

public class solution {
	public static int countBetween(int[][] matrix, int i1,int j1, int i2, int j2) {
		int smaller = matrix[j1][i1] ; 
		int larger = matrix[j2][i2];
		List<Integer> between = new ArrayList<>();
		for(int i = 0 ; i < matrix.length;i++)
			for(int j = 0 ; j < matrix[i].length ; j++)
				if(matrix[i][j] < smaller || matrix[i][j] > larger)
					between.add(matrix[i][j]);  
		return between.size()  ;
	}
}
