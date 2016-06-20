
public class Task20 {

	public static void main(String[] args) {
		int element;
		for (int i = 1; i <= 10; i++) {
			element = i;
			for (int j = 1; j <= 10; j++) {
				if (element > 9) {
					element = 0;
				}
				System.out.print(element + " ");
				element++;

			}
			System.out.println();

		}

	}

}
