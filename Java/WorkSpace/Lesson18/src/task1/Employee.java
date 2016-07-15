package task1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private List<String> taskHistory;

	public Employee(String name) {

		this.setName(name);
		this.setHoursLeft(8);
		taskHistory = new ArrayList<String>();

	}

	public void work() {
		if (this.currentTask != null) {
			System.out.println(this.getName() + ": I'm working on " + this.getCurrentTask().toString());
			if (this.getHoursLeft() > this.getCurrentTask().getWorkingHours()) {
				this.setHoursLeft((this.getHoursLeft() - this.getCurrentTask().getWorkingHours()));
				this.getCurrentTask().setWorkingHours(0);
			} else if (this.getHoursLeft() < this.getCurrentTask().getWorkingHours()) {

				this.getCurrentTask().setWorkingHours(this.getCurrentTask().getWorkingHours() - this.getHoursLeft());
				this.setHoursLeft(0);
			} else {
				this.setHoursLeft(0);
				this.getCurrentTask().setWorkingHours(0);
			}
		}
	}

	public void showReport() {
		System.out.println("\n|    REPORT\t| Name\t| Time left\t|");
		System.out.printf("| Employee\t| %s\t| %.2f\t\t|\n", this.getName(), this.getHoursLeft());
		System.out.printf("| Task\t\t| %s\t| %.2f\t\t|\n", this.getCurrentTask().getName(),
				this.getCurrentTask().getWorkingHours());
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void showHystory() {
		int i = 1;
		System.out.println("\n===\t" + this.getName() + " history list\t===");
		for (String task : taskHistory) {
			System.out.print(i++ + ". ");
			System.out.println(task);
		}
		System.out.println("===\tEnd of " + this.getName() + " history list\t===");

	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			if (this.currentTask == null) {
				System.out.println(this.getName() + ": -I get " + currentTask.toString());
				this.currentTask = currentTask;
				this.taskHistory.add(currentTask.toString());
			} else {
				System.out.println(this.getName() + ": I'm busy now, I'm working on " + this.currentTask.getName());
			}
		} else {
			System.out.println("Task can not be NULL!");
		}
	}

	public Task returnTask() {
		// ???
		Task result = new Task("", 0);
		result = this.currentTask;
		this.currentTask = null;

		return result;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	public void startWorkingDay() {
		System.out.println(this.getName() + ": -I'm startinf new day.");
		this.setHoursLeft(8);
	}

}
