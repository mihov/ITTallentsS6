import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		boolean isFirst = true;

		do {
			System.out.print("Въведете N [1..999]: ");
			n = sc.nextInt();
		} while (n < 1 || n > 999);

		int count = 1;
		
		while (count <= 10) {
			if ((n % 2 == 0) || (n % 3 == 0) || (n % 5 == 0)) {
				if (isFirst) {
					isFirst = false;
				} else {
					System.out.print(", ");
				}
				System.out.print(count + ":" + n);
			
				count++;
			}
				n++;
			

		}
	}
}
