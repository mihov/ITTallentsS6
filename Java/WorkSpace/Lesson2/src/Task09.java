import java.util.Scanner;

/*Да се състави програма, която чете от конзолата 2 естествени
двуцифрени числа a,b.
Програмата да изведе в конзолата дали последната цифра от
произведението на двете числа е четна, както и самата цифра.
Входни данни: a,b - естествени числа от интервала [10..99].
Пример: 15, 25
Изход: 375, 5 нечетна
*/

public class Task09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Въведете числата а и b  [[10..99],[10..99]]: ");
		String[] numbersAsString = sc.next().split(",");

		int a = Integer.parseInt(numbersAsString[0]);
		int b = Integer.parseInt(numbersAsString[1]);
		int multiple = a * b;
		int lastNum = multiple % 10;
		
		System.out.print("Изход: "+multiple + ", " + lastNum + " ");

		if (lastNum % 2 == 0) {
			System.out.println("четна.");

		} else {
			System.out.println("нечетна.");
		}

	}

}
