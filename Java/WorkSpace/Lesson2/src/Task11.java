import java.util.Scanner;

/*��������� ��������, ����� �� ������ ���������o ����� ���������
���� ������� �� ���� �� ����� ���� �����. ��� ���������� ����� ��
���� ����� 0.*/

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ���������� �����: ");
		int a = sc.nextInt();

		int dig1 = a % 10;
		int dig10 = (a / 10) % 10;
		int dig100 = (a / 100) % 10;

		if (a % dig1 == 0 && a % dig10 == 0 && a % dig100 == 0) {
			System.out.println("The number " + a + " is special.");
		} else {
			System.out.println("Nothing special in " + a);
		}

	}

}
