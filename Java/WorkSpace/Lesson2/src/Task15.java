import java.util.Scanner;

/*Да се състави програма, която въвежда естествено число от интервала
[0..24].
Програмата да изведе съответстващо съобщение съобразно въведения
час.
Периодите са:
[18..4] - Добър вечер;
[4..9] - Добро утро;
[9..18] - Добър ден
Пример: 10
Изход: Добър ден
*/
public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Колко е часа?   [0..24]: ");
		int time = sc.nextInt();

		if (time >= 9 && time < 18) {
			System.out.println("Добър ден.");

		} else if (time >= 4 && time < 9) {
			System.out.println("Добро утро.");

		} else {
			System.out.println("Добър вечер.");

		}

	}

}
