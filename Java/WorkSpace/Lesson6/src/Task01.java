
public class Task01 {

	public static void main(String[] args) {
		int[][] array2D_6x5 = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 }, { 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };

		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;

		for (int row = 0; row < array2D_6x5.length; row++) {
			for (int col = 0; col < array2D_6x5[row].length; col++) {
				if (minValue > array2D_6x5[row][col]) {
					minValue = array2D_6x5[row][col];
				}
				if (maxValue < array2D_6x5[row][col]) {
					maxValue = array2D_6x5[row][col];
				}
			}
		}

		System.out.println("���-�����  " + minValue);
		System.out.println("���-������ " + maxValue);

	}

}
