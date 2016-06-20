import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвеждат 7 цели числа в
едномерен масив.
Програмата да изведе числото, което е най-близко до средната
стойност на въведените числа.
Пример: 1,2,3,4,5,6,7
Изход: средна стойност 4, най-близка стойност 4
*/
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Въведете редица от числа разделена със запетая [, ]:");
		int[] arrayAvg = ReadArray(sc.nextLine().replaceAll(" ", ""));
		sc.close();

		int sum = 0;

		for (int i : arrayAvg) {
			sum += i;
		}

		int avg = sum / arrayAvg.length;

		int minAbsDiff = Math.abs(avg - arrayAvg[0]);
		int closeToAvg = arrayAvg[0];

		for (int i = 1; i < arrayAvg.length; i++) {
			if (minAbsDiff > Math.abs(avg - arrayAvg[i])) {
				minAbsDiff = Math.abs(avg - arrayAvg[i]);
				closeToAvg = arrayAvg[i];
			}
		}

		System.out.println("средна стойност " + avg + ", най-близка стойност " + closeToAvg);

	}

	static int[] ReadArray(String arrAsStr) {
		String[] strArray = arrAsStr.split(",");

		int[] resultArray = new int[strArray.length];

		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = Integer.parseInt(strArray[i]);
		}
		return resultArray;
	}

}
