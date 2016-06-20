import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		boolean isFirst = true;
		boolean hasError = false;
		String karta, boia;

		do {
			System.out.print("Въведете N [1..52]: ");
			n = sc.nextInt();

		} while (n < 1 || n > 52);

		while (n <= 52) {

			switch (n % 4) {
			case 1:
				boia = "спатия";
				break;
			case 2:
				boia = "каро";
				break;
			case 3:
				boia = "купа";
				break;

			default:
				boia = "пика";
				break;
			}

			switch ((n-1) / 4) {
			case 9:
				karta = "Вале";
				break;
			case 10:
				karta = "Дама";
				break;
			case 11:
				karta = "Поп";
				break;
			case 12:
				karta = "Асо";
				break;

			default:
				karta = String.valueOf((n-1) / 4 + 2);

				break;
			}

		
			n++;

			if (isFirst) {
				isFirst = false;
			} else {
				System.out.print(", ");
			}

			System.out.print(karta + " " + boia);
		}
	}

}
