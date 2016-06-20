import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean isFirst = true;
		int n;
		do {
			System.out.println("Въведете N[2..27]:");
			n = sc.nextInt();
		} while (n < 2 || n > 27);

		int p0, p1, p2;

		for (int counter = 100; counter < 1000; counter++) {
			p0 = counter % 10;
			p1 = (counter / 10) % 10;
			p2 = (counter / 100) % 10;

			if (p0 + p1 + p2 == n) {

				if (isFirst) {
					isFirst = false;
				} else {
					System.out.print(", ");
				}

				System.out.print(counter);

			}
		}

	}

}
