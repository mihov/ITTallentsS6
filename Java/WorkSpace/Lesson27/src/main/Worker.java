package main;

public class Worker extends Thread {

	private WorkFlow workFlow;

	public Worker(WorkFlow workFlow) {
		this.workFlow = workFlow;
	}

	@Override
	public void run() {
		if (this.workFlow.hasNext()) {
			Task task = this.workFlow.getTask();
			task.workOnTask();
			System.out.println("Wonk on " +task);
			this.workFlow.returnTask(task);
			this.run();
		}
	}
}
