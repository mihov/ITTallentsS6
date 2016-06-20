import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		do {
			System.out.print("Въведете размер максималните множители [1..9] [1..9]:");
			String[] numbersAsString = sc.nextLine().split(" ");

			a = Integer.parseInt(numbersAsString[0]);
			b = Integer.parseInt(numbersAsString[1]);

		} while ((a < 0 || a > 9) || (b < 0 || b > 9));

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}

}
