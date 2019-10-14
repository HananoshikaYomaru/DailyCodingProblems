package dcp151to200.dcp186;

import java.util.* ; 
import common.* ; 

public class solution {
	
	public static int[][] smallestDiff2(Integer[] nums){
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		questionSetup(list1,list2, nums) ; 
		
		while(moveClosest(larger(list1,list2), smaller(list1,list2))) ; 
		
		return getResult(list1,list2) ;
	}
	
	public static boolean moveClosest(List<Integer> largerList, List<Integer> smallerList) {
		int diff = (sum(largerList) - sum(smallerList)) ; 
		int i = ListMethods.findClosestInteger(largerList, diff /2.0 ) ; 
		if(absolute(diff - 2 * largerList.get(i)) < diff) {
			smallerList.add(largerList.get(i));
			largerList.remove(i) ;
			return true ;
		}
		else 
			return false ;
	}
	
	public static int[][] smallestDiff(Integer[] nums){
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		questionSetup(list1,list2, nums) ; 

		do {
			moveNumFromLarger(larger(list1,list2), smaller(list1,list2)); 
			int smallerSum = sum(smaller(list1,list2)) ; 
			int largerSum = sum(larger(list1,list2)) ; 
			int nextDiff = largerSum - smallerSum - 2 * larger(list1,list2).get(0) ;
			if(absolute(nextDiff) >= largerSum - smallerSum)
				break ; 
		}while(true);
		
		return getResult(list1,list2) ;
	}
	
	private static void questionSetup(List<Integer> list1, List<Integer> list2, Integer[] nums) {
		List<Integer> temp = new ArrayList<>();
		for(int i= 0 ; i < nums.length ; i++)
			temp.add(nums[i]); 
		Collections.sort(temp);
		
		list1.add(temp.get(0)) ; 
		for(int i = 1 ; i < temp.size() ; i++)
			list2.add(temp.get(i));
	}
	
	private static int[][] getResult(List<Integer> list1, List<Integer> list2){
		int[][] result = new int[2][] ; 
		result[0] = new int[list1.size()] ;
		result[1] = new int[list2.size()] ; 
		for(int i = 0 ; i < list1.size() ; i++)
			result[0][i] = list1.get(i); 
		for(int i = 0 ; i < list2.size() ; i++)
			result[1][i] = list2.get(i) ; 
		return result ;
	}
	
	static List<Integer> larger(List<Integer> list1, List<Integer> list2) {
		if(sum(list1) > sum(list2))
			return list1 ; 
		else 
			return list2; 
	}
	
	static List<Integer> smaller(List<Integer> list1, List<Integer> list2){
		if(sum(list1) < sum(list2))
			return list1; 
		else 
			return list2; 
	}
	
	static void moveNumFromLarger(List<Integer> largerList, List<Integer> smallerList) {
		while(sum(smallerList) < sum(largerList)) {
			smallerList.add(largerList.get(0)) ; 
			largerList.remove(0);
		}
		
		Collections.sort(smallerList);
		Collections.sort(largerList);
	}
	
	static int sum(List<Integer> list) {
		int sum = 0; 
		for(Integer i : list)
			sum += i ;
		return sum ; 
	}
	
	static int absolute(int num) {
		if(num < 0) 
			return num * -1 ; 
		else 
			return num ; 
	}
			
}
