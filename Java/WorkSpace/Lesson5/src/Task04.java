import java.util.Scanner;

public class Task04 {

	//=====================================================================
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете редица от числа разделена със запетая [, ]:");

		int[] intArray = ReadArray(sc.nextLine());

		System.out.println("Масива " + (isItAPalindrom(intArray) ? "е " : "не е ") + "огледален.");

		for (int i : intArray) {
			System.out.println(i + " ");
		}
	}

	// =====================================================================
	static int[] ReadArray(String arrAsStr) {
		String[] strArray = arrAsStr.split(" ");

		int[] resultArray = new int[strArray.length];

		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = Integer.parseInt(strArray[i]);
		}

		return resultArray;
	}

	// =====================================================================
	static boolean isItAPalindrom(int[] candidate) {
		int first = 0;
		int last = candidate.length - 1;

		while (last > first) {
			if (candidate[first] != candidate[last]) {
				return false;
			}
			first++;
			last--;
		}
		return true;
	}

}
