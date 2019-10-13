package dcp151to200.dcp189;

import java.util.* ; 

public class solution {
	public static int countElements(Object[] array) {
		List<Object> list = new ArrayList<>();
		for(int i  =0 ; i < array.length ;  i++)
			if(!list.contains(array[i]))
				list.add(array[i]);
		return list.size();
	}
}
