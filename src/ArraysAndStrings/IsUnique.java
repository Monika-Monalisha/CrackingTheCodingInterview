package ArraysAndStrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsUnique {
	
	public static boolean IsStringUnique(String s) {
		// TODO Auto-generated method stub
		
		if(s.length()> 128)
			return false;
//with extra data structure
//o(n) time and o(1) space
		Set<Character> res= new HashSet<>();
		for(int i=0; i<s.length();){
			char c= s.charAt(i);
			if(res.add(c)) {
				i++;
			}
			else return false;	
		}
		
		return true;
		
		
/* without any additional data structure 
o(n2) time and o(1) space*/
			
//			for(int i=0;i<s.length();i++){
//				for(int j=i+1; j<s.length();j++){
//					if(s.charAt(i)==s.charAt(j))
//						return false;		
//				}
//			}
		
/* without any additional data structure 
o(n) time and o(1) space Using Bit Vector*/		
		
	}
	
	
	
	
	public static void main (String[] args){
		Scanner scan= new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		boolean result= IsStringUnique(s);
		System.out.println(result);
		
		
	}

	

}

