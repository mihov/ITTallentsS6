import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� a1:");
		int a1 = sc.nextInt();

		System.out.println("�������� a2:");
		int a2 = sc.nextInt();

		System.out.println("�������� a3:");
		int a3 = sc.nextInt();

		System.out.println("���������� �� a1 � " + a1);
		System.out.println("���������� �� a2 � " + a2);
		System.out.println("���������� �� a3 � " + a3);

		int temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;

		System.out.println("���� �������");

		System.out.println("���������� �� a1 � " + a1);
		System.out.println("���������� �� a2 � " + a2);
		System.out.println("���������� �� a3 � " + a3);

	}

}
