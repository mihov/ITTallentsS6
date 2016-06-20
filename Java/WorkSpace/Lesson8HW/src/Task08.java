import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвежда ред от символи
(стринг, низ).
Програмата да изведе на екрана дали въведения стринг е палиндром,
т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
Вход: капак
Изход: да.
Вход: тенджера
Изход: не.
 * */
public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Въведете дума: ");
		String theWord = sc.nextLine();

		int len = theWord.length();
		boolean isPolindrom = true;
		for (int i = 0; i < len / 2; i++) {

			System.out.println(i + " " + (len - i-1));
			
			if (!(theWord.charAt(i) == theWord.charAt(len - i-1))) {
				isPolindrom = false;
			}
		}

		System.out.println(isPolindrom ? "Думата е полиндром!" : "Думата НЕ е полиндром!");
	}

}
