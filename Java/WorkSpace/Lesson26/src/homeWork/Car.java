package homeWork;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Car {

	private ArrayList<Runnable> carElements;
	static long creationTimeStart = 0;
	static long creationTimeEnd = 0;

	public Car() {
		this.carElements = new ArrayList<>(11);

		this.carElements.add(new Engine(7000));
		this.carElements.add(new Frame(5000));
		this.carElements.add(new Seat(3000));
		for (int i = 0; i < 4; i++) {
			this.carElements.add(new Seat(3000));
			this.carElements.add(new Tire(2000));
		}
	}

	public void buildCar() {

		ArrayList<Thread> threadList = new ArrayList<>(11);

		for (Runnable element : carElements) {
			threadList.add(new Thread(element));
		}

		ExecutorService pool = Executors.newFixedThreadPool(3);

		creationTimeStart = System.currentTimeMillis();

		for (Thread thread : threadList) {
			pool.execute(thread);
		}
		pool.shutdown();

		while (!pool.isTerminated()) {
		}

		creationTimeEnd = System.currentTimeMillis();
		System.out.println("Car was created for " + (creationTimeEnd - creationTimeStart) / 1000 + "s.");
	}
}
