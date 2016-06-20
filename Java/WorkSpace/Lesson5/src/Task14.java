import java.util.Scanner;

/*
 * Имате предварително въведен едномерен масив, съдържащ реални числа.
Да се състави програма, чрез която се избират само елементи от
масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
масив. Новият масив да се извежда на екрана.
Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
Изход: 0.2; 0.99; 1.4; 1.2
 * */
public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] strArray = sc.nextLine().split(",");

		float downLimit = -2.99f;
		float upLimit = 2.99f;

		int elementsCount = -1;

		float[] realArr = new float[strArray.length];
		float currenElement;

		for (String element : strArray) {
			currenElement = Float.parseFloat(element);
			if (currenElement >= downLimit && currenElement <= upLimit) {
				elementsCount++;
				realArr[elementsCount] = currenElement;
			}
		}

		boolean first = true;
		for (int i = 0; i <= elementsCount; i++) {

			if (first) {
				first = false;
			} else {
				System.out.print("; ");
			}

			System.out.print(realArr[i]);
		}

	}

}
