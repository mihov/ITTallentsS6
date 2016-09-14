package main;

public class A implements Runnable{
private volatile int age;


	public A(int age) {

	this.age = age;
}
	
	public void incAge(){
		this.age++;
	}
	
	


	@Override
	public void run() {
		
		
	}

}
