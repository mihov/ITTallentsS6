import java.util.Scanner;

/*
 * �������� ��������, � ����� ����������� ������� �����, ���� �����
���������� �� ������ �� ������� � ������� ��� (����� �� � ������ ��
�� �������� � ������� ���, ��� ����� �� �� ������, ���� ����� �� ��
�������� � �������� ���). ��������� �� ������ �������� ����� � ����
������������ ����� � ����� ��� �� ���������� ���� �����.
 * */
public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ����� (� ���������� ����� ����������): ");
		String[] arrayA = sc.nextLine().split(" ");

		int first = 0;
		int last = arrayA.length - 1;
		String temp;

		while (last > first) {
			temp = arrayA[first];
			arrayA[first] = arrayA[last];
			arrayA[last] = temp;

			first++;
			last--;
		}

		for (String element : arrayA) {
			System.out.print(element + " ");
		}
	}

}
