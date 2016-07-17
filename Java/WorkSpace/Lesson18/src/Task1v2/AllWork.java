package Task1v2;

public class AllWork {
	public Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	private final int MAX_TASKS = 10;

	public AllWork() {
		this.freePlacesForTasks = this.MAX_TASKS;
		tasks = new Task[this.MAX_TASKS];
		this.currentUnassignedTask = 0;
	}

	public void addTask(Task task) {
		if (task != null) {
			if (task.getWorkingHours() <= 0) {
				System.out.println("Task " + task.getName() + " completed. Not added!");
			} else if (this.freePlacesForTasks > 0) {
				this.tasks[this.tasks.length - this.freePlacesForTasks--] = task;
				System.out.println("Task " + task.getName() + " : " + task.getWorkingHours() + "h. added.");
			} else {
				System.out.println("Task list is full!");
			}
		} else {
			System.out.println("Task can not be NULL!!!");
		}
	}

	public Task getNextTask() {
		if (this.currentUnassignedTask < this.tasks.length) {
			if (this.tasks[this.currentUnassignedTask] != null) {
				if (this.tasks[this.currentUnassignedTask].getWorkingHours() > 0) {
					return this.tasks[this.currentUnassignedTask++];
				} else {
					// System.out.println("Task 0h.");
					return null;
				}

			} else {
				// System.out.println("Task can not be null!");
				return null;
			}

		} else {
			// System.out.println("Array index.");
			return null;
		}

	}

	public boolean isAllWorkDone() {
		boolean result = true;
		for (Task task : this.tasks) {
			if (task != null && task.getWorkingHours() > 0) {
				result = false;
			}
		}
		return result;
	}

	public boolean existNextTask() {
		return this.currentUnassignedTask < this.tasks.length;
	}

}
