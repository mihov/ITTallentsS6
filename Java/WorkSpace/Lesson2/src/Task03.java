import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� �: ");
		int a = sc.nextInt();

		System.out.print("�������� B: ");
		int b = sc.nextInt();

		System.out.println("���������� �� � � " + a);
		System.out.println("���������� �� B � " + b);

		System.out.println("���� �������");

		int temp = a;
		a = b;
		b = temp;

		System.out.println("���������� �� � � " + a);
		System.out.println("���������� �� B � " + b);

	}

}
