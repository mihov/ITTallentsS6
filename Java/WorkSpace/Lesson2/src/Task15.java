import java.util.Scanner;

/*�� �� ������� ��������, ����� ������� ���������� ����� �� ���������
[0..24].
���������� �� ������ ������������� ��������� ��������� ���������
���.
��������� ��:
[18..4] - ����� �����;
[4..9] - ����� ����;
[9..18] - ����� ���
������: 10
�����: ����� ���
*/
public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("����� � ����?   [0..24]: ");
		int time = sc.nextInt();

		if (time >= 9 && time < 18) {
			System.out.println("����� ���.");

		} else if (time >= 4 && time < 9) {
			System.out.println("����� ����.");

		} else {
			System.out.println("����� �����.");

		}

	}

}
