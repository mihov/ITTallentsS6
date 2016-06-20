import java.util.Scanner;

/*
 * Да се състави програма, чрез която предварително въведени 10
реални числа от интервала се обработват по следния начин:
1. Извежда съществуващите числа.
2. Всички елементи със стойност по-малки от -0.231 се заменят със
сумата от квадрата на поредния им номер + числото 41.25, а всички
останали елементи се заменят с произведението между самия елемент
и неговият пореден номер. Поредният номер на първият елемент е 1.
3. Да се изведат елементите от началния и новообразувания масив.
Пример: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25
 * */
public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Read Array
		System.out.println("Въведете " + 10 + " релани чиса:");
		String[] strArray = sc.nextLine().replaceAll(" ", "").replace(",", " ").split(" ");

		// Convert string to float
		float[] realArr = new float[strArray.length];
		for (int i = 0; i < realArr.length; i++) {
			realArr[i] = Float.parseFloat(strArray[i]);
		}

		// 1. Извежда съществуващите числа.
		// 1. Print Array
		System.out.println("Original");
		boolean first = true;
		for (float element : realArr) {

			if (first) {
				first = false;
			} else {
				System.out.print("; ");
			}
			System.out.print(element);
		}

		System.out.println();

		// 2. Modify array
		float limit = -0.231f;
		float magicNumber = 41.25f;

		for (int i = 0; i < realArr.length; i++) {
			if (realArr[i] < limit) {
				realArr[i] = (i + 1) * (i + 1) + magicNumber;
			} else {
				realArr[i] = (i + 1) * realArr[i];
			}

		}

		// 1. Print Array
		System.out.println("Modified");
		first = true;
		for (float element : realArr) {

			if (first) {
				first = false;
			} else {
				System.out.print("; ");
			}
			System.out.printf("%.2f", element);
		}

	}

}
