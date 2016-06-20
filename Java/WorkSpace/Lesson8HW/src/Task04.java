import java.util.Scanner;

/*
 * Да се състави програма, чрез която по въведени трите имена на двама
човека разделени със запетая, се извежда чие име има по-голям сбор
от ASCII кодовете на съставящите името букви.
Пример: Anna Dosewa Asenowa, Anna Dosewa Asenowaz , Iwo Peew Peew
Изход: Anna Dosewa Asenowa

 * */
public class Task04 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int namesCount = 3;
		
		System.out.println("Въведете трите имена на всички членове на групата, като разделите отделните членове със запетая");

		// Divide by person
		String[] allNames = sc.nextLine().replace(", ", ",").replace(" , ", ",").replace(" ,", ",").split(",");

		// Create array of people
		String[][] separateName = new String[allNames.length][namesCount];

		// Divide each persons name by single names
		for (int person = 0; person < allNames.length; person++) {
			String[] eachName = allNames[person].split(" ");

			for (int name = 0; name < namesCount; name++) {
				separateName[person][name] = eachName[name];
			}
		}

		int thePerson = 0;
		int maxSum = 0;
		int tempSum = 0;

		for (int person = 0; person < separateName.length; person++) {
			for (int name = 0; name < separateName[person].length; name++) {
				for (int position = 0; position < separateName[person][name].length(); position++) {
					tempSum += separateName[person][name].charAt(position);
				}
			}

			if (maxSum < tempSum) {
				maxSum = tempSum;
				thePerson = person;
			}
			tempSum = 0;
		}

		// Print the chosen
		System.out.print("Избраният е ");
		System.out.println(String.join(" ", separateName[thePerson]));

	}

}
