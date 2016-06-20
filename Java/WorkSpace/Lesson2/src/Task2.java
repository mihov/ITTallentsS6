import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете А:");
		int a = sc.nextInt();

		System.out.println("Въведете B:");
		int b = sc.nextInt();

		int sum = a + b;
		int sub = a - b;
		int multiple = a * b;
		int div = a % b;
		int intDiv = a / b;

		System.out.println("Сумата на " + a + " и " + b + " е " + sum);
		System.out.println("Разликата между " + a + " и " + b + " е " + sub);
		System.out.println("Произведението на " + a + " и " + b + " е " + multiple);
		System.out.println("Остатъка от делението на " + a + " на " + b + " е " + div);
		System.out.println("Цялата част от делението на " + a + " на " + b + " е " + intDiv);
	}

}
