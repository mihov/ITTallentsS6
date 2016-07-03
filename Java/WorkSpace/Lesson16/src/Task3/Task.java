package Task3;

public class Task {
	private String name;
	private double workingHours;

	public Task(String name, double workingHours) {
		this.name = name;
		this.workingHours = workingHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		}

	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}

}
