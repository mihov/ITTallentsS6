/*
 * ����� �������� ����� �� �����, ����� ��������� �� ��������
�������������. �� �� ��������� ������ �� ���������� �� ������,
����� � ������������������� �� ���� ����
 * */
public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intMatrix = { { 1, 4, 15, 3 }, { 5, 1, 7, 2 }, { 4, 8, 1, 1 }, { 4, 8, 4, 2 } };

		int arraySum = GetArraySum(intMatrix);
		float avg = arraySum / (float)(intMatrix.length * intMatrix.length);

		System.out.println("������ �� ���������� �� ��������� � " + arraySum);
		System.out.println("�������������������� �� ���� ����� � " + avg);
	}

	static int GetArraySum(int[][] inputArray) {
		int sum = 0;
		for (int row = 0; row < inputArray.length; row++) {
			for (int col = 0; col < inputArray[row].length; col++) {
				sum += inputArray[row][col];
				System.out.println(inputArray[row][col]);
			}
		}
		System.out.println(sum);
		return sum;
	}

}
