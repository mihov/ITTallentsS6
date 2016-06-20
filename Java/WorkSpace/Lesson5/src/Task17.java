import java.util.Scanner;

/*
 * Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица
 * */
public class Task17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Въведете редица от естествени числа");
		String[] strArray = sc.nextLine().split(" ");

		int[] intArray = new int[strArray.length];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = Integer.parseInt(strArray[i]);
		}

		boolean isZigZag = true;

		for (int i = 1; i < intArray.length - 1; i++) {
			if (i % 2 == 0) {
				if (!(intArray[i] < intArray[i - 1] && intArray[i] < intArray[i + 1])) {
					isZigZag = false;
					break;
				}
			} else {
				if (!(intArray[i] > intArray[i - 1] && intArray[i] > intArray[i + 1])) {
					isZigZag = false;
					break;
				}
			}
		}
		System.out.println(isZigZag ? "изпълнява изискванията за зигзагообразна нагоре редица"
				: "НЕ изпълнява изискванията за зигзагообразна нагоре редица");

	}

}
