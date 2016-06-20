import java.util.Scanner;

/* Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
пари (число с плаваща запетая), дали съм здрав – булев тип.
Съставете програма, която взема решения на базата на тези данни по
следния начин:
 - ако съм болен, няма да излизам
 - ако имам пари, ще си купя лекарства
 - ако нямам – ще стоя вкъщи и ще пия чай
 
 - ако съм здрав, ще отида на кино с приятели
 - ако имам по-малко от 10 лв, ще отида на кафе.*/

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Въведет час: ");
		int hour = sc.nextInt();

		System.out.print("Въведете сума пари: ");
		double money = sc.nextDouble();

		System.out.print("Здрав ли сте: ");
		boolean health = sc.nextBoolean();

		System.out.print("\nУтре към " + hour + " часа ще ");
		if (!health) {
			System.out.print("си стоя в къщи ");
			
			if (money > 0) {
				System.out.println("но ще съм си купил лекарства.");
			
			} else {
				System.out.println("и ще пия чай.");
			}
		
		} else if (money < 10) {
			System.out.println("отида на кафе.");
		
		} else {
			System.out.println("отида на кино с приятели.");
		}

	}

}
