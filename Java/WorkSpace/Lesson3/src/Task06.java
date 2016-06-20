import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Въдете число:");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("Резултата е " + sum);
	}

}
