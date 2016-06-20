import java.util.Scanner;

/*
 * Да се състави програма, чрез която се въвеждат 2 редици от знаци
(думи).
Ако в двете редици участва един и същи знак, да се изведе на екрана
първата редица хоризонтално, а втората вертикално, така че да се
пресичат в общия си знак.
Ако редиците нямат общ знак да се изведе само уведомително
съобщение.
Пример :
м
а
шапка
и
н
а
 * */
public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете две думи:");

		String word1 = sc.next();
		String word2 = sc.next();

		char[][] printArray = new char[word2.length()][word1.length()];

		int theRow = -1;
		int theCol = -1;

		// Fill print array with ' '
		for (int row = 0; row < printArray.length; row++) {
			for (int col = 0; col < printArray[row].length; col++) {
				printArray[row][col] = ' ';
			}
		}
		// Find the cross
		for (int row = 0; row < printArray.length; row++) {
			for (int col = 0; col < printArray[row].length; col++) {
				if (word2.charAt(row) == word1.charAt(col)) {
					theRow = row;
					theCol = col;
					break;
				}
			}
		}

		if (theRow >= 0 && theCol >= 0) {
			// Print thePrint array
			for (int row = 0; row < printArray.length; row++) {
				for (int col = 0; col < printArray[row].length; col++) {
					// Insert word2 in to array
					if (col == theCol) {
						printArray[row][col] = word2.charAt(row);
					}
					// Insert word1 in to array
					if (row == theRow) {
						printArray[row][col] = word1.charAt(col);
					}
					// Print each cell
					System.out.print(printArray[row][col]);
				}
				System.out.println();
			}

		} else {
			System.out.println("Двете думи нямат общи символи!");
		}
	}
}
