import java.util.Scanner;

/*������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
3 ����� � �� �������� ������������.
�� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
������. ������ �� ����� �� �� ������� � �������� ���������� ����.
������ �����: ���������� ����� �� ��������� [10..9999].
������: 107
�����: 21 ���� �� 2 �����,
 21 ���� �� 3 �����
 ������������ ���� �� 2 �����*/
public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int bucket1 = 2;
		int bucket2 = 3;
		int devider = bucket1 + bucket2;

		System.out.print("�������� ����� �� ����������: ");
		int volumeOfTheTank = sc.nextInt();

		int fullBackets = volumeOfTheTank / devider;

		int theRest = volumeOfTheTank % devider;

		System.out.println(fullBackets + " ���� �� " + bucket1 + " �����,");
		System.out.println(fullBackets + " ���� �� " + bucket2 + " �����,");

		if (theRest > 0)
			System.out.println("������������ ���� �� " + theRest + " �����.");
	}

}
