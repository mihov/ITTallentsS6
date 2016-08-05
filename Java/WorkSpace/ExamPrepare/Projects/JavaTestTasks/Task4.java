package JavaTestTasks;

public class Task4 {

	public static void main(String[] args) {
		String s = new String("Test String");
		String s1 = new String("Test ");
		s1 += "String";
		System.out.println(s);
		System.out.println(s1);
		if (s == s1) {
			System.out.println("The Strings are equals");
		}
	}

}
