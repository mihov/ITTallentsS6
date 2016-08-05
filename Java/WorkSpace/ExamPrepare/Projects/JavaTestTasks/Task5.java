package JavaTestTasks;

public class Task5 {

	public static void main(String[] args) {
		String s = new String("Some String");
		String s1 = s;
		s1 = s1 + " some text";
		s.toUpperCase();
		System.out.println(s);
		System.out.println(s1);
	}

}
