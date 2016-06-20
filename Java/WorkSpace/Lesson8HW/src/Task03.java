import java.util.Scanner;

/*
 * �� �� ������� ��������, ���� ����� �� �������� �������������� ���
������ �� ������� ��� ���������.
���������� �� ������� ��������� �� ��������� �� ����������� �� ��
�������.
������: ���������, ���������
�����:
����� ���� �� � ����� �������.
������� �� �������:
8 �-�
9 �-�

 * */
public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two char arrays: ");

		String[] twoCharArrays = sc.nextLine().replace(",", "").split(" ");
		char[] word1 = twoCharArrays[0].toCharArray();
		char[] word2 = twoCharArrays[1].toCharArray();

		System.out.println(word1.length > word2.length ? "������� ��� � ��-����� �� ������."
				: word1.length < word2.length ? "������� ��� � ��-��� �� ������." : "����� ���� �� � ����� �������.");

		for (int i = 0; i < Math.min(word1.length, word2.length); i++) {
			if (word1[i] != word2[i]) {
				System.out.println((i + 1) + " " + word1[i] + "-" + word2[i]);
			}
		}
	}
}
