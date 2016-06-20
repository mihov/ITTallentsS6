import java.util.Scanner;

/*
 * �������� ��������, ����� ������ � ������� ���-������� ������ ��
������� ������� �������� � ����� �����.
 * */
public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� ����� (� ���������� ����� ����������): ");
		String[] arrayA = sc.nextLine().split(" ");

		int maxLen = 1;
		String element = arrayA[0];
		int tempMaxLen = 1;
		String tempElement = arrayA[0];

		for (int i = 1; i < arrayA.length; i++) {
			if (tempElement.equals(arrayA[i])) {
				tempMaxLen++;
			} else {
				if (tempMaxLen > maxLen) {
					element = tempElement;
					maxLen = tempMaxLen;
				}
				tempElement = arrayA[i];
				tempMaxLen = 1;
			}
		}
		
		if (tempMaxLen > maxLen) {
			element = tempElement;
			maxLen = tempMaxLen;
		}

		System.out.print("���-������� ������ �� ������� ������� �������� �: ");
		for (int i = 1; i <= maxLen; i++) {
			System.out.print(element + " ");
		}
	}
}
