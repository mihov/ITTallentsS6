import java.util.Scanner;

/*
 * �� �� ������� ��������, ����� ���� ����� �� ���� ��������� � ��������.
���� �������� �� �� �������� ���� �� ���������� ����, ����� � ����
����� � ���-������� ����.
������: asd fg hjkl
�����: 3 ����, ���-������� � � 4 �������.
 * */
public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.print("�������� ������� ����: ");
		String[] wordsArray = sc.nextLine().replaceAll("  ", " ").split(" ");

		int wordCount = wordsArray.length;
		int maxLength = 0;
		int maxLengthTemp = 0;

		for (int i = 0; i < wordsArray.length; i++) {
			maxLengthTemp = wordsArray[i].length();
			if (maxLength < maxLengthTemp) {
				maxLength = maxLengthTemp;
			}
		}
		
		System.out.printf("%s ����, ���-������� � � %s �������.",wordCount, maxLength);
	}

}
