package ArraysAndStrings;

import java.util.Scanner;

public class OneEditAway {
	private static boolean isOneEditAway(String s, String t) {
		// TODO Auto-generated method stub
		// if lengths are equal then one replacement
		if(s.length()==t.length())
			return oneEditReplace(s,t);
		// if one string has greater length then one insertion or deletion 
		else if(s.length()+1 == t.length())
			return oneEditInsert(s,t);
		else if(s.length()-1==t.length())
			return oneEditInsert(t,s);
		return false;
	}

	private static boolean oneEditInsert(String s, String t) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=t.charAt(i))
				count++;
		}
		return (count==0||count==1);
	}

	private static boolean oneEditReplace(String small, String large ) {
		// TODO Auto-generated method stub
		int in1=0,in2=0;
		while(in1<small.length()&&in2<large.length()){
			if(small.charAt(in1)!=large.charAt(in2)){
				if(in1!=in2)
					return false;
				in2++;
			}
			else{
				in1++;
				in2++;
			}
				
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		String s= scan.nextLine();
		String t=scan.nextLine();
		scan.close();
		boolean result= isOneEditAway(s,t);
		System.out.println(result);

	}

	

}
