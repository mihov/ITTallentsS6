package main;

import java.util.Random;

public class TaskGenerator extends Thread {
	private WorkFlow wf;
	private Random rnd;

	public TaskGenerator(WorkFlow wf) {
		this.wf = wf;
		this.rnd = new Random();
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Eheeee...");
			}
			Task task = new Task(this.rnd.nextInt(10) + 5);
			this.wf.addTask(task);
			System.out.println(task + " added.");
		}
	}

}
