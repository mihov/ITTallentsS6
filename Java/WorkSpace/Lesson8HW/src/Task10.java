import java.util.Scanner;

/*
 * Да се състави програма, която по даден низ връща друг,
символите, на който са получени като към всеки код на символ
от ASCII таблицата е добавеното числото 5 и е записан
новополучения символ.
Пример :
Вход: Hello
Изход: Mjqqt
 * */
public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Въведете низ за кодиране: ");
		String inputString = sc.nextLine();
		StringBuilder result = new StringBuilder(inputString.length());
		
		for (int i = 0; i < inputString.length(); i++) {
			result.append((char)(inputString.charAt(i) + 5));
		}

		System.out.print("Кодираният низ е: ");
		System.out.println(result.toString());
		
	}

}
