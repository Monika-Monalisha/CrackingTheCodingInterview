package ArraysAndStrings;

import java.util.Scanner;

public class URLify {
	private static String replaceSpaces(String s) {
/* Using Inbuilt String function replaceAll() */
		// String newS= s.replaceAll(" ", "%20");
		// return newS;

/* Using character array */
//		int count = 0, index = 0;
//		char array[] = s.toCharArray();
//		for (int i = 0; i < array.length - 1; i++) {
//			if (array[i] == ' ')
//				count++;
//		}
//		index = (int) array.length + count * 2;
//		char array1[] = new char[index];
//		if (array.length < s.length())
//			array1[index] = '\0';// end of the array
//		for (int i = array.length - 1; i > 0; i--) {
//			if (array[i] == ' ') {
//				array1[index - 1] = '0';
//				array1[index - 2] = '2';
//				array1[index - 3] = '%';
//				index = index - 3;
//			} else {
//				array1[index - 1] = array[i];
//				index--;
//			}
//		}
//
//		return new String (array1);

/* Using string builder */
		 StringBuilder b= new StringBuilder();
		 for (int i=0;i<s.length();i++){
		 if(s.charAt(i)==' ')
		 b.append("%20");
		 else b.append(s.charAt(i));
		 }
		 return b.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		String result = replaceSpaces(s);
		System.out.println(result);

	}

}
