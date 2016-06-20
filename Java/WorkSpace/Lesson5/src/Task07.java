import java.util.Scanner;

/*
 * Напишете програма, която първо чете масив и после създава нов
масив със същия размер по следния начин: стойността на всеки
елемент от втория масив да е равна на сбора от предходния и      |предходен|текущ (съответен)|следващ|
следващият елемент на съответния елемент от първия масив. Първият
и последният елемент на втория масив трябва да си останат равни на
първият и последният от елемент от първия масив.
Да се изведе получения масив.
 * */
public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете масив (с разстояние между елементите): ");
		int[] intArray1 = ReadArray(sc.nextLine());

		int lenA1 = intArray1.length;

		int[] intArray2 = new int[lenA1];

		intArray2[0] = intArray1[0];
		intArray2[lenA1 - 1] = intArray1[lenA1 - 1];

		for (int i = 1; i < lenA1 - 1; i++) {
			intArray2[i] = intArray1[i - 1] + intArray1[i + 1];
		}

		PrintArray(intArray2);
	}

	static void PrintArray(int[] arrayToPrint) {
		for (int i : arrayToPrint) {
			System.out.println(i + " ");
		}
	}

	static int[] ReadArray(String arrAsStr) {
		String[] strArray = arrAsStr.split(" ");

		int[] resultArray = new int[strArray.length];

		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = Integer.parseInt(strArray[i]);
		}
		return resultArray;
	}

}
