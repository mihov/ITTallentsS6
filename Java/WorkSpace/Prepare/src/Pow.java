
public class Pow {

	public static void main(String[] args) {
		int x = 2;
		int y = 10;
		for (int i = 0; i < y; i++) {
			System.out.println(pow(x, i));
		}
	}

	private static int pow(int x, int y) {
		if (y == 0)
			return 1;
		if (y == 1)
			return x;
		return multiply(x, pow(x, y - 1));
	}

	static int multiply(int x, int y) {
		if (y == 1)
			return x;
		else
			return x + multiply(x, y - 1);
	}
}
