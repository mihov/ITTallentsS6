import java.util.Scanner;

/*
 * Напишете програма, в която потребителя въвежда масив, след което
елементите на масива се обръщат в обратен ред (Целта не е масива да
се отпечата в обратен ред, ами първо да се обърне, след което да се
отпечата в нормален ред). Пробвайте да решите задачата първо с един
допълнителен масив и после без да използвате друг масив.
 * */
public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете масив (с разстояние между елементите): ");
		String[] arrayA = sc.nextLine().split(" ");

		int first = 0;
		int last = arrayA.length - 1;
		String temp;

		while (last > first) {
			temp = arrayA[first];
			arrayA[first] = arrayA[last];
			arrayA[last] = temp;

			first++;
			last--;
		}

		for (String element : arrayA) {
			System.out.print(element + " ");
		}
	}

}
