import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read matrix size
		int size = 0;
		do {
			System.out.print("����� � ������������ �� ������ [����������� �����]");
			size = sc.nextInt();
			sc.nextLine();
		} while (size < 1);

		// Create the matrix
		// int[][] intMatrix = { { 1, 4, 6, 3 }, { 5, 9, 7, 2 }, { 4, 8, 1, 9 },
		// { 2, 3, 4, 5 } };
		int[][] intMatrix = new int[size][size];

		// Read Matrix
		System.out.println("�������� �������� �� ���������, ��������� ��� �������:");
		for (int row = 0; row < intMatrix.length; row++) {
			String[] tempAttay = sc.nextLine().split(",");
			for (int col = 0; col < intMatrix[row].length; col++) {
				intMatrix[row][col] = Integer.parseInt(tempAttay[col]);
			}

		}

		// print Matrix
		System.out.println("��������� �������� �������");
		for (int row = 0; row < intMatrix.length; row++) {
			for (int col = 0; col < intMatrix[row].length; col++) {
				System.out.print(intMatrix[row][col] + " ");
			}
			System.out.println();
		}

		// read diagonals
		int[] leftDiagonal = new int[intMatrix.length];
		int[] rightDiagonal = new int[intMatrix.length];

		for (int i = 0; i < rightDiagonal.length; i++) {
			rightDiagonal[i] = intMatrix[i][i];
			leftDiagonal[i] = intMatrix[i][size - 1 - i] ;
		}

		// Print Diagonals
		System.out.println("����������� ��:");

		for (int i : rightDiagonal) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i : leftDiagonal) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
