import java.math.BigInteger;
import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("Въведете N: ");
			n = sc.nextInt();
		} while (n < 1);

		int fact = 1;
		do {
			fact *= n;
			n--;
		} while (n > 0);

		System.out.println(fact);

	}

}
