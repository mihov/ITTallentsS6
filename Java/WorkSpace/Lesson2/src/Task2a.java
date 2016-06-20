import java.util.Scanner;

public class Task2a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Въведете А:");
		float a = sc.nextFloat();

		System.out.println("Въведете B:");
		float b = sc.nextFloat();

		float sum = a + b;
		float sub = a - b;
		float multiple = a * b;
		float div = a % b;
		float intDiv = a / b;

		System.out.println("Сумата на " + a + " и " + b + " е " + sum);
		System.out.println("Разликата между " + a + " и " + b + " е " + sub);
		System.out.println("Произведението на " + a + " и " + b + " е " + multiple);
		System.out.println("Остатъка от делението на " + a + " на " + b + " е " + div);
		System.out.println("Частното на " + a + " и " + b + " е " + intDiv);

	}

}
