package JavaTestTasks;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ������ �� ������");
		int size = sc.nextInt();
		double array[] = new double[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("�������� " + (i + 1) + "-��� �������:");
			array[i] = sc.nextDouble();
		}
	}

}
