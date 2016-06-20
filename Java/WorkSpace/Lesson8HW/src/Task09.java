import java.util.Scanner;

/*
 * Да се състави програма, чрез която по въведен низ съдържащ букви,
цифри, знак минус '-' се извежда сборът на въведените числа като се
отчита знакът '-' пред съответното число.
Вход: asd-12sdf45-56asdf100
Изход:
-12
45
-56
100
Сума = 77
 * */
public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Въведете низ от цифри и букви: ");
		String[] inputString = sc.nextLine()
				.replaceAll("[^0123456789-]", " ")
				.replaceAll("-", " -")
				.replaceAll("\\s+", " ")
				.trim()
				.split(" ");

		int sum = 0;
		int[] intArray = new int[inputString.length];
		for (int element = 0; element < inputString.length; element++) {
			intArray[element] = Integer.parseInt(inputString[element]);
			sum += intArray[element];
			System.out.println(intArray[element]);
		}
		System.out.println("Сума = " + sum);
	}
}
