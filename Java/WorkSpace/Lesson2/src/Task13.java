import java.util.Scanner;

/*�� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
���������� ����������� t � ������ ������.
�������������� ��������� ��:
��� -20 ������ �������;
����� 0 � -20 - �������;
����� 15 � 0 - ������;
����� 25 � 15 - �����;
��� 25 � ������.
������ �����: ���� ����� �� ��������� [-100..100].
������: 12
�����: ������
*/
public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ������������ �   [-100...100]: ");
		double temperature = sc.nextDouble();

		if (temperature <= -20) {
			System.out.println("������ �������");

		} else if (temperature <= 0) {
			System.out.println("�������");

		} else if (temperature <= 15) {
			System.out.println("������");

		} else if (temperature <= 25) {
			System.out.println("�����");
		} else {
			System.out.println("������");
		}
	}

}
