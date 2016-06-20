import java.util.Scanner;

/*
 * �� �� ������� ��������, ����� ������� �� ������������ 7 ���� �����
� ��������� �����
���������� �� ������ ������ ����� ������ �� 5, �� �� ������ �� 5.
������: -23, -55, 17, 75, 56, 105, 134
�����: 75,105 - 2 �����
 * */
public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arrLen = 7;

		int[] intArray = new int[arrLen];

		System.out.print("�������� " + arrLen + " ���� �����: ");

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(sc.next().replace(",", ""));
		}

		int counter = 0;
		boolean first = true;
		for (int i : intArray) {
			

			if ((i > 5) && (i % 5 == 0)) {
				counter++;

				if (first) {
					first = false;
				} else {
					System.out.print(",");
				}
				System.out.print(i);
			}
		}
		
		System.out.println(" - "+counter+" �����.");

	}

}
