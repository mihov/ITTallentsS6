import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mainArrayNumber = sc.nextInt();
		sc.close();

		int[] intArray = new int[10];

		intArray[0] = mainArrayNumber;
		intArray[1] = mainArrayNumber;

		for (int i = 2; i < intArray.length; i++) {
			intArray[i] = intArray[i - 1] + intArray[i - 2];
		}

		for (int i : intArray) {
			System.out.print(i + " ");
		}

	}

}
