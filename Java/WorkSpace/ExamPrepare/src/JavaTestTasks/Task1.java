package JavaTestTasks;

public class Task1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 10; i = i + 2) {
			sum += i;
		}
		System.out.println("The sum is: " + sum);
	}

}
