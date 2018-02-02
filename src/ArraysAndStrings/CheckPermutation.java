package ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
	
	public static boolean checkStringPermutation(String s, String t) {
		// TODO Auto-generated method stub
		/* checking with Sort functions*/
		if(s.length()!=t.length())
			return false;
		
//		return sort(s).equals(sort(t));
		
/* Checking if two Strings have identical character count*/
		int [] index= new int[128];
		for(int i=0; i<s.length();i++){
			char c= s.charAt(i);
			char h= t.charAt(i);
			index[c]++;
			index[h]--;	
		}
		
		for(int x:index){
			if(x!=0) 
			return false;
		}
		return true;
		
	}

	private static String sort(String x) {
		char[] temp= x.toCharArray();
		Arrays.sort(temp);
		return new String (temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s= scan.nextLine();
		String t= scan.nextLine();
		scan.close();
		boolean result= checkStringPermutation(s,t);
		System.out.println(result);

	}

	

}
