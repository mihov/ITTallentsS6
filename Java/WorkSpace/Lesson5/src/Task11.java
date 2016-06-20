import java.util.Scanner;

/*
 * Да се състави програма, която въвежда от клавиатурата 7 цели числа
в едномерен масив
Програмата да изведе всички числа кратни на 5, но по големи от 5.
Пример: -23, -55, 17, 75, 56, 105, 134
Изход: 75,105 - 2 числа
 * */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arrLen = 7;

		int[] intArray = new int[arrLen];

		System.out.print("Въведете " + arrLen + " цели числа: ");

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(sc.next().replace(",", ""));
		}

		int counter = 0;
		boolean first = true;
		for (int i : intArray) {
			

			if ((i > 5) && (i % 5 == 0)) {
				counter++;

				if (first) {
					first = false;
				} else {
					System.out.print(",");
				}
				System.out.print(i);
			}
		}
		
		System.out.println(" - "+counter+" числа.");

	}

}
