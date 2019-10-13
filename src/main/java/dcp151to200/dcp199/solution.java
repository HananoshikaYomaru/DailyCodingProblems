package dcp151to200.dcp199;

import java.util.* ; 

public class solution {
	public static String completeParenthesis(String str){
		List<Character> list = new ArrayList<>();
		for(char c : str.toCharArray())
			list.add(c)  ;
		
		for(int i = 0 ; i < list.size() ; i = i + 2 )
		{
			if(i + 1 == list.size() && list.get(i) == '(')
				list.add(')') ; 		
			if(list.get(i) == '(' && list.get(i+ 1) == ')')
				continue ; 
			else if (list.get(i) == ')')
				list.add(i, '(');
			else 
				list.add(i+ 1, ')')  ;
		}
		
		StringBuilder sb = new StringBuilder();
		for(Character ch: list)
			sb.append(ch ); 
		
		String result = sb.toString(); 
		
		return  result; 
	}
}
