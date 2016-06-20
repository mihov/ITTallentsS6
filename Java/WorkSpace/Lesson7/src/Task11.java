import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			Scanner sc = new Scanner(System.in);
			int dimention = sc.nextInt();
			System.out.println();
			PrintMatrix(FillA(dimention));
			System.out.println();
			PrintMatrix(FillB(dimention));
			System.out.println();
			PrintMatrix(FillC(dimention));
			System.out.println();
			PrintMatrix(FillD(dimention));
		}
	}

	static void PrintMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print((matrix[i][j]<10?" ":"")+matrix[i][j] + ((j + 1 < matrix[i].length) ? " " : "\n"));
			}
		}
	}

	static int[][] FillA(int size) {
		int[][] theMatrix = new int[size][size];
		int counter = 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				theMatrix[j][i] = counter;
				counter++;
			}
		}
		return theMatrix;
	}

	static int[][] FillB(int size) {
		int counter = 1;
		int[][] theMatrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < size; j++) {
					theMatrix[j][i] = counter;
					counter++;
				}
			} else {
				for (int j = (size - 1); j >= 0; j--) {
					theMatrix[j][i] = counter;
					counter++;
				}
			}
		}
		return theMatrix;

	}

	static int[][] FillC(int size) {
		// Calculate elements of the matrix
		int elements = size * size;

		// Define the matrix
		int[][] theMatrix = new int[size][size];

		// Set start position
		int row = size - 1;
		int col = 0;
		int counter = 1;

		while (counter <= elements) {
			// Fill current cell
			theMatrix[row][col] = counter;

			// Go to next elemet and cell
			counter++;
			col++;
			row++;

			// Diagonal reached
			if (row == size && col == size) {
				// Move to proper cell
				row = 0;
				col = 1;
			}

			// Bottom reached
			if (row == size) {
				// Move to proper cell
				row = size - col - 1;
				col = 0;
			}

			// Right end reached
			if (col == size) {
				// Move to proper cell
				col = size - row + 1;
				row = 0;
			}
		}
		return theMatrix;
	}

	static int[][] FillD(int size) {
		int elements = size * size;

		// Define the matrix
		int[][] theMatrix = new int[size][size];

		// Set start position and direction
		int row = 0;
		int col = 0;
		char direction = 'D';
		int counter = 1;

		while (counter <= elements) {
			// Fill current cell
			theMatrix[row][col] = counter;

			// Go to next element
			counter++;

			// Go to next proper cell in depend of current direction
			switch (direction) {
			case 'D':
				row++;
				break;
			case 'L':
				col--;
				break;
			case 'U':
				row--;
				break;
			case 'R':
				col++;
				break;
			default:
				break;
			}

			// Change the direction if edge of the matrix was reached or the
			// cell is not empty.
			if ((row < 0) || (row == size) || (col < 0) || (col == size) || theMatrix[row][col] > 0) {
				switch (direction) {
				case 'D':
					row--;
					col++;
					direction = 'R'; // Change the direction to right
					break;

				case 'R':
					col--;
					row--;
					direction = 'U'; // Change the direction to up
					break;

				case 'U':
					row++;
					col--;
					direction = 'L'; // Change the direction to left
					break;

				case 'L':
					row++;
					col++;
					direction = 'D'; // Change the direction to down
					break;

				default:
					break;
				}
			}
		}

		return theMatrix;
	}
}
