import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете първото число:");
		int dig1 = sc.nextInt();

		System.out.println("Въведете първото число:");
		int dig2 = sc.nextInt();

		if (dig1 > dig2) {
			int temp = dig1;
			dig1 = dig2;
			dig2 = temp;
		}

		for (int i = dig1; i <= dig2; i++) {
			System.out.print(i + " ");
		}

	}

}
