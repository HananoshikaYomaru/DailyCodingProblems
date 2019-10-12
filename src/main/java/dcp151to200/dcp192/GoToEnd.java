package dcp151to200.dcp192;

public class GoToEnd {
	public static boolean goToEnd(int[] array, int currentIndex) {
		if(currentIndex == array.length - 1) 
			return true ;
		else 
			for (int i = 1 ; i <= array[currentIndex]  ; i++) {
				int nextIndex = currentIndex + i ; 
				if(goToEnd(array, nextIndex ))
					return true;
			}
		return false ; 
	}
}
