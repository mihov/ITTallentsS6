
public class Task05 {

	public static void main(String[] args) {

		int elementCount = 10;
		int[] intArray = new int[elementCount];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i * 3;
		}

		for (int i : intArray) {
			System.out.print(i + " ");
		}

	}

}
