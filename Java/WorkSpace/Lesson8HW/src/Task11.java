/*Да се създаде метод, който отпечатва масив в конзолата.*/
public class Task11 {

	public static void main(String[] args) {

		printArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		printArray(new char[] { 'q', 'w', 'e', 'r', 't', 'y', 'u' });
		printArray(new float[] { 1.2f, 2.3f, 3.4f, 4.5f, 5.66f, 6f, 7f, 8f, 9f, 10f });
		printArray(new String[] { "qwe", "rtyuiop", "qazwsx" });

	}

	static void printArray(int[] inputArray) {
		for (int i : inputArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void printArray(char[] inputArray) {
		for (char i : inputArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void printArray(float[] inputArray) {
		for (float i : inputArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static void printArray(String[] inputArray) {
		for (String i : inputArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
