import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвеждат последователно две
редици от символи без интервали.
Програмата да извежда съобщение за резултата от сравнението им по
позиции.
Пример: хипопотам, хипопотук
Изход:
Двата низа са с равна дължина.
Разлика по позиции:
8 а-у
9 м-к

 * */
public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two char arrays: ");

		String[] twoCharArrays = sc.nextLine().replace(",", "").split(" ");
		char[] word1 = twoCharArrays[0].toCharArray();
		char[] word2 = twoCharArrays[1].toCharArray();

		System.out.println(word1.length > word2.length ? "Първият низ е по-дълъг от втория."
				: word1.length < word2.length ? "Първият низ е по-къс от втория." : "Двата низа са с равна дължина.");

		for (int i = 0; i < Math.min(word1.length, word2.length); i++) {
			if (word1[i] != word2[i]) {
				System.out.println((i + 1) + " " + word1[i] + "-" + word2[i]);
			}
		}
	}
}
