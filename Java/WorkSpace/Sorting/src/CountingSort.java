import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] intArr = { 3, 3, 6, 2, 4, 3, 2, 3, 2, 6, 50 };
		System.out.println("Original:");
		System.out.println(Arrays.toString(intArr));

		countingSort(intArr);

		System.out.println("Sorted:");
		System.out.println(Arrays.toString(intArr));

	}

	static void countingSort(int[] arr) {
		int max = arr[0];
		int min = arr[0];

		for (int i : arr) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
		}

		int[] countArr = new int[max - min + 1];

		for (int i : arr) {
			countArr[i - min]++;
		}
		System.out.println(Arrays.toString(countArr));

		int position = 0;
		for (int i = 0; i < countArr.length; i++) {
			for (int j = 0; j < countArr[i]; j++) {
				arr[position] = i + min;
				position++;
			}
		}
	}
}
