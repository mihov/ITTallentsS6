import java.util.Scanner;

public class Task2a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�������� �:");
		float a = sc.nextFloat();

		System.out.println("�������� B:");
		float b = sc.nextFloat();

		float sum = a + b;
		float sub = a - b;
		float multiple = a * b;
		float div = a % b;
		float intDiv = a / b;

		System.out.println("������ �� " + a + " � " + b + " � " + sum);
		System.out.println("��������� ����� " + a + " � " + b + " � " + sub);
		System.out.println("�������������� �� " + a + " � " + b + " � " + multiple);
		System.out.println("�������� �� ��������� �� " + a + " �� " + b + " � " + div);
		System.out.println("�������� �� " + a + " � " + b + " � " + intDiv);

	}

}
