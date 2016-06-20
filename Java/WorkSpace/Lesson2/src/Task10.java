import java.util.Scanner;

/*Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
3 литра и ги ползвате едновременно.
Да се състави програма, която по даден обем извежда как ще прелеете
течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
кофите. Кофите не могат да се ползват с частично количество вода.
Входни данни: естествено число от интервала [10..9999].
Пример: 107
Изход: 21 пъти по 2 литра,
 21 пъти по 3 литра
 допълнително кофа от 2 литра*/
public class Task10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int bucket1 = 2;
		int bucket2 = 3;
		int devider = bucket1 + bucket2;

		System.out.print("Въведете обема на цистерната: ");
		int volumeOfTheTank = sc.nextInt();

		int fullBackets = volumeOfTheTank / devider;

		int theRest = volumeOfTheTank % devider;

		System.out.println(fullBackets + " пъти по " + bucket1 + " литра,");
		System.out.println(fullBackets + " пъти по " + bucket2 + " литра,");

		if (theRest > 0)
			System.out.println("допълнително кофа от " + theRest + " литра.");
	}

}
