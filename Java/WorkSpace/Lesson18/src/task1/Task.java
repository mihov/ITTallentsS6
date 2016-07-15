package task1;

public class Task {
	private String name;
	private int workingHours;

	public Task(String name, int workingHours) {
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

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0) {
			this.workingHours = workingHours;
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("[Name: ");
		result.append(this.name);
		result.append("\tWH: ");
		result.append(this.getWorkingHours());
		result.append("h.]");
		return result.toString();
	}

}
