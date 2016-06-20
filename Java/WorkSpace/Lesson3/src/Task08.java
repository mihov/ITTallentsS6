import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете n:");
		int n = sc.nextInt();
		int start = n - 1;

		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print(start);
			}
			start += 2;
			System.out.println();
		}

	}

}
