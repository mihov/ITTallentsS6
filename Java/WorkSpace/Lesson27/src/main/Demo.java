package main;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

	public static void main(String[] args) {
		WorkFlow wf = new WorkFlow();
		ArrayList<Worker> workerList = new ArrayList<>(5);
		TaskGenerator taskGen = new TaskGenerator(wf);
		PrintQuee pq = new PrintQuee(wf);
		pq.start();

		for (int i = 0; i < 5; i++) {
			workerList.add(new Worker(wf));
		}

		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.execute(taskGen);
		
		for (Worker worker : workerList) {
			executor.execute(worker);
		}

		
		executor.shutdown();
	}

}
