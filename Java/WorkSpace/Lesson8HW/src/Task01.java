import java.util.Scanner;

/*�� �� ������� ��������, ���� ����� �� �������� ��� ���� ���������
�� 40 ������ � ����� �����.
���� �������� �� ������ �� �� �������� �������� ���� � ������ � ����
� ����� �����.
������: Abcd Efgh
�����: ABCD abcd EFGH efgh*/
public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� ��� ����: ");
		System.out.println(upAndLowStr(sc.next()) + " " + upAndLowStr(sc.next()));
	}

	static String upAndLowStr(String inputStr) {
		return inputStr.toUpperCase() + " " + inputStr.toLowerCase();
	}

}
