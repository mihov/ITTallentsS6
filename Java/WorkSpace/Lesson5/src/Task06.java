import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ������ A (� ���������� ����� ����������): ");
		int[] intArrayA = ReadArray(sc.nextLine());

		System.out.print("�������� ������ B (� ���������� ����� ����������): ");
		int[] intArrayB = ReadArray(sc.nextLine());

		boolean areEqual = true;

		if (intArrayA.length == intArrayB.length) {
			for (int i = 0; i < intArrayB.length; i++) {
				if (intArrayA[i] != intArrayB[i]) {
					areEqual = false;
					break;
				}
			}

		} else {
			areEqual = false;
		}
		
		System.out.println("�������� �� "+(areEqual?"�������":"��������"));

	}

	static int[] ReadArray(String arrAsStr) {
		String[] strArray = arrAsStr.split(" ");

		int[] resultArray = new int[strArray.length];

		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = Integer.parseInt(strArray[i]);
		}

		return resultArray;
	}

}
