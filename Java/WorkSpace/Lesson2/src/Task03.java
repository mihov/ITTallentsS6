import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Въведете А: ");
		int a = sc.nextInt();

		System.out.print("Въведете B: ");
		int b = sc.nextInt();

		System.out.println("Стойността на А е " + a);
		System.out.println("Стойността на B е " + b);

		System.out.println("След размяна");

		int temp = a;
		a = b;
		b = temp;

		System.out.println("Стойността на А е " + a);
		System.out.println("Стойността на B е " + b);

	}

}
