package task1v1;

import java.util.ArrayDeque;

public class AllWork {

	// to set private
	public ArrayDeque<Task> tasks;
	private ArrayDeque<Task> completedTasks;
	private final int freePlacesForTasks;

	public AllWork() {
		this.freePlacesForTasks = 10;
		tasks = new ArrayDeque<Task>();
		completedTasks = new ArrayDeque<Task>();

	}

	public void addTask(Task task) {
		if (task != null) {
			if (task.getWorkingHours() <= 0) {
				completedTasks.add(task);
				System.out.println("Task " + task.getName() + " completed.");
			} else if (this.freePlacesForTasks > this.tasks.size()) {
				if (!this.tasks.contains(task)) {
					// this.tasks.push(task);
					this.tasks.add(task);
					System.out.println("Task " + task.getName() + " added.");
				} else {
					System.out.println("Task " + task.getName() + " already exist.");
				}
			} else {
				System.out.println("Task list is full!");
			}
		} else {
			System.out.println("Task can not be NULL!!!");
		}
	}

	public void addTaskAtTop(Task task) {
		if (task != null) {
			if (task.getWorkingHours() <= 0) {
				completedTasks.add(task);
				System.out.println("Task " + task.getName() + " completed.");
			} else if (this.freePlacesForTasks > this.tasks.size()) {
				if (!this.tasks.contains(task)) {
					this.tasks.push(task);
					// this.tasks.add(task);
					System.out.println("Task " + task.getName() + " added.");
				} else {
					System.out.println("Task " + task.getName() + " already exist.");
				}
			} else {
				System.out.println("Task list is full!");
			}
		} else {
			System.out.println("Task can not be NULL!!!");
		}
	}

	public Task getNextTask() {
		if (this.tasks.size() > 0) {
			return this.tasks.pop();
		} else
			return null;
	}

	public boolean isAllWorkDone() {
		boolean result = true;
		for (Task task : this.tasks) {
			if (task.getWorkingHours() > 0) {
				return false;
			}
		}
		return result;
	}

	public void printTasks() {
		System.out.println("==  Start Print all tasks	 ==");
		for (Task task : this.tasks) {
			System.out.println(task.toString());
		}
		System.out.println("==  End Print all tasks	 ==");
	}

}
