/*
 * Да се създаде метод, който приема за входни данни число N и
връща масив от числа с дължина N, който съдържа всички числа
от 1 до N.
 * */
public class Task12 {

	public static void main(String[] args) {
		
		printArray(createArray(10));

	}

	static int[] createArray(int size) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = i + 1;
		}

		return result;
	}

	static void printArray(int[] inputArray) {
		for (int i : inputArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
