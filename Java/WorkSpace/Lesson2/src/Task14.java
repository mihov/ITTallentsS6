import java.util.Scanner;

/*Да се състави програма, която по въведени координати на 2 позиции
от шахматната дъска извежда отговор дали са оцветени в еднакъв или
различен цвят.
Шахматната дъска е квадратна.
Въвеждат се две двойки числа от интервала [1..8].
Пример: 2 2 3 2
Изход: Позициите са с различен цвят
*/
public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Въведете координатите на първата позиция\n x: ");
		int a1 = sc.nextInt();
		System.out.print(" y: ");
		int a2 = sc.nextInt();

		System.out.print("\nВъведете координатите на втората позиция\n x: ");
		int b1 = sc.nextInt();
		System.out.print(" y: ");
		int b2 = sc.nextInt();


		if ((a1 + a2 + b1 + b2) % 2 == 0) {
			System.out.println("Позициите са с еднакъв цвят.");
		} else {
			System.out.println("Позициите са с различен цвят.");
		}

	}

}
