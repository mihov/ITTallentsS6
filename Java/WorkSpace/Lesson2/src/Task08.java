import java.util.Scanner;

/* Да се състави програма, която чете от конзолата 4-цифренo
естествено число от интервала [1000.. 9999]. От това число се
формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
ново число e по-малко <, равно = или по-голямо от 2-то число.
Пример: 3332 Изход: по-малко (32<33)
Пример: 1144 Изход: равни (14=14)
Пример: 9875 Изход: по-голямо (95>87)*/

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Въведете число  [1000.. 9999]: ");
		String theNumberAsString = sc.next();

		int theNumber = Integer.parseInt(theNumberAsString);

		if (theNumber >= 1000 && theNumber <= 9999) {
			int first = Integer.parseInt(theNumberAsString.charAt(0) + "" + theNumberAsString.charAt(3));
			int second = Integer.parseInt(theNumberAsString.charAt(1) + "" + theNumberAsString.charAt(2));
			
			if (first < second) {
				System.out.println("по-малко (" + first + "<" + second + ")");

			} else if (first > second) {
				System.out.println("по-голямо (" + first + ">" + second + ")");

			} else {

				System.out.println("равни (" + first + "=" + second + ")");
			}
		
		} else {
			System.out.println("Въвели сте некоректно число!!!");
		}

	}

}