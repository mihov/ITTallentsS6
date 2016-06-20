import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		do {
			System.out.print("Въведете N [10..99]: ");
			n = sc.nextInt();

		} while (n < 10 || n > 99);

		boolean isFirst = true;
		while (n > 1) {

			if (n % 2 == 0) {
				n = n / 2;

			} else {

				n = n * 3 + 1;
			}

			if (isFirst) {
				isFirst = false;
			} else {
				System.out.print(" ");
			}
			System.out.print(n);
		}

	}

}
