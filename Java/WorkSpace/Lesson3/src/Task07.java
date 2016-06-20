import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		System.out.println("Въведете n:");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i * 3);
			if (i != num) {
				System.out.print(", ");
			}
		}

	}

}
