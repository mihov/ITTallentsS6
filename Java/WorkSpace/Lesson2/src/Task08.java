import java.util.Scanner;

/* �� �� ������� ��������, ����� ���� �� ��������� 4-������o
���������� ����� �� ��������� [1000.. 9999]. �� ���� ����� ��
�������� 2 ���� 2-������� �����. ������� ����� �� ������� �� 1-��
� 4-�� ����� �� ���������� �����. ������� ����� �� ������� �� 2-�a -
3-�� ����� �� ���������� �����. ���� �������� �� �� ������ ���� 1-��
���� ����� e ��-����� <, ����� = ��� ��-������ �� 2-�� �����.
������: 3332 �����: ��-����� (32<33)
������: 1144 �����: ����� (14=14)
������: 9875 �����: ��-������ (95>87)*/

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� �����  [1000.. 9999]: ");
		String theNumberAsString = sc.next();

		int theNumber = Integer.parseInt(theNumberAsString);

		if (theNumber >= 1000 && theNumber <= 9999) {
			int first = Integer.parseInt(theNumberAsString.charAt(0) + "" + theNumberAsString.charAt(3));
			int second = Integer.parseInt(theNumberAsString.charAt(1) + "" + theNumberAsString.charAt(2));
			
			if (first < second) {
				System.out.println("��-����� (" + first + "<" + second + ")");

			} else if (first > second) {
				System.out.println("��-������ (" + first + ">" + second + ")");

			} else {

				System.out.println("����� (" + first + "=" + second + ")");
			}
		
		} else {
			System.out.println("������ ��� ���������� �����!!!");
		}

	}

}