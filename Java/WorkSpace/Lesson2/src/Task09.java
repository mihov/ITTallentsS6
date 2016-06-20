import java.util.Scanner;

/*�� �� ������� ��������, ����� ���� �� ��������� 2 ����������
���������� ����� a,b.
���������� �� ������ � ��������� ���� ���������� ����� ��
�������������� �� ����� ����� � �����, ����� � ������ �����.
������ �����: a,b - ���������� ����� �� ��������� [10..99].
������: 15, 25
�����: 375, 5 �������
*/

public class Task09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ������� � � b  [[10..99],[10..99]]: ");
		String[] numbersAsString = sc.next().split(",");

		int a = Integer.parseInt(numbersAsString[0]);
		int b = Integer.parseInt(numbersAsString[1]);
		int multiple = a * b;
		int lastNum = multiple % 10;
		
		System.out.print("�����: "+multiple + ", " + lastNum + " ");

		if (lastNum % 2 == 0) {
			System.out.println("�����.");

		} else {
			System.out.println("�������.");
		}

	}

}
