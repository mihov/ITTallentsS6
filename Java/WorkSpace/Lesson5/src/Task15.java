import java.util.Scanner;

/*
 * Да се състави програма, която въвежда в едномерен масив реални числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13
 * */
public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// String inputStr = sc.nextLine().replace(" ", "");

		String[] strArray = sc.nextLine().split("; ");

		float[] realArr = new float[strArray.length];
		int counter = 0;

		for (String element : strArray) {
			realArr[counter] = Float.parseFloat(element);
			counter++;
		}

		String result = "";
		boolean isFirst = true;
		float maxElement = Float.MIN_VALUE;
		int maxElementIndex = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j < realArr.length; j++) {
				if (maxElement < realArr[j]) {
					maxElement = realArr[j];
					maxElementIndex = j;
				}
			}

			result = maxElement + (isFirst ? "" : "; ") + result;
			if (isFirst) {
				isFirst = false;
			}
			
			realArr[maxElementIndex] = Float.MIN_VALUE;
			maxElement = Float.MIN_VALUE;
		}
		System.out.println(result);
	}

}
