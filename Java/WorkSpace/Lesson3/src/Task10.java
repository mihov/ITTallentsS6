import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете A:");
		int a = sc.nextInt();

		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println(a + " is prime.");
		} else {
			System.out.println(a + " is NOT prime");
		}

	}

}
