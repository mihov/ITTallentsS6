import java.util.Scanner;

/*
 * Дадени са два едномерни масива с естествени числа.
Да се състави програма, която сравнява всички числа с еднакви
индекси от двата масива и записва в трети масив, по-голямото от
двете числа.
Да се изведе съдържанието и на трите масива
Пример:
18,19,32,1,3, 4, 5, 6, 7, 8
1, 2, 3,4,5,16,17,18,27,11
Изход:
18,19,32 ,4,5,16,17,18,27,11
 * */
public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Read array A
		System.out.println("Въведете първата редица от естествени числа");
		String[] strArray = sc.nextLine().replaceAll(" ", "").split(",");

		int[] intArrayA = new int[strArray.length];

		for (int i = 0; i < intArrayA.length; i++) {
			intArrayA[i] = Integer.parseInt(strArray[i]);
		}

		// Read array B
		System.out.println("Въведете втората редица от естествени числа");
		strArray = sc.nextLine().replaceAll(" ", "").split(",");

		int[] intArrayB = new int[strArray.length];

		for (int i = 0; i < intArrayB.length; i++) {
			intArrayB[i] = Integer.parseInt(strArray[i]);
		}

		int arrayCLength = Math.max(intArrayA.length, intArrayB.length);

		int[] intArrayC = new int[arrayCLength];

		// Print Array A
		System.out.println("\nArray A:");
		boolean isFirst = true;
		for (int i : intArrayA) {
			if (isFirst) {
				isFirst = false;
			} else {
				System.out.print(",");
			}
			System.out.print(i);
		}

		// Print Array B
		System.out.println("\nArray B:");
		isFirst = true;
		for (int i : intArrayB) {
			if (isFirst) {
				isFirst = false;
			} else {
				System.out.print(",");
			}
			System.out.print(i);
		}

		// Fill and Print Array C
		isFirst = true;
		System.out.println("\nArray C:");
		for (int i = 0; i < intArrayC.length; i++) {
			intArrayC[i] = Math.max(intArrayA[i], intArrayB[i]);

			if (isFirst) {
				isFirst = false;
			} else {
				System.out.print(",");
			}
			System.out.print(intArrayC[i]);
		}
	}
}
