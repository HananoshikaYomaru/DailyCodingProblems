package dcp151to200.dcp196;

import java.util.* ; 

public class MostFrequentSum {
	public static Integer find(Tree tree) { 
		for(int i = tree.nodes.size() - 1 ; i > 0 ; i--) {
			if (!tree.nodes.get(i).disable) {
				if((i-2)%2 == 0)//the multiple of 2 
					tree.nodes.get((i-2)/2).num += tree.nodes.get(i).num ;
				else
					tree.nodes.get((i-1)/2).num += tree.nodes.get(i).num ;
			}
		}
		return mostFrequentSum(tree) ; 
	}
	
	private static Integer mostFrequentSum(Tree tree) {
		List<Frequency> countList = new ArrayList<>();
		for(int i = 0  ; i < tree.nodes.size() ; i++)
			if(!tree.nodes.get(i).disable)
				checkExist(countList, tree.nodes.get(i).num); 
		Integer mostFrequentSum = null ; 
		int maxFrequency = 0; 
		for(Frequency f : countList)
			if(f.frequency > maxFrequency) {
				maxFrequency = f.frequency ; 
				mostFrequentSum = f.num ; 
			}
		return mostFrequentSum ; 	
	}
	
	private static void checkExist(List<Frequency> countList, int num) {
		for(Frequency f : countList)
			if(num == f.num) 
				f.frequency++ ;
		countList.add(new Frequency(num)) ; 
	}
	
	public static class Frequency{
		int num ; 
		int frequency; 
		public Frequency(int num) {
			this.num = num ; 
			frequency = 1 ; 
		}
	}
}
