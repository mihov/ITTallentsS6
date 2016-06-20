import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		String symbol;
		do {
			System.out.print("Въведете размер n и символ за изчертаване [3..20] [символ]:");
			String[] numbersAsString = sc.nextLine().split(" ");

			n = Integer.parseInt(numbersAsString[0]);
			symbol = numbersAsString[1];

		} while ((n < 3 || n > 20));

		// line
		PrintLine(n, "*");
		NewL();

		// body
		for (int i = 1; i <= n - 2; i++) {
			PrintLine(1, "*");

			PrintLine(n-2, symbol);

			PrintLine(1, "*");
			NewL();
		}

		// last
		PrintLine(n, "*");

	}

	static void PrintLine(int size, String symbol) {
		for (int i = 1; i <= size; i++) {
			System.out.print(symbol);
		}
	}

	static void NewL() {
		System.out.println();
	}

}
