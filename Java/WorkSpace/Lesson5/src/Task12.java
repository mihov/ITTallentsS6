import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� ������������� �������� 7
����� � ��������� ����� �� �������� ������� �� �������� � �������:
- 0 � 1 ���� ����� ����������;
- 2 � 3 ���� ��������;
- 4 � 5 ���� ���������.
������: 1,2,3,4,5,6,7
�����: 2,1,4,3,6,5,7
*/
public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arrLen = 7;
		// Read array
		System.out.print("�������� " + arrLen + " ���� �����: ");
		int[] intArray = ReadArray(sc.nextLine());

		// 0 - 1
		int temp = intArray[0];
		intArray[0] = intArray[1];
		intArray[1] = temp;

		// 2 - 3
		int sum = intArray[2] + intArray[3];
		intArray[2] = sum - intArray[2];
		intArray[3] = sum - intArray[3];

		// 4 - 5
		int mul = intArray[4] * intArray[5];
		intArray[4] = mul / intArray[4];
		intArray[5] = mul / intArray[5];

		// Print
		boolean first = true;
		for (int i : intArray) {

			if (first) {
				first = false;
			} else {
				System.out.print(",");
			}
			System.out.print(i);
		}
	}

	// Read Array
	static int[] ReadArray(String arrAsStr) {
		String[] strArray = arrAsStr.split(",");

		int[] resultArray = new int[strArray.length];

		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = Integer.parseInt(strArray[i]);
		}
		return resultArray;
	}

}
