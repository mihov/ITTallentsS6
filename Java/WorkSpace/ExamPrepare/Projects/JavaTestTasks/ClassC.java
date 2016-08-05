package JavaTestTasks;

public class ClassC implements Itest1 {

	@Override
	public void method1() {
		System.out.println(this.getClass().getSimpleName());
		
	}

}
