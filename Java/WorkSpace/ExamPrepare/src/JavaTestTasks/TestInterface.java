package JavaTestTasks;

public abstract class TestInterface implements Itest1 {
	public void method1() {
		System.err.println(this.getClass().getSimpleName());
	}
}
