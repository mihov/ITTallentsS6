import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ������ �� ����� ��������� ��� ������� [, ]:");
		String[] strArray = sc.nextLine().replaceAll(" " , "").split(",");

		int[] intArray = new int[strArray.length];

		int min = Integer.MAX_VALUE;
		boolean numberFound = false;

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
			if (intArray[i] < min) {
				min = intArray[i];
				numberFound = true;
			}
		}

		System.out.println(
				(numberFound) ? "���-������� ����� ������ �� 3 � " + min : "���� ������ ����� � ��������.");

		sc.close();

	}

}
