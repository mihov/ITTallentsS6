import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, m;
		do {
			System.out.print("Въведете N,M [10..5555]:");
			String[] numbersAsString = sc.next().split(",");

			n = Integer.parseInt(numbersAsString[0]);
			m = Integer.parseInt(numbersAsString[1]);

		} while ((n < 10 || n > 5555) || (m < 10 || m > 5555));

		if (n > m) {
			int temp = n;
			n = m;
			m = temp;
		}

		boolean isFirst = true;

		for (int i = m; i >= n; i--) {
			if (i % 50 == 0) {
				if (isFirst) {
					isFirst = false;
				} else {
					System.out.print(", ");
				}
				System.out.print(i);
			}
		}
	}

}
