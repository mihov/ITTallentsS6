import java.util.Scanner;

/*
 * �� �� ������� ��������, ���� ����� �� ������� ��� �� �������
(������, ���).
���������� �� ������ �� ������ ���� ��������� ������ � ���������,
�.�. ���� ����� ������-������� � �������-������ � ���� � ���.
����: �����
�����: ��.
����: ��������
�����: ��.
 * */
public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ����: ");
		String theWord = sc.nextLine();

		int len = theWord.length();
		boolean isPolindrom = true;
		for (int i = 0; i < len / 2; i++) {

			System.out.println(i + " " + (len - i-1));
			
			if (!(theWord.charAt(i) == theWord.charAt(len - i-1))) {
				isPolindrom = false;
			}
		}

		System.out.println(isPolindrom ? "������ � ���������!" : "������ �� � ���������!");
	}

}
