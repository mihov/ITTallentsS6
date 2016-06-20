/*
 * �� �� ������� �����, ����� ������ ��� ������ �� ����� � �����
�����, �������� ������ �������� �� ���������� ������, ���� �
������� ���� �� ������ �� ���������� �� ������ ������� �����,
� ��� ������� ���� � ���� �� ������ ������� �����.
 * */
public class Task13 {

	public static void main(String[] args) {

		printArray(appendTwoArrays(createArray(5), createArray(8)));

	}

	// appendTwoArrays
	static int[] appendTwoArrays(int[] arrayA, int[] arrayB) {
		int[] result = new int[arrayA.length + arrayB.length];

		int next = arrayA.length;

		for (int i = 0; i < arrayA.length; i++) {
			result[i] = arrayA[i];
		}

		for (int i = 0; i < arrayB.length; i++) {
			result[i + next] = arrayB[i];
		}

		return result;

	}

	// createArray
	static int[] createArray(int size) {
		int[] result = new int[size];
		for (int i = 0; i < result.length; i++) {
			result[i] = i + 1;
		}

		return result;
	}

	// printArray
	static void printArray(int[] inputArray) {
		for (int i : inputArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
