import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		int[] arr = { 3213, 1322, 123, 221, 9737, 233, 92, 23, 9, 85181 };
		System.out.println(Arrays.toString(arr));
		int max = arr[0];
		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}

		max = String.valueOf(max).length();

		int[] result = new int[arr.length];
		int[] resultTemp = new int[arr.length];

		for (int i = 0; i < max; i++) {
			for (int j = 0; j < arr.length; j++) {
				resultTemp[j] = digitAtPos(arr[j], i);
			}
			System.out.println(Arrays.toString(resultTemp));

			countingSort(resultTemp);
			
			System.out.println(Arrays.toString(resultTemp));
			for (int j = 0; j < arr.length; j++) {
				result[j] = result[j] + resultTemp[j] * pow10(i);
			}
			System.out.println(Arrays.toString(result));
			System.out.println("===========================");
			

		}
		System.out.println(Arrays.toString(result));

		int[] helpArr = new int[10];

	}

	static int digitAtPos(int theDigit, int thePos) {
		for (int i = 0; i < thePos; i++) {
			theDigit /= 10;
		}
		return theDigit % 10;
	}

	static int pow10(int pow) {
		int result = 1;
		for (int i = 0; i < pow; i++) {
			result *= 10;
		}
		return result;
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
