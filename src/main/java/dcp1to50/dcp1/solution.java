package dcp1to50.dcp1;

public class solution {
	public static boolean twoNumSumToK(int [] array, int k) {
		for(int i = 0; i < array.length ; i++)
			for(int  j= i + 1 ; j < array.length ; j++)
				if(array[i] + array[j] == k)
					return true ;
		return false ; 
	}
}
