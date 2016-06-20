/*
 * Да се състави метод, който приема за стойност число N и връща
стойността на N! (N факториел).
„
 * */
public class Task14 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(nFac(i));
		}

	}

	static int nFac(int n) {
		if (n == 1) {
			return 1;
		} else if (n < 1) {
			return 0;
		} else {
			return n * nFac(n - 1);
		}
	}

}
