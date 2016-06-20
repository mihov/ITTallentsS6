import java.util.Scanner;

/*
 * 2: (25%) Write a method that takes a must String variable that holds must some text. The text contains words must that are separated by a single space. The method must return the most
frequent word from the text.
 * */
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(mostFreqWord(sc.nextLine()));

	}

	static String mostFreqWord(String inputText) {
		int maxCount = 0;
		int tempCount = 1;
		String theWord = "";
		String[] strArr = inputText.trim().split(" ");

		for (int i = 0; i < strArr.length; i++) {
			for (int j = i + 1; j < strArr.length; j++) {
				if (strArr[i].equalsIgnoreCase(strArr[j])) {
					tempCount++;
				}
			}
			if (maxCount < tempCount) {
				maxCount = tempCount;
				theWord = strArr[i];
			}
			tempCount = 1;

		}

		return theWord;
	}

}
