import java.util.Scanner;

/*
 * Да се състави програма, която чете набор от думи разделени с интервал.
Като резултат да се извеждат броя на въведените думи, както и броя
знаци в най-дългата дума.
Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа.
 * */
public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.err.print("Въведете няколко думи: ");
		String[] wordsArray = sc.nextLine().replaceAll("  ", " ").split(" ");

		int wordCount = wordsArray.length;
		int maxLength = 0;
		int maxLengthTemp = 0;

		for (int i = 0; i < wordsArray.length; i++) {
			maxLengthTemp = wordsArray[i].length();
			if (maxLength < maxLengthTemp) {
				maxLength = maxLengthTemp;
			}
		}
		
		System.out.printf("%s думи, най-дългата е с %s символа.",wordCount, maxLength);
	}

}
