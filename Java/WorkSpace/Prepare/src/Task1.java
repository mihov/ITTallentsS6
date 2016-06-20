import java.util.Scanner;

/*
 * 1: (25%) Write a program that reads the result of a coin toss from the console. The
possible inputs are �Heads� or �Tails�. The inputs are infinite. The program must stop
reading only if there are 5 consecutive �Heads� coin tosses.
 * */
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		do {
			System.out.print(counter + "Flip the coin[Heads,Tails]: ");
			String result = sc.nextLine();

			if (result.equals("Heads")) {
				counter++;
			} else {
				counter = 0;
			}
		} while (counter < 5);

		System.out.println("You did five Heads!!!");
	}
}
