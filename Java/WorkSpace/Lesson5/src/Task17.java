import java.util.Scanner;

/*
 * ���� ������ �� ���������� ����� �� �������� �������������� ������,
��� �� ���������� � �� ���������� ���������:
N1 < N2 > N3 < N4 > N5 <..
��������� ��������, ����� ��������� ���� �������� � ���������
����� ������ �� ����� ���������� ������� ����������.
������: 1 3 2 4 3 7
�����: ��������� ������������ �� �������������� ������ ������
 * */
public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� ������ �� ���������� �����");
		String[] strArray = sc.nextLine().split(" ");

		int[] intArray = new int[strArray.length];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}

		boolean isZigZag = true;

		for (int i = 1; i < intArray.length - 1; i++) {
			if (i % 2 == 0) {
				if (!(intArray[i] < intArray[i - 1] && intArray[i] < intArray[i + 1])) {
					isZigZag = false;
					break;
				}
			} else {
				if (!(intArray[i] > intArray[i - 1] && intArray[i] > intArray[i + 1])) {
					isZigZag = false;
					break;
				}
			}
		}
		System.out.println(isZigZag ? "��������� ������������ �� �������������� ������ ������"
				: "�� ��������� ������������ �� �������������� ������ ������");

	}

}
