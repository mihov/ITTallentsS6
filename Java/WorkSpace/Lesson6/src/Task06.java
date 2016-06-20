/*
 * Имате предварително въведени стойности от естествени числа.
Числата са въведени в квадратна таблица с размери 6 реда и 6
колони.
Да се състави програма, чрез която се намира сумата на всички
елементи от редовете с четни номера: 2,4 и 6.
Програмата да извежда и сумата на всеки отделен ред.
Пример:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
Изход:
21,22,23,24,25,26 сума 141
41,42,43,44,45,46 сума 261
61,62,63,64,65,66 сума 381
Сума на елементите 783
 * */
public class Task06 {

	public static void main(String[] args) {
		int[][] initialMatrix = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int rowSSum = 0;

		System.out.println("В тази матрица");
		PrintArray(initialMatrix);
		System.out.println("\nЧетните редове и  техните суми са:");

		for (int row = 1; row < initialMatrix.length; row += 2) {

			int rowSum = 0;
			boolean isFirst = true;

			for (int col = 0; col < initialMatrix[row].length; col++) {
				rowSum += initialMatrix[row][col];
				if (isFirst) {
					isFirst = false;
				} else {
					System.out.print(", ");
				}
				System.out.print(initialMatrix[row][col]);
			}
			System.out.println(" сума " + rowSum);
			rowSSum += rowSum;

		}
		System.out.println("Сума на елементите " + rowSSum);

	}

	// Calculate a row
	static int CalcArraySum(int[] inputArray) {
		int result = 0;
		for (int col = 0; col < inputArray.length; col++) {
			result += inputArray[col];
		}
		return result;
	}

	// Print array
	static void PrintArray(int[][] inputArray) {
		for (int row = 0; row < inputArray.length; row++) {
			for (int col = 0; col < inputArray[row].length; col++) {
				System.out.print(inputArray[row][col] + " ");
			}
			System.out.println();
		}
	}
}
