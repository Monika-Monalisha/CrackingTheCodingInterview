package ArraysAndStrings;

import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class PalindromePermutation {
	private static boolean isPermutaionofPalindrome(String s) {
/* o(n) time and o(n) space extra DS- hashmap */
		int count = 0;
		// HashMap<Character, Integer> maps = new HashMap<>();
		// for (int i = 0; i < s.length(); i++) {
		// char c = Character.toLowerCase(s.charAt(i));
		//
		// if (Character.isLetter(c)) {
		// if (maps.containsKey(c))
		// maps.put(c, maps.get(c) + 1);
		// else
		// maps.put(Character.toLowerCase(c), 1);
		// }
		// }
		// for (Character c : maps.keySet()) {
		// if (maps.get(c) % 2 == 1)
		// count++;
		// }

/* o(n) time and o(n) space extra DS- int Array */
		int[] index = new int[26];
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				char c = Character.toLowerCase(s.charAt(i));
				index[c - 'a']++;
			}
		}
		for (int num : index) {
			if (num % 2 == 1)
				count++;
		}

		if (count <= 1)

			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		boolean result = isPermutaionofPalindrome(s);
		System.out.println(result);

	}

}
