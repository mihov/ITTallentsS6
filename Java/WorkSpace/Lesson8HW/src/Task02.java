import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� ������������ �� ��������
�������������� ��� ���� � ������� 10-20 �����.
���������� �� ������� ������� �� 5 ����� � �� ������ ��������� ��
��-�������, ����� � ������ �� ����������.
������: uchilishe uchenik
�����: 9 uchenishe
*/
public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two words: ");
		String word1 = sc.next();
		String word2 = sc.next();

		int charCount = 5;

		int maxLen = Math.max(word1.length(), word2.length());

		String temp1 = word1.substring(0, charCount);
		String temp2 = word2.substring(0, charCount);

		word1 = temp2 + word1.substring(charCount);
		word2 = temp1 + word2.substring(charCount);

		System.out.println(maxLen + " " + (word1.length() > word2.length() ? word1 : word2));
	}

}
