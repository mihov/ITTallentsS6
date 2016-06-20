import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете A:");
		int a = sc.nextInt();

		System.out.println("Въведете B:");
		int b = sc.nextInt();

		int sum = 0;
		int result;

		for (int i = a; i <= b; i++) {
			result = i * i;

			if (result > 200 || sum > 200) {
				break;
			}
			sum += result;

			if (i % 3 == 0) {
				System.out.print("skip 3");
				if (i <= b  && sum < 200) {
					System.out.print(", ");
				}
				continue;
			}

			System.out.print(result);
			if (i <= b  && sum < 200) {
				System.out.print(", ");
			}

		}
	}
}
