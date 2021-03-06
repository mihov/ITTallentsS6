package Task3;

public class Employee {
	private String name;
	private Task currentTask;
	private double hoursLeft;

	public Employee(String name) {

		this.setName(name);
		this.setHoursLeft(8);

	}

	public void work() {
		if (this.getHoursLeft() > this.getCurrentTask().getWorkingHours()) {
			this.setHoursLeft(this.getHoursLeft() - this.getCurrentTask().getWorkingHours());
			this.getCurrentTask().setWorkingHours(0);
		} else if (this.getHoursLeft() < this.getCurrentTask().getWorkingHours()) {

			this.getCurrentTask().setWorkingHours(this.getCurrentTask().getWorkingHours() - this.getHoursLeft());
			this.setHoursLeft(0);
		} else {
			this.setHoursLeft(0);
			this.getCurrentTask().setWorkingHours(0);
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

	public void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		this.currentTask = currentTask;
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}

}
