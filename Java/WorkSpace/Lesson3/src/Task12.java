
public class Task12 {

	public static void main(String[] args) {
		int p0, p1, p2;

		for (int counter = 100; counter < 1000; counter++) {
			p0 = counter % 10;
			p1 = (counter / 10) % 10;
			p2 = (counter / 100) % 10;

			if (p0 == p1 || p0 == p2 || p1 == p2){
				continue;
			}

				System.out.println(counter);
		}

	}

}
