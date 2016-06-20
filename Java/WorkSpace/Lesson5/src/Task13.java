import java.util.Scanner;

/*
 * �� �� ������� ��������, ���� ����� �� ������� ����� � �� ���������
���� ����� � ������� ������ �������.
����������, ���� �����, �� ��������� �������������� ������ �����
�� ���������� ���������� ����� � 2-���� ������ �������.
������: 99
�����: 1100011
 * */
public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int decNumber = Math.abs(sc.nextInt());

		String[] binNumber = new String[32];
		int position = binNumber.length - 1;

		do {
			binNumber[position] = decNumber % 2 + "";
			decNumber /= 2;
			position--;
		} while (decNumber > 0);

		for (String element : binNumber) {
			if (element != null) {
				System.out.print(element);
			}
		}
	}
}
