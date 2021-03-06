import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] intArr = { 6, 82, 12, 1, 4, 59, -32, 61 };

		System.out.println("Original:");
		System.out.println(Arrays.toString(intArr));

		selectionSort(intArr);

		System.out.println("Sorted:");
		System.out.println(Arrays.toString(intArr));

	}

	static void selectionSort(int[] arr) {
		int start = 0;
		int end = arr.length;
		
		for (int i = 0; i < arr.length/2; i++) {

			int max = arr[i];
			int min = arr[i];

			int maxPos = i;
			int minPos = i;

			for (int j = start; j < end; j++) {

				//System.out.println("[" + i + ":" + j + "]");
				if (arr[j] > max) {
					max = arr[j];
					maxPos = j;
				}

				if (arr[j] < min) {
					min = arr[j];
					minPos = j;
				}
			}

			swap(arr, minPos, i, min);
			if(i==maxPos) maxPos = minPos; 
			swap(arr, maxPos, arr.length - i - 1, max);
			start++;
			end--;
		}
	}

	static void swap(int[] arr, int findPos, int edgePos, int value) {
		//System.out.print(Arrays.toString(arr));
		arr[findPos] = arr[edgePos];
		arr[edgePos] = value;
		//System.out.print(String.format(" [%d > %d | %d > %d] ", arr[findPos], findPos, value, edgePos));
		//System.out.println(Arrays.toString(arr));
	}

}
