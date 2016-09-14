package main;

public class Task {
	private volatile int taskTime;
	private static int counter = 1;
	private String name;

	public Task(int taskTime) {
		this.name = "Task " + counter++;
		this.setTaskTime(taskTime);
	}

	public int getTaskTime() {
		return taskTime;
	}

	private void setTaskTime(int taskTime) {
		this.taskTime = taskTime;
	}

	public void workOnTask() {
		this.taskTime--;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return name + " : "+ taskTime;
	}
	
	
}
