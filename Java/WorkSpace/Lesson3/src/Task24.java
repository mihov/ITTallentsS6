import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String inputString;

		do {
			System.out.print("Въведете N [10...30000]: ");
			inputString = sc.next();
			n = Integer.parseInt(inputString);
		} while (n < 10 || n > 30000);

		if (isItAPalindrom(inputString.toCharArray())) {
			System.out.println("Числото е палиндром");
		} else {
			System.out.println("Числото НЕ е палнидром");
		}

	}

	static boolean isItAPalindrom(char[] candidate) {
		int first = 0;
		int last = candidate.length - 1;
		while (last > first) {
			if (candidate[first] != candidate[last]) {
				return false;
			}
			first++;
			last--;
		}
		return true;
	}

}
