/*
 * �� �� ������� ��������, ��� ����� ������������� �� ��������
���������� ����� � �������� ����� 4*4 ��������.
���������� �� ������� �������� �� ���������� ����� � �������������
�� ���-�������� ���� �� ������ ������ ���-�������� ���� �� ������.
������:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16

�����:
���-������ ���� �� ������ 58
���-������ ���� �� ������ 40
������������ ���� �� ������ � > �� ������������ ���� �� ������

 * */
public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] initialArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[] colSum = new int[initialArray.length];
		int maxRowSum = 0;
		int maxColSum = 0;
		int tempRowSum = 0;
		int tempColSum = 0;

		System.out.println("� ���������:");
		PrintArray(initialArray);

		for (int row = 0; row < initialArray.length; row++) {
			tempRowSum = CalcArraySum(initialArray[row]);
			if (maxRowSum < tempRowSum) {
				maxRowSum = tempRowSum;
			}
			for (int col = 0; col < initialArray[row].length; col++) {
				colSum[col] += initialArray[row][col];
			}
		}

		maxColSum = GetMaxValue(colSum);

		System.out.println("���-������ ���� �� ������ " + maxRowSum);
		System.out.println("���-������ ���� �� ������ " + maxColSum);
		System.out.println("������������ ���� �� ������ � "
				+ ((maxRowSum > maxColSum) ? ">" : ((maxRowSum < maxColSum) ? "<" : "="))
				+ " �� ������������ ���� �� ������");

	}

	// Calculate a row
	static int CalcArraySum(int[] inputArray) {
		int result = 0;
		for (int col = 0; col < inputArray.length; col++) {
			result += inputArray[col];
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

	// Return max value in given array
	static int GetMaxValue(int[] inputArray) {
		int maxValue = Integer.MIN_VALUE;
		for (int col = 0; col < inputArray.length; col++) {
			if (maxValue < inputArray[col]) {
				maxValue = inputArray[col];
			}
		}
		return maxValue;
	}

}
