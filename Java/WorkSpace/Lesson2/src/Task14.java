import java.util.Scanner;

/*�� �� ������� ��������, ����� �� �������� ���������� �� 2 �������
�� ���������� ����� ������� ������� ���� �� �������� � ������� ���
�������� ����.
���������� ����� � ���������.
�������� �� ��� ������ ����� �� ��������� [1..8].
������: 2 2 3 2
�����: ��������� �� � �������� ����
*/
public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ������������ �� ������� �������\n x: ");
		int a1 = sc.nextInt();
		System.out.print(" y: ");
		int a2 = sc.nextInt();

		System.out.print("\n�������� ������������ �� ������� �������\n x: ");
		int b1 = sc.nextInt();
		System.out.print(" y: ");
		int b2 = sc.nextInt();


		if ((a1 + a2 + b1 + b2) % 2 == 0) {
			System.out.println("��������� �� � ������� ����.");
		} else {
			System.out.println("��������� �� � �������� ����.");
		}

	}

}
