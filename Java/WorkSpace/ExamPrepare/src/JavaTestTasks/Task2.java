package JavaTestTasks;

public class Task2 {

	public static void main(String[] args) {
		for (int i = 10; i > -500000; i--) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.print(i + " ");
			if (i < 0)
				break;
		}
	}

}
