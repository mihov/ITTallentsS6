import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� �:");
		int a = sc.nextInt();

		System.out.println("�������� B:");
		int b = sc.nextInt();

		int sum = a + b;
		int sub = a - b;
		int multiple = a * b;
		int div = a % b;
		int intDiv = a / b;

		System.out.println("������ �� " + a + " � " + b + " � " + sum);
		System.out.println("��������� ����� " + a + " � " + b + " � " + sub);
		System.out.println("�������������� �� " + a + " � " + b + " � " + multiple);
		System.out.println("�������� �� ��������� �� " + a + " �� " + b + " � " + div);
		System.out.println("������ ���� �� ��������� �� " + a + " �� " + b + " � " + intDiv);
	}

}
