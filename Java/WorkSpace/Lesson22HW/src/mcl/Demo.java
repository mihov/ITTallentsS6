package mcl;

import java.util.*;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> charCounter = new HashMap<Character, Integer>();
		TreeSet<CharInt> charSorted = new TreeSet<CharInt>();

		System.out.print("Please enter some text: ");
		char[] theText = sc.nextLine().toUpperCase().toCharArray();
		System.out.println("\nMost common letters:\n");

		//
		for (char c : theText) {
			if (c >= 'A' && c <= 'Z') {
				if (charCounter.containsKey(c)) {
					charCounter.replace(c, charCounter.get(c) + 1);
				} else {
					charCounter.put(c, 1);
				}
			}
		}

		//
		for (Entry<Character, Integer> e : charCounter.entrySet()) {
			charSorted.add(new CharInt((Character) e.getKey(), (Integer) e.getValue()));
		}

		int max = charSorted.iterator().next().val;
		double step = 20.0 / max;
		
		//
		for (CharInt c : charSorted) {
			System.out.println(c.key + ": " + c.val + "\t" + printStars(step * c.val));
		}

	}

	private static String printStars(double d) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < (int) d; i++) {
			result.append('#');
		}
		return result.toString();
	}

}
