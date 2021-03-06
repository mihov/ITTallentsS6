import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int[] intArr = { 6, 82, 12, 1, 4, 59, -32, 61 };

		System.out.println("Original:");
		System.out.println(Arrays.toString(intArr));

		bubleSort(intArr);

		System.out.println("Sorted:");
		System.out.println(Arrays.toString(intArr));
	}

	static void bubleSort(int[] arr) {
		boolean hasSwapped = true;
		int endTo = arr.length;
		
		int cout = 1;
		
		while (hasSwapped) {
			hasSwapped = false;
			
			for (int i = 0; i < endTo - 1; i++) {
				
				System.out.println( cout++ + " > " + Arrays.toString(arr));
				
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					hasSwapped = true;
				}

			}
			endTo--;
		}
	}
}
