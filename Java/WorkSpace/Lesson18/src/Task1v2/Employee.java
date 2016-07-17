package Task1v2;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private AllWork allWork;
	private int hoursPerDay = 8;

	public Employee(String name) {
		this.setName(name);
		this.setHoursLeft(this.hoursPerDay);
	}

	public void work() {

		if (this.readyForWork()) {
			if (this.readyToGetANewTask() && this.allWork.existNextTask()) {
				this.setCurrentTask(this.allWork.getNextTask());

			}
			if (this.getHoursLeft() > this.getCurrentTask().getWorkingHours()) {
				this.setHoursLeft(this.getHoursLeft() - this.getCurrentTask().getWorkingHours());
				this.getCurrentTask().setWorkingHours(0);
				System.out.println(this.getCurrentTask().toString() + " DONE!");
				this.setCurrentTask(this.allWork.getNextTask());
			} else if (this.getHoursLeft() < this.getCurrentTask().getWorkingHours()) {
				this.getCurrentTask().setWorkingHours(this.getCurrentTask().getWorkingHours() - this.getHoursLeft());
				this.setHoursLeft(0);
				System.out.println(this.getName() + ": -I finished my work.");
			} else {
				this.setHoursLeft(0);
				this.getCurrentTask().setWorkingHours(0);
				System.out.println(this.getCurrentTask().toString() + " DONE!");
				System.out.println(this.getName() + ": -I finished my work.");
			}
			if (this.readyForWork() && this.allWork.existNextTask())
				this.work();
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
		} else {
			System.out.println("Name can not be empty!");
			this.name = "No name";
		}

	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public boolean readyToGetANewTask() {

		return this.readyForWork()
				&& (this.currentTask == null || (this.currentTask != null && this.currentTask.getWorkingHours() <= 0));
	}

	public boolean readyForWork() {
		return this.hoursLeft > 0;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			System.out.println(this.getName() + ": -I get " + currentTask.toString());
			this.currentTask = currentTask;
		} else {
			System.out.println("Task can not be null!");
		}
	}

	public int getHoursLeft() {
		return this.hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("Working hours can not be negative!");
			this.hoursLeft = 0;
		}
	}

	public void startWorkingDay() {
		System.out.println(this.getName() + ": -New day started.");
		this.hoursLeft = this.hoursPerDay;
	}

	public AllWork getAllWork() {
		return this.allWork;
	}

	public void setAllWork(AllWork allWork) {
		if (allWork != null) {
			this.allWork = allWork;
		} else {
			System.out.println("AllWork can not be null!");
		}
	}

}
