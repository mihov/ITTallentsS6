
public class Task23 {

	public static void main(String[] args) {
		int row = 1;
		int col = 1;
		while (row <= 9) {
			System.out.print(row + "*" + col + "; ");
			col++;
			if (col > 9) {
				row++;
				col = row;
				System.out.println();
			}

		}

	}

}
