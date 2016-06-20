import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете А:");
		int a = sc.nextInt();

		System.out.println("Въведете B:");
		int b = sc.nextInt();

		System.out.println("Въведете C:");
		int c = sc.nextInt();

		if (a >= b && b >= c) {
			System.out.println(a + " " + b + " " + c);
		}

		if (a >= c && c >= b) {
			System.out.println(a + " " + c + " " + b);
		}

		if (b >= c && c >= a) {
			System.out.println(b + " " + c + " " + a);
		}

		if (b >= a && a >= c) {
			System.out.println(b + " " + a + " " + c);
		}
		if (c >= a && a >= b) {
			System.out.println(c + " " + a + " " + b);
		}
		if (c >= b && b >= a) {
			System.out.println(c + " " + b + " " + a);
		}

	}

}
