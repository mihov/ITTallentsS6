import java.util.Scanner;

/*Да се състави програма, чрез която се въвеждат два низа съдържащи
до 40 главни и малки букви.
Като резултат на екрана да се извеждат низовете само с главни и само
с малки букви.
Пример: Abcd Efgh
Изход: ABCD abcd EFGH efgh*/
public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Въведете два низа: ");
		System.out.println(upAndLowStr(sc.next()) + " " + upAndLowStr(sc.next()));
	}

	static String upAndLowStr(String inputStr) {
		return inputStr.toUpperCase() + " " + inputStr.toLowerCase();
	}

}
