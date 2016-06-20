import java.util.Scanner;

/*
 * �� �� ������� ��������, ���� ����� �� ������� ��� �������� �����,
�����, ���� ����� '-' �� ������� ������ �� ���������� ����� ���� ��
������ ������ '-' ���� ����������� �����.
����: asd-12sdf45-56asdf100
�����:
-12
45
-56
100
���� = 77
 * */
public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("�������� ��� �� ����� � �����: ");
		String[] inputString = sc.nextLine()
				.replaceAll("[^0123456789-]", " ")
				.replaceAll("-", " -")
				.replaceAll("\\s+", " ")
				.trim()
				.split(" ");

		int sum = 0;
		int[] intArray = new int[inputString.length];
		for (int element = 0; element < inputString.length; element++) {
			intArray[element] = Integer.parseInt(inputString[element]);
			sum += intArray[element];
			System.out.println(intArray[element]);
		}
		System.out.println("���� = " + sum);
	}
}
