import java.util.Scanner;

/*
 * �� �� ������� ��������, ���� ����� �� ������� ��������� � �������
����.
���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
������: ����� ����� ������
�����: ����� ����� ������

 * */
public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ���������: ");

		// Divide by words
		String[] wordsArray = sc.nextLine().split(" ");

		for (int word = 0; word < wordsArray.length; word++) {
			System.out.print(wordsArray[word].substring(0, 1).toUpperCase());
			System.out.print(wordsArray[word].substring(1).toLowerCase() + " ");
		}
	}
}
