import java.util.Scanner;

public class Task1 {

	// private static sc;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� �:");
		double a = sc.nextDouble();

		System.out.println("�������� B:");
		double b = sc.nextDouble();

		System.out.println("�������� C:");
		double c = sc.nextDouble();

		if ((a < c && c < b) || (a > c && c > b)) {
			System.out.println("������� " + c + " � ����� " + a + " � " + b);
		} else {
			System.out.println("������� " + c + " �� � ����� " + a + " � " + b);
		}
	}
}
