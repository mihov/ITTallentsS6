package JavaTestTasks;

public interface Itest1 {
	void method1();
	default void do123(String s){
		System.err.println(s + this.getClass().getName());
	}
}
