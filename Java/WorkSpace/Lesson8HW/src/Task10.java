import java.util.Scanner;

/*
 * �� �� ������� ��������, ����� �� ����� ��� ����� ����,
���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
�� ASCII ��������� � ���������� ������� 5 � � �������
������������� ������.
������ :
����: Hello
�����: Mjqqt
 * */
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ��� �� ��������: ");
		String inputString = sc.nextLine();
		StringBuilder result = new StringBuilder(inputString.length());
		
		for (int i = 0; i < inputString.length(); i++) {
			result.append((char)(inputString.charAt(i) + 5));
		}

		System.out.print("���������� ��� �: ");
		System.out.println(result.toString());
		
	}

}
