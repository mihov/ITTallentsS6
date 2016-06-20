import java.util.Scanner;

/* �������� 3 ���������� �� ������������ � ��� (���������� ���), ����
���� (����� � ������� �������), ���� ��� ����� � ����� ���.
��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
������� �����:
 - ��� ��� �����, ���� �� �������
 - ��� ���� ����, �� �� ���� ���������
 - ��� ����� � �� ���� ����� � �� ��� ���
 
 - ��� ��� �����, �� ����� �� ���� � ��������
 - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.*/

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������� ���: ");
		int hour = sc.nextInt();

		System.out.print("�������� ���� ����: ");
		double money = sc.nextDouble();

		System.out.print("����� �� ���: ");
		boolean health = sc.nextBoolean();

		System.out.print("\n���� ��� " + hour + " ���� �� ");
		if (!health) {
			System.out.print("�� ���� � ���� ");
			
			if (money > 0) {
				System.out.println("�� �� ��� �� ����� ���������.");
			
			} else {
				System.out.println("� �� ��� ���.");
			}
		
		} else if (money < 10) {
			System.out.println("����� �� ����.");
		
		} else {
			System.out.println("����� �� ���� � ��������.");
		}

	}

}
