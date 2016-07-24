package main;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] a1 = { 8, 3, 10, 24, 0, 4, 7, 14 };
		int[] a2 = { 4, 0, 5, 3, 9, 4 };

		int[] result = devideArrays(a1, a2);

		System.out.println(Arrays.toString(result));

	}

	private static int[] devideArrays(int[] a1, int[] a2) {
		int[] result = null;

		try {
			result = new int[Math.min(a1.length, a2.length)];
		} catch (NullPointerException e) {
			System.out.println("You can not use null array!");
			return null;
		}

		for (int i = 0; i < result.length; i++) {
			try {
				result[i] = a1[i] / a2[i];
			} catch (ArithmeticException e) {
				System.out.println("You can not devide by zero!");
				result[i] = 0;
			}
		}
		return result;
	}
}
