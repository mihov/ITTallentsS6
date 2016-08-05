package ArrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		int[] arr2 = {1,2,3,4,5};
		
		arr1.add(6);
		arr1.add(7);
		arr1.add(8);
		arr1.add(9);

		Integer[] arr3 = (Integer[])arr1.toArray(new Integer[arr1.size()]);

		
	}

}
