import java.util.Scanner;

import javax.swing.text.html.MinimalHTMLWriter;

/*��������� ������ �� ������ ������ ������ �� 4 � ����������
����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
�� 1600 � 2000 �� ���������.
��������� ��������, ����� �� ������ ���, �����, ������ ���������
���������� ����.
������ �����: ��� ����� �� ���, �����, ������.
������: 28, 2, 2000
�����: 1,3,2000
*/
public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ����: ");
		int day = sc.nextInt();
		System.out.print("�������� �����: ");
		int month = sc.nextInt();
		System.out.print("�������� ������: ");
		int year = sc.nextInt();

		byte[] lastDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		day++;

		if (month == 2) {
			if (isLeap(year)) {
				if (day > lastDay[month - 1] + 1) {
					day = 1;
					month++;
				}
			} else if (day > lastDay[month - 1]) {
				day = 1;
				month++;
			}
		} else if (day > lastDay[month - 1]) {
			day = 1;
			month++;
		}

		if (month > 12) {
			month = 1;
			day = 1;
			year++;
		}

		System.out.println(day + "," + month + "," + year);

	}

	public static boolean isLeap(int year) {
		if (year % 4 == 0) {
			if (year % 400 == 0) {
				return true;
			} else if (year % 100 == 0) {
				return false;
			}
			return true;
		} else {
			return false;
		}

	}

}
