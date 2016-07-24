package JavaTestTasks;

public class A {
	public  int x = 0;
	public int y;

	public A(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		A a1 = new A(2, 3);
		A a2 = new A(7, 9);
		System.out.println(a2.y++);
		a1.x += a2.y;
		System.out.println(a1.x);
		a2.y = --a1.y;
		System.out.println(a2.y);
	}
}