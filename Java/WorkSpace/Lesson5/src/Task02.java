import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Въведете редица от числа разделена със запетая [, ]:");
		String[] strArray = sc.nextLine().replaceAll(" ", "").split(",");
		
		sc.close();

		int[] intArray = new int[strArray.length];

		int len = intArray.length;

		for (int i = 0; i < len / 2; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
			intArray[len - i - 1] = Integer.parseInt(strArray[i]);

		}

		if (len % 2 != 0) {
			intArray[len / 2] = Integer.parseInt(strArray[len / 2]);
		}

		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}

}
