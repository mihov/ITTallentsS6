/*
 * ����� ������������� �������� ��������� �� �������� � ��������
����� - ���������� �����.
�� �� ������� ��������, ���� ����� �� �������� ����������� ��
���������� � �������� ����� ���� ���������� �� �� +90 �������.
������:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
�����
13,9,5,1
14,10,6,2
15,11,7,3
16,12,8,4
 * */
public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] initialArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		System.out.println("���������� �������:");
		PrintArray(initialArray);

		System.out.println("\n�������� �� 90 ������� �������:");
		// Rotate and print
		PrintArray(RotateArray(initialArray));
	}

	// Rotate array
	static int[][] RotateArray(int[][] inputArray) {

		int[][] result = new int[inputArray.length][inputArray.length];

		for (int row = 0; row < inputArray.length; row++) {
			for (int col = 0; col < inputArray[row].length; col++) {
				result[col][inputArray.length - row - 1] = inputArray[row][col];
			}
		}
		return result;
	}

	// Print array
	static void PrintArray(int[][] inputArray) {
		for (int row = 0; row < inputArray.length; row++) {
			for (int col = 0; col < inputArray[row].length; col++) {
				System.out.print(inputArray[row][col] + " ");
			}
			System.out.println();
		}
	}

}
