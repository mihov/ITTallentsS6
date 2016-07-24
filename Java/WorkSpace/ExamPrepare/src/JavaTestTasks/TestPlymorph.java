package JavaTestTasks;

import java.util.ArrayList;

public class TestPlymorph {

	public static void main(String[] args) {
		ArrayList<Itest1> list1 = new ArrayList<>();
		list1.add(new ClassA());
		list1.add(new ClassB());
		list1.add(new ClassC());
		list1.add(new ClassC());
		list1.add(new ClassC());
		list1.add(new ClassA());
		list1.add(new ClassB());
		for (Itest1 element : list1) {
			//element.do123("Hello ");
			element.method1();
		}
	}

}
