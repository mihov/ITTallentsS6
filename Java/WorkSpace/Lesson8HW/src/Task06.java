import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвежда изречение с отделни
думи.
Като резултат на екрана да се извежда същия текст, но всяка отделна
дума да започва с главна буква, а следващите я букви да са малки.
Пример: супер яката задача
Изход: Супер Яката Задача

 * */
public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Напишете изречение: ");

		// Divide by words
		String[] wordsArray = sc.nextLine().split(" ");

		for (int word = 0; word < wordsArray.length; word++) {
			System.out.print(wordsArray[word].substring(0, 1).toUpperCase());
			System.out.print(wordsArray[word].substring(1).toLowerCase() + " ");
		}
	}
}
