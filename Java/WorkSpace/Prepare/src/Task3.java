/*
 * Write a method that finds and retrieves the difference between the minimum
and the maximum element in an array of numbers. Use recursion.
 * */
class Task3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,30};
		
		System.out.println(minDifferMax(arr, 0, Integer.MAX_VALUE, Integer.MIN_VALUE));

	}

	static int minDifferMax(int[] arr, int posit, int min, int max) {
		if (posit < arr.length) {
			if (min > arr[posit])
				min = arr[posit];
			if (max < arr[posit])
				max = arr[posit];
			return minDifferMax(arr, posit + 1, min, max);
		} else {
			return max - min;
		}

	}

}
