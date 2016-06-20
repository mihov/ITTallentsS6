import java.util.Scanner;

/*
 * Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
 * */
public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете масив (с разстояние между елементите): ");
		String[] arrayA = sc.nextLine().split(" ");

		int maxLen = 1;
		String element = arrayA[0];
		int tempMaxLen = 1;
		String tempElement = arrayA[0];

		for (int i = 1; i < arrayA.length; i++) {
			if (tempElement.equals(arrayA[i])) {
				tempMaxLen++;
			} else {
				if (tempMaxLen > maxLen) {
					element = tempElement;
					maxLen = tempMaxLen;
				}
				tempElement = arrayA[i];
				tempMaxLen = 1;
			}
		}
		
		if (tempMaxLen > maxLen) {
			element = tempElement;
			maxLen = tempMaxLen;
		}

		System.out.print("Най-дългата редица от еднакви поредни елементи е: ");
		for (int i = 1; i <= maxLen; i++) {
			System.out.print(element + " ");
		}
	}
}
